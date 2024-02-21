///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package notarius.controllers;
//
//import java.io.Serializable;
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Query;
//import javax.persistence.EntityNotFoundException;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;
//import notarius.controllers.exceptions.NonexistentEntityException;
//import notarius.models.Calificacion;
//import notarius.models.Estudiante;
//
///**
// *
// * @author antho
// */
//public class CalificacionJpaController implements Serializable {
//
//    public CalificacionJpaController(EntityManagerFactory emf) {
//        this.emf = emf;
//    }
//    private EntityManagerFactory emf = null;
//
//    public EntityManager getEntityManager() {
//        return emf.createEntityManager();
//    }
//
//    public void create(Calificacion calificacion) {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            em.persist(calificacion);
//            em.getTransaction().commit();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public void edit(Calificacion calificacion) throws NonexistentEntityException, Exception {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            calificacion = em.merge(calificacion);
//            em.getTransaction().commit();
//        } catch (Exception ex) {
//            String msg = ex.getLocalizedMessage();
//            if (msg == null || msg.length() == 0) {
//                Estudiante id = calificacion.getIdEstudiante();
//                if (findCalificacion(id) == null) {
//                    throw new NonexistentEntityException("The calificacion with id " + id + " no longer exists.");
//                }
//            }
//            throw ex;
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public void destroy(Estudiante id) throws NonexistentEntityException {
//        EntityManager em = null;
//        try {
//            em = getEntityManager();
//            em.getTransaction().begin();
//            Calificacion calificacion;
//            try {
//                calificacion = em.getReference(Calificacion.class, id);
//                calificacion.getIdEstudiante();
//            } catch (EntityNotFoundException enfe) {
//                throw new NonexistentEntityException("The calificacion with id " + id + " no longer exists.", enfe);
//            }
//            em.remove(calificacion);
//            em.getTransaction().commit();
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }
//    }
//
//    public List<Calificacion> findCalificacionEntities() {
//        return findCalificacionEntities(true, -1, -1);
//    }
//
//    public List<Calificacion> findCalificacionEntities(int maxResults, int firstResult) {
//        return findCalificacionEntities(false, maxResults, firstResult);
//    }
//
//    private List<Calificacion> findCalificacionEntities(boolean all, int maxResults, int firstResult) {
//        EntityManager em = getEntityManager();
//        try {
//            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//            cq.select(cq.from(Calificacion.class));
//            Query q = em.createQuery(cq);
//            if (!all) {
//                q.setMaxResults(maxResults);
//                q.setFirstResult(firstResult);
//            }
//            return q.getResultList();
//        } finally {
//            em.close();
//        }
//    }
//
//    public Calificacion findCalificacion(Estudiante id) {
//        EntityManager em = getEntityManager();
//        try {
//            return em.find(Calificacion.class, id);
//        } finally {
//            em.close();
//        }
//    }
//
//    public int getCalificacionCount() {
//        EntityManager em = getEntityManager();
//        try {
//            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
//            Root<Calificacion> rt = cq.from(Calificacion.class);
//            cq.select(em.getCriteriaBuilder().count(rt));
//            Query q = em.createQuery(cq);
//            return ((Long) q.getSingleResult()).intValue();
//        } finally {
//            em.close();
//        }
//    }
//    
//}
