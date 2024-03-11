/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.controllers.persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Calificacion;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Seccion;


public class CalificacionJpaController implements Serializable {

    public CalificacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    public CalificacionJpaController () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Calificacion calificacion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante estudiante = calificacion.getEstudiante();
            if (estudiante != null) {
                estudiante = em.getReference(estudiante.getClass(), estudiante.getId());
                calificacion.setEstudiante(estudiante);
            }
            Seccion seccion = calificacion.getSeccion();
            if (seccion != null) {
                seccion = em.getReference(seccion.getClass(), seccion.getId());
                calificacion.setSeccion(seccion);
            }
            em.persist(calificacion);
            if (estudiante != null) {
                estudiante.getCalificaciones().add(calificacion);
                estudiante = em.merge(estudiante);
            }
            if (seccion != null) {
                seccion.getCalificaciones().add(calificacion);
                seccion = em.merge(seccion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Calificacion calificacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Calificacion persistentCalificacion = em.find(Calificacion.class, calificacion.getId());
            Estudiante estudianteOld = persistentCalificacion.getEstudiante();
            Estudiante estudianteNew = calificacion.getEstudiante();
            Seccion seccionOld = persistentCalificacion.getSeccion();
            Seccion seccionNew = calificacion.getSeccion();
            if (estudianteNew != null) {
                estudianteNew = em.getReference(estudianteNew.getClass(), estudianteNew.getId());
                calificacion.setEstudiante(estudianteNew);
            }
            if (seccionNew != null) {
                seccionNew = em.getReference(seccionNew.getClass(), seccionNew.getId());
                calificacion.setSeccion(seccionNew);
            }
            calificacion = em.merge(calificacion);
            if (estudianteOld != null && !estudianteOld.equals(estudianteNew)) {
                estudianteOld.getCalificaciones().remove(calificacion);
                estudianteOld = em.merge(estudianteOld);
            }
            if (estudianteNew != null && !estudianteNew.equals(estudianteOld)) {
                estudianteNew.getCalificaciones().add(calificacion);
                estudianteNew = em.merge(estudianteNew);
            }
            if (seccionOld != null && !seccionOld.equals(seccionNew)) {
                seccionOld.getCalificaciones().remove(calificacion);
                seccionOld = em.merge(seccionOld);
            }
            if (seccionNew != null && !seccionNew.equals(seccionOld)) {
                seccionNew.getCalificaciones().add(calificacion);
                seccionNew = em.merge(seccionNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = calificacion.getId();
                if (findCalificacion(id) == null) {
                    throw new NonexistentEntityException("The calificacion with id " + id + " no longer exists.");
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
            Calificacion calificacion;
            try {
                calificacion = em.getReference(Calificacion.class, id);
                calificacion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The calificacion with id " + id + " no longer exists.", enfe);
            }
            Estudiante estudiante = calificacion.getEstudiante();
            if (estudiante != null) {
                estudiante.getCalificaciones().remove(calificacion);
                estudiante = em.merge(estudiante);
            }
            Seccion seccion = calificacion.getSeccion();
            if (seccion != null) {
                seccion.getCalificaciones().remove(calificacion);
                seccion = em.merge(seccion);
            }
            em.remove(calificacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Calificacion> findCalificacionEntities() {
        return findCalificacionEntities(true, -1, -1);
    }

    public List<Calificacion> findCalificacionEntities(int maxResults, int firstResult) {
        return findCalificacionEntities(false, maxResults, firstResult);
    }

    private List<Calificacion> findCalificacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Calificacion.class));
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

    public Calificacion findCalificacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Calificacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getCalificacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Calificacion> rt = cq.from(Calificacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
