/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.controllers;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import notarius.models.Decanato;
import notarius.models.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Carrera;

/**
 *
 * @author antho
 */
public class CarreraJpaController implements Serializable {

    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

  
    
    

    public void create(Carrera carrera) {
        if (carrera.getMaterias() == null) {
            carrera.setMaterias(new ArrayList<Materia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Decanato decanato = carrera.getDecanato();
            if (decanato != null) {
                decanato = em.getReference(decanato.getClass(), decanato.getId());
                carrera.setDecanato(decanato);
            }
            List<Materia> attachedMaterias = new ArrayList<Materia>();
            for (Materia materiasMateriaToAttach : carrera.getMaterias()) {
                materiasMateriaToAttach = em.getReference(materiasMateriaToAttach.getClass(), materiasMateriaToAttach.getId());
                attachedMaterias.add(materiasMateriaToAttach);
            }
            carrera.setMaterias(attachedMaterias);
            em.persist(carrera);
            if (decanato != null) {
                decanato.getCarreras().add(carrera);
                decanato = em.merge(decanato);
            }
            for (Materia materiasMateria : carrera.getMaterias()) {
                materiasMateria.getCarreras().add(carrera);
                materiasMateria = em.merge(materiasMateria);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carrera carrera) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carrera persistentCarrera = em.find(Carrera.class, carrera.getId());
            Decanato decanatoOld = persistentCarrera.getDecanato();
            Decanato decanatoNew = carrera.getDecanato();
            List<Materia> materiasOld = persistentCarrera.getMaterias();
            List<Materia> materiasNew = carrera.getMaterias();
            if (decanatoNew != null) {
                decanatoNew = em.getReference(decanatoNew.getClass(), decanatoNew.getId());
                carrera.setDecanato(decanatoNew);
            }
            List<Materia> attachedMateriasNew = new ArrayList<Materia>();
            for (Materia materiasNewMateriaToAttach : materiasNew) {
                materiasNewMateriaToAttach = em.getReference(materiasNewMateriaToAttach.getClass(), materiasNewMateriaToAttach.getId());
                attachedMateriasNew.add(materiasNewMateriaToAttach);
            }
            materiasNew = attachedMateriasNew;
            carrera.setMaterias(materiasNew);
            carrera = em.merge(carrera);
            if (decanatoOld != null && !decanatoOld.equals(decanatoNew)) {
                decanatoOld.getCarreras().remove(carrera);
                decanatoOld = em.merge(decanatoOld);
            }
            if (decanatoNew != null && !decanatoNew.equals(decanatoOld)) {
                decanatoNew.getCarreras().add(carrera);
                decanatoNew = em.merge(decanatoNew);
            }
            for (Materia materiasOldMateria : materiasOld) {
                if (!materiasNew.contains(materiasOldMateria)) {
                    materiasOldMateria.getCarreras().remove(carrera);
                    materiasOldMateria = em.merge(materiasOldMateria);
                }
            }
            for (Materia materiasNewMateria : materiasNew) {
                if (!materiasOld.contains(materiasNewMateria)) {
                    materiasNewMateria.getCarreras().add(carrera);
                    materiasNewMateria = em.merge(materiasNewMateria);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = carrera.getId();
                if (findCarrera(id) == null) {
                    throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.");
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
            Carrera carrera;
            try {
                carrera = em.getReference(Carrera.class, id);
                carrera.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carrera with id " + id + " no longer exists.", enfe);
            }
            Decanato decanato = carrera.getDecanato();
            if (decanato != null) {
                decanato.getCarreras().remove(carrera);
                decanato = em.merge(decanato);
            }
            List<Materia> materias = carrera.getMaterias();
            for (Materia materiasMateria : materias) {
                materiasMateria.getCarreras().remove(carrera);
                materiasMateria = em.merge(materiasMateria);
            }
            em.remove(carrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carrera> findCarreraEntities() {
        return findCarreraEntities(true, -1, -1);
    }

    public List<Carrera> findCarreraEntities(int maxResults, int firstResult) {
        return findCarreraEntities(false, maxResults, firstResult);
    }

    private List<Carrera> findCarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carrera.class));
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

    public Carrera findCarrera(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carrera.class, id);
        } finally {
            em.close();
        }
    }

    public int getCarreraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carrera> rt = cq.from(Carrera.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
