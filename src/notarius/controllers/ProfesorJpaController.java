/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notarius.controllers;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import notarius.models.Seccion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Profesor;

/**
 *
 * @author antho
 */
public class ProfesorJpaController implements Serializable {

    public ProfesorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Profesor profesor) {
        if (profesor.getSecciones() == null) {
            profesor.setSecciones(new ArrayList<Seccion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Seccion> attachedSecciones = new ArrayList<Seccion>();
            for (Seccion seccionesSeccionToAttach : profesor.getSecciones()) {
                seccionesSeccionToAttach = em.getReference(seccionesSeccionToAttach.getClass(), seccionesSeccionToAttach.getId());
                attachedSecciones.add(seccionesSeccionToAttach);
            }
            profesor.setSecciones(attachedSecciones);
            em.persist(profesor);
            for (Seccion seccionesSeccion : profesor.getSecciones()) {
                Profesor oldProfesorOfSeccionesSeccion = seccionesSeccion.getProfesor();
                seccionesSeccion.setProfesor(profesor);
                seccionesSeccion = em.merge(seccionesSeccion);
                if (oldProfesorOfSeccionesSeccion != null) {
                    oldProfesorOfSeccionesSeccion.getSecciones().remove(seccionesSeccion);
                    oldProfesorOfSeccionesSeccion = em.merge(oldProfesorOfSeccionesSeccion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Profesor profesor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Profesor persistentProfesor = em.find(Profesor.class, profesor.getId());
            List<Seccion> seccionesOld = persistentProfesor.getSecciones();
            List<Seccion> seccionesNew = profesor.getSecciones();
            List<Seccion> attachedSeccionesNew = new ArrayList<Seccion>();
            for (Seccion seccionesNewSeccionToAttach : seccionesNew) {
                seccionesNewSeccionToAttach = em.getReference(seccionesNewSeccionToAttach.getClass(), seccionesNewSeccionToAttach.getId());
                attachedSeccionesNew.add(seccionesNewSeccionToAttach);
            }
            seccionesNew = attachedSeccionesNew;
            profesor.setSecciones(seccionesNew);
            profesor = em.merge(profesor);
            for (Seccion seccionesOldSeccion : seccionesOld) {
                if (!seccionesNew.contains(seccionesOldSeccion)) {
                    seccionesOldSeccion.setProfesor(null);
                    seccionesOldSeccion = em.merge(seccionesOldSeccion);
                }
            }
            for (Seccion seccionesNewSeccion : seccionesNew) {
                if (!seccionesOld.contains(seccionesNewSeccion)) {
                    Profesor oldProfesorOfSeccionesNewSeccion = seccionesNewSeccion.getProfesor();
                    seccionesNewSeccion.setProfesor(profesor);
                    seccionesNewSeccion = em.merge(seccionesNewSeccion);
                    if (oldProfesorOfSeccionesNewSeccion != null && !oldProfesorOfSeccionesNewSeccion.equals(profesor)) {
                        oldProfesorOfSeccionesNewSeccion.getSecciones().remove(seccionesNewSeccion);
                        oldProfesorOfSeccionesNewSeccion = em.merge(oldProfesorOfSeccionesNewSeccion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = profesor.getId();
                if (findProfesor(id) == null) {
                    throw new NonexistentEntityException("The profesor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Profesor profesor;
            try {
                profesor = em.getReference(Profesor.class, id);
                profesor.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The profesor with id " + id + " no longer exists.", enfe);
            }
            List<Seccion> secciones = profesor.getSecciones();
            for (Seccion seccionesSeccion : secciones) {
                seccionesSeccion.setProfesor(null);
                seccionesSeccion = em.merge(seccionesSeccion);
            }
            em.remove(profesor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Profesor> findProfesorEntities() {
        return findProfesorEntities(true, -1, -1);
    }

    public List<Profesor> findProfesorEntities(int maxResults, int firstResult) {
        return findProfesorEntities(false, maxResults, firstResult);
    }

    private List<Profesor> findProfesorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Profesor.class));
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

    public Profesor findProfesor(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Profesor.class, id);
        } finally {
            em.close();
        }
    }

    public int getProfesorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Profesor> rt = cq.from(Profesor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
