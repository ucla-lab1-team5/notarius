/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notarius.controllers;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Decanato;

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

    public void create(Decanato dec) {
        EntityManager em = null;

        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(dec);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();

            }
        }
    }

    public void edit(Decanato dec) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(dec);
            em.getTransaction().commit();

        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = dec.getId();
                if (findDecanato(id) == null) {
                    throw new NonexistentEntityException("El decanato con el id " + id + " no existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Decanato findDecanato(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Decanato.class, id);
        } finally {
            em.close();
        }
    }

}
