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
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ucla.lab.notarius.models.Seccion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Materia;

/**
 *
 * @author antho
 */
public class MateriaService implements Serializable {

    public MateriaService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public MateriaService () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Materia materia) {
        if (materia.getSecciones() == null) {
            materia.setSecciones(new ArrayList<Seccion>());
        }
        if (materia.getCarreras() == null) {
            materia.setCarreras(new ArrayList<Carrera>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Seccion> attachedSecciones = new ArrayList<Seccion>();
            for (Seccion seccionesSeccionToAttach : materia.getSecciones()) {
                seccionesSeccionToAttach = em.getReference(seccionesSeccionToAttach.getClass(), seccionesSeccionToAttach.getId());
                attachedSecciones.add(seccionesSeccionToAttach);
            }
            materia.setSecciones(attachedSecciones);
            List<Carrera> attachedCarreras = new ArrayList<Carrera>();
            for (Carrera carrerasCarreraToAttach : materia.getCarreras()) {
                carrerasCarreraToAttach = em.getReference(carrerasCarreraToAttach.getClass(), carrerasCarreraToAttach.getId());
                attachedCarreras.add(carrerasCarreraToAttach);
            }
            materia.setCarreras(attachedCarreras);
            em.persist(materia);
            for (Seccion seccionesSeccion : materia.getSecciones()) {
                Materia oldMateriaOfSeccionesSeccion = seccionesSeccion.getMateria();
                seccionesSeccion.setMateria(materia);
                seccionesSeccion = em.merge(seccionesSeccion);
                if (oldMateriaOfSeccionesSeccion != null) {
                    oldMateriaOfSeccionesSeccion.getSecciones().remove(seccionesSeccion);
                    oldMateriaOfSeccionesSeccion = em.merge(oldMateriaOfSeccionesSeccion);
                }
            }
            for (Carrera carrerasCarrera : materia.getCarreras()) {
                carrerasCarrera.getMaterias().add(materia);
                carrerasCarrera = em.merge(carrerasCarrera);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }








    
    public void edit(Materia materia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Materia persistentMateria = em.find(Materia.class, materia.getId());
            List<Seccion> seccionesOld = persistentMateria.getSecciones();
            List<Seccion> seccionesNew = materia.getSecciones();
            List<Carrera> carrerasOld = persistentMateria.getCarreras();
            List<Carrera> carrerasNew = materia.getCarreras();
            List<Seccion> attachedSeccionesNew = new ArrayList<Seccion>();
            for (Seccion seccionesNewSeccionToAttach : seccionesNew) {
                seccionesNewSeccionToAttach = em.getReference(seccionesNewSeccionToAttach.getClass(), seccionesNewSeccionToAttach.getId());
                attachedSeccionesNew.add(seccionesNewSeccionToAttach);
            }
            seccionesNew = attachedSeccionesNew;
            materia.setSecciones(seccionesNew);
            List<Carrera> attachedCarrerasNew = new ArrayList<Carrera>();
            for (Carrera carrerasNewCarreraToAttach : carrerasNew) {
                carrerasNewCarreraToAttach = em.getReference(carrerasNewCarreraToAttach.getClass(), carrerasNewCarreraToAttach.getId());
                attachedCarrerasNew.add(carrerasNewCarreraToAttach);
            }
            carrerasNew = attachedCarrerasNew;
            materia.setCarreras(carrerasNew);
            materia = em.merge(materia);
            for (Seccion seccionesOldSeccion : seccionesOld) {
                if (!seccionesNew.contains(seccionesOldSeccion)) {
                    seccionesOldSeccion.setMateria(null);
                    seccionesOldSeccion = em.merge(seccionesOldSeccion);
                }
            }
            for (Seccion seccionesNewSeccion : seccionesNew) {
                if (!seccionesOld.contains(seccionesNewSeccion)) {
                    Materia oldMateriaOfSeccionesNewSeccion = seccionesNewSeccion.getMateria();
                    seccionesNewSeccion.setMateria(materia);
                    seccionesNewSeccion = em.merge(seccionesNewSeccion);
                    if (oldMateriaOfSeccionesNewSeccion != null && !oldMateriaOfSeccionesNewSeccion.equals(materia)) {
                        oldMateriaOfSeccionesNewSeccion.getSecciones().remove(seccionesNewSeccion);
                        oldMateriaOfSeccionesNewSeccion = em.merge(oldMateriaOfSeccionesNewSeccion);
                    }
                }
            }
            for (Carrera carrerasOldCarrera : carrerasOld) {
                if (!carrerasNew.contains(carrerasOldCarrera)) {
                    carrerasOldCarrera.getMaterias().remove(materia);
                    carrerasOldCarrera = em.merge(carrerasOldCarrera);
                }
            }
            for (Carrera carrerasNewCarrera : carrerasNew) {
                if (!carrerasOld.contains(carrerasNewCarrera)) {
                    carrerasNewCarrera.getMaterias().add(materia);
                    carrerasNewCarrera = em.merge(carrerasNewCarrera);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = materia.getId();
                if (findMateria(id) == null) {
                    throw new NonexistentEntityException("The materia with id " + id + " no longer exists.");
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
            Materia materia;
            try {
                materia = em.getReference(Materia.class, id);
                materia.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The materia with id " + id + " no longer exists.", enfe);
            }
            List<Seccion> secciones = materia.getSecciones();
            for (Seccion seccionesSeccion : secciones) {
                seccionesSeccion.setMateria(null);
                seccionesSeccion = em.merge(seccionesSeccion);
            }
            List<Carrera> carreras = materia.getCarreras();
            for (Carrera carrerasCarrera : carreras) {
                carrerasCarrera.getMaterias().remove(materia);
                carrerasCarrera = em.merge(carrerasCarrera);
            }
            em.remove(materia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Materia> findMateriaEntities() {
        return findMateriaEntities(true, -1, -1);
    }

    public List<Materia> findMateriaEntities(int maxResults, int firstResult) {
        return findMateriaEntities(false, maxResults, firstResult);
    }

    private List<Materia> findMateriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Materia.class));
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

    public Materia findMateria(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Materia.class, id);
        } finally {
            em.close();
        }
    }

    public int getMateriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Materia> rt = cq.from(Materia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
