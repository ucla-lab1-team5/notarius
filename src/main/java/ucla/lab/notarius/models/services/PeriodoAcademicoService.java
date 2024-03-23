/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models.services;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.sessions.Project;

import ucla.lab.notarius.models.Seccion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.PeriodoAcademico;

/**
 *
 * @author antho
 */
public class PeriodoAcademicoService implements Serializable {

    public PeriodoAcademicoService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public PeriodoAcademicoService () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PeriodoAcademico periodoAcademico) {
        if (periodoAcademico.getSecciones() == null) {
            periodoAcademico.setSecciones(new ArrayList<Seccion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Seccion> attachedSecciones = new ArrayList<Seccion>();
            for (Seccion seccionesSeccionToAttach : periodoAcademico.getSecciones()) {
                seccionesSeccionToAttach = em.getReference(seccionesSeccionToAttach.getClass(), seccionesSeccionToAttach.getId());
                attachedSecciones.add(seccionesSeccionToAttach);
            }
            periodoAcademico.setSecciones(attachedSecciones);
            em.persist(periodoAcademico);
            for (Seccion seccionesSeccion : periodoAcademico.getSecciones()) {
                PeriodoAcademico oldPeriodoOfSeccionesSeccion = seccionesSeccion.getPeriodo();
                seccionesSeccion.setPeriodo(periodoAcademico);
                seccionesSeccion = em.merge(seccionesSeccion);
                if (oldPeriodoOfSeccionesSeccion != null) {
                    oldPeriodoOfSeccionesSeccion.getSecciones().remove(seccionesSeccion);
                    oldPeriodoOfSeccionesSeccion = em.merge(oldPeriodoOfSeccionesSeccion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PeriodoAcademico periodoAcademico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PeriodoAcademico persistentPeriodoAcademico = em.find(PeriodoAcademico.class, periodoAcademico.getId());
            List<Seccion> seccionesOld = persistentPeriodoAcademico.getSecciones();
            List<Seccion> seccionesNew = periodoAcademico.getSecciones();
            List<Seccion> attachedSeccionesNew = new ArrayList<Seccion>();
            for (Seccion seccionesNewSeccionToAttach : seccionesNew) {
                seccionesNewSeccionToAttach = em.getReference(seccionesNewSeccionToAttach.getClass(), seccionesNewSeccionToAttach.getId());
                attachedSeccionesNew.add(seccionesNewSeccionToAttach);
            }
            seccionesNew = attachedSeccionesNew;
            periodoAcademico.setSecciones(seccionesNew);
            periodoAcademico = em.merge(periodoAcademico);
            for (Seccion seccionesOldSeccion : seccionesOld) {
                if (!seccionesNew.contains(seccionesOldSeccion)) {
                    seccionesOldSeccion.setPeriodo(null);
                    seccionesOldSeccion = em.merge(seccionesOldSeccion);
                }
            }
            for (Seccion seccionesNewSeccion : seccionesNew) {
                if (!seccionesOld.contains(seccionesNewSeccion)) {
                    PeriodoAcademico oldPeriodoOfSeccionesNewSeccion = seccionesNewSeccion.getPeriodo();
                    seccionesNewSeccion.setPeriodo(periodoAcademico);
                    seccionesNewSeccion = em.merge(seccionesNewSeccion);
                    if (oldPeriodoOfSeccionesNewSeccion != null && !oldPeriodoOfSeccionesNewSeccion.equals(periodoAcademico)) {
                        oldPeriodoOfSeccionesNewSeccion.getSecciones().remove(seccionesNewSeccion);
                        oldPeriodoOfSeccionesNewSeccion = em.merge(oldPeriodoOfSeccionesNewSeccion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = periodoAcademico.getId();
                if (findPeriodoAcademico(id) == null) {
                    throw new NonexistentEntityException("The periodoAcademico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PeriodoAcademico periodoAcademico;
            try {
                periodoAcademico = em.getReference(PeriodoAcademico.class, id);
                periodoAcademico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The periodoAcademico with id " + id + " no longer exists.", enfe);
            }
            List<Seccion> secciones = periodoAcademico.getSecciones();
            for (Seccion seccionesSeccion : secciones) {
                seccionesSeccion.setPeriodo(null);
                seccionesSeccion = em.merge(seccionesSeccion);
            }
            em.remove(periodoAcademico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PeriodoAcademico> findPeriodoAcademicoEntities() {
        return findPeriodoAcademicoEntities(true, -1, -1);
    }

    public List<PeriodoAcademico> findPeriodoAcademicoEntities(int maxResults, int firstResult) {
        return findPeriodoAcademicoEntities(false, maxResults, firstResult);
    }

    private List<PeriodoAcademico> findPeriodoAcademicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PeriodoAcademico.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public PeriodoAcademico findPeriodoAcademico(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PeriodoAcademico.class, id);
        } finally {
            em.close();
        }
    }

    public PeriodoAcademico findLastPeriodo() {
        EntityManager em = getEntityManager();
        PeriodoAcademico lastPeriodo = new PeriodoAcademico();
        try {
            lastPeriodo = (PeriodoAcademico)em.createQuery("SELECT OBJECT(p) FROM PeriodoAcademico p order by p.fechaInicio desc").setMaxResults(1).getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {em.close();}
        return lastPeriodo;
    }

    public PeriodoAcademico findByCodigo(String codigo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            PeriodoAcademico periodoCodigo = (PeriodoAcademico)em.createQuery("SELECT OBJECT(p) FROM PeriodoAcademico p where p.codigo= :codigo").setParameter("codigo", codigo).setMaxResults(1).getSingleResult();
            return periodoCodigo;
        } finally {
            em.close();
        }
       

    }

    public int getPeriodoAcademicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PeriodoAcademico> rt = cq.from(PeriodoAcademico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
