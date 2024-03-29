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
import ucla.lab.notarius.models.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Decanato;

/**
 *
 * @author antho
 */
public class DecanatoService implements Serializable {

    public DecanatoService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public DecanatoService () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Decanato decanato) {
        if (decanato.getCarreras() == null) {
            decanato.setCarreras(new ArrayList<Carrera>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Carrera> attachedCarreras = new ArrayList<Carrera>();
            for (Carrera carrerasCarreraToAttach : decanato.getCarreras()) {
                carrerasCarreraToAttach = em.getReference(carrerasCarreraToAttach.getClass(), carrerasCarreraToAttach.getId());
                attachedCarreras.add(carrerasCarreraToAttach);
            }
            decanato.setCarreras(attachedCarreras);
            em.persist(decanato);
            for (Carrera carrerasCarrera : decanato.getCarreras()) {
                Decanato oldDecanatoOfCarrerasCarrera = carrerasCarrera.getDecanato();
                carrerasCarrera.setDecanato(decanato);
                carrerasCarrera = em.merge(carrerasCarrera);
                if (oldDecanatoOfCarrerasCarrera != null) {
                    oldDecanatoOfCarrerasCarrera.getCarreras().remove(carrerasCarrera);
                    oldDecanatoOfCarrerasCarrera = em.merge(oldDecanatoOfCarrerasCarrera);
                }
            }
            System.out.println("Decanato agregado");
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Decanato decanato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            //Decanato persistentDecanato = em.find(Decanato.class, decanato.getId());
            decanato = em.merge(decanato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = decanato.getId();
                if (findDecanato(id) == null) {
                    throw new NonexistentEntityException("The decanato with id " + id + " no longer exists.");
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
            Decanato decanato;
            try {
                decanato = em.getReference(Decanato.class, id);
                decanato.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The decanato with id " + id + " no longer exists.", enfe);
            }
            List<Carrera> carreras = decanato.getCarreras();
            for (Carrera carrerasCarrera : carreras) {
                carrerasCarrera.setDecanato(null);
                carrerasCarrera = em.merge(carrerasCarrera);
            }
            em.remove(decanato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Decanato> findDecanatoEntities() {
        return findDecanatoEntities(true, -1, -1);
    }

    public List<Decanato> findDecanatoEntities(int maxResults, int firstResult) {
        return findDecanatoEntities(false, maxResults, firstResult);
    }

    private List<Decanato> findDecanatoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Decanato.class));
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

    public Decanato findDecanato(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Decanato.class, id);
        } finally {
            em.close();
        }
    }

    public int getDecanatoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Decanato> rt = cq.from(Decanato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
