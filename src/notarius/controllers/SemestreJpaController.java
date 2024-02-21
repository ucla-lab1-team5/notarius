
package notarius.controllers;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Semestre;


public class SemestreJpaController implements Serializable {

    public SemestreJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public SemestreJpaController() {
        emf = Persistence.createEntityManagerFactory("notariusPU");
    }
    
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Semestre semestre) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(semestre);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Semestre semestre) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            semestre = em.merge(semestre);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = semestre.getId();
                if (findSemestre(id) == null) {
                    throw new NonexistentEntityException("The semestre with id " + id + " no longer exists.");
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
            Semestre semestre;
            try {
                semestre = em.getReference(Semestre.class, id);
                semestre.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The semestre with id " + id + " no longer exists.", enfe);
            }
            em.remove(semestre);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Semestre> findSemestreEntities() {
        return findSemestreEntities(true, -1, -1);
    }

    public List<Semestre> findSemestreEntities(int maxResults, int firstResult) {
        return findSemestreEntities(false, maxResults, firstResult);
    }

    private List<Semestre> findSemestreEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Semestre.class));
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

    public Semestre findSemestre(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Semestre.class, id);
        } finally {
            em.close();
        }
    }

    public int getSemestreCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Semestre> rt = cq.from(Semestre.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
