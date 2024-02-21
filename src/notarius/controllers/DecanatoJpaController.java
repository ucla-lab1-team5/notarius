/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import notarius.models.Decanato;

/**
 *
 * @author antho
 */
public class DecanatoJpaController implements Serializable {

    public DecanatoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DecanatoJpaController() {
        emf = Persistence.createEntityManagerFactory("notariusPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Decanato decanato) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(decanato);
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
            decanato = em.merge(decanato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = decanato.getIdDecanato();
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
                decanato.getIdDecanato();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The decanato with id " + id + " no longer exists.", enfe);
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
