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
import notarius.models.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Materia;

/**
 *
 * @author antho
 */
public class MateriaJpaController implements Serializable {

    public MateriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Materia materia) {
        if (materia.getCarreras() == null) {
            materia.setCarreras(new ArrayList<Carrera>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Carrera> attachedCarreras = new ArrayList<Carrera>();
            for (Carrera carrerasCarreraToAttach : materia.getCarreras()) {
                carrerasCarreraToAttach = em.getReference(carrerasCarreraToAttach.getClass(), carrerasCarreraToAttach.getId());
                attachedCarreras.add(carrerasCarreraToAttach);
            }
            materia.setCarreras(attachedCarreras);
            em.persist(materia);
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
            List<Carrera> carrerasOld = persistentMateria.getCarreras();
            List<Carrera> carrerasNew = materia.getCarreras();
            List<Carrera> attachedCarrerasNew = new ArrayList<Carrera>();
            for (Carrera carrerasNewCarreraToAttach : carrerasNew) {
                carrerasNewCarreraToAttach = em.getReference(carrerasNewCarreraToAttach.getClass(), carrerasNewCarreraToAttach.getId());
                attachedCarrerasNew.add(carrerasNewCarreraToAttach);
            }
            carrerasNew = attachedCarrerasNew;
            materia.setCarreras(carrerasNew);
            materia = em.merge(materia);
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
                Long id = materia.getId();
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

    public void destroy(Long id) throws NonexistentEntityException {
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

    public Materia findMateria(Long id) {
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
