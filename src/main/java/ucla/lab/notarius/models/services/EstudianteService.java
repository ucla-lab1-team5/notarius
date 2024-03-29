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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ucla.lab.notarius.models.Calificacion;
import ucla.lab.notarius.models.Carrera;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.Seccion;

/**
 *
 * @author antho
 */
public class EstudianteService implements Serializable {

    public EstudianteService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EstudianteService () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudiante estudiante) {
        if (estudiante.getCalificaciones() == null) {
            estudiante.setCalificaciones(new ArrayList<Calificacion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Calificacion> attachedCalificaciones = new ArrayList<Calificacion>();
            for (Calificacion calificacionesCalificacionToAttach : estudiante.getCalificaciones()) {
                calificacionesCalificacionToAttach = em.getReference(calificacionesCalificacionToAttach.getClass(), calificacionesCalificacionToAttach.getId());
                attachedCalificaciones.add(calificacionesCalificacionToAttach);
            }
            estudiante.setCalificaciones(attachedCalificaciones);
            em.persist(estudiante);
            for (Calificacion calificacionesCalificacion : estudiante.getCalificaciones()) {
                Estudiante oldEstudianteOfCalificacionesCalificacion = calificacionesCalificacion.getEstudiante();
                calificacionesCalificacion.setEstudiante(estudiante);
                calificacionesCalificacion = em.merge(calificacionesCalificacion);
                if (oldEstudianteOfCalificacionesCalificacion != null) {
                    oldEstudianteOfCalificacionesCalificacion.getCalificaciones().remove(calificacionesCalificacion);
                    oldEstudianteOfCalificacionesCalificacion = em.merge(oldEstudianteOfCalificacionesCalificacion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Estudiante estudiante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante persistentEstudiante = em.find(Estudiante.class, estudiante.getId());
            List<Calificacion> calificacionesOld = persistentEstudiante.getCalificaciones();
            List<Calificacion> calificacionesNew = estudiante.getCalificaciones();
            List<Calificacion> attachedCalificacionesNew = new ArrayList<Calificacion>();
            for (Calificacion calificacionesNewCalificacionToAttach : calificacionesNew) {
                calificacionesNewCalificacionToAttach = em.getReference(calificacionesNewCalificacionToAttach.getClass(), calificacionesNewCalificacionToAttach.getId());
                attachedCalificacionesNew.add(calificacionesNewCalificacionToAttach);
            }
            calificacionesNew = attachedCalificacionesNew;
            estudiante.setCalificaciones(calificacionesNew);
            estudiante = em.merge(estudiante);
            for (Calificacion calificacionesOldCalificacion : calificacionesOld) {
                if (!calificacionesNew.contains(calificacionesOldCalificacion)) {
                    calificacionesOldCalificacion.setEstudiante(null);
                    calificacionesOldCalificacion = em.merge(calificacionesOldCalificacion);
                }
            }
            for (Calificacion calificacionesNewCalificacion : calificacionesNew) {
                if (!calificacionesOld.contains(calificacionesNewCalificacion)) {
                    Estudiante oldEstudianteOfCalificacionesNewCalificacion = calificacionesNewCalificacion.getEstudiante();
                    calificacionesNewCalificacion.setEstudiante(estudiante);
                    calificacionesNewCalificacion = em.merge(calificacionesNewCalificacion);
                    if (oldEstudianteOfCalificacionesNewCalificacion != null && !oldEstudianteOfCalificacionesNewCalificacion.equals(estudiante)) {
                        oldEstudianteOfCalificacionesNewCalificacion.getCalificaciones().remove(calificacionesNewCalificacion);
                        oldEstudianteOfCalificacionesNewCalificacion = em.merge(oldEstudianteOfCalificacionesNewCalificacion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = estudiante.getId();
                if (findEstudiante(id) == null) {
                    throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.");
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
            Estudiante estudiante;
            try {
                estudiante = em.getReference(Estudiante.class, id);
                estudiante.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.", enfe);
            }
            List<Calificacion> calificaciones = estudiante.getCalificaciones();
            for (Calificacion calificacionesCalificacion : calificaciones) {
                calificacionesCalificacion.setEstudiante(null);
                calificacionesCalificacion = em.merge(calificacionesCalificacion);
            }
            em.remove(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Estudiante> findEstudianteEntities() {
        return findEstudianteEntities(true, -1, -1);
    }

    public List<Estudiante> findEstudianteEntities(int maxResults, int firstResult) {
        return findEstudianteEntities(false, maxResults, firstResult);
    }

    private List<Estudiante> findEstudianteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
           CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Estudiante> cq = cb.createQuery(Estudiante.class);
            Root<Estudiante> estudianteRoot = cq.from(Estudiante.class); 

        // Add the condition
        cq.where(cb.equal(estudianteRoot.get("estudiante"), true)); 

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

    public Estudiante findEstudiante(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }

    public Estudiante findEstudianteWithCedula(String cedula) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Estudiante> cq = cb.createQuery(Estudiante.class);
            Root<Estudiante> estudianteRoot = cq.from(Estudiante.class);
            cq.where(cb.equal(estudianteRoot.get("cedula"), cedula));

            Query q = em.createQuery(cq);
            Estudiante estudiante = (Estudiante)q.getSingleResult();
            if (!estudiante.isEstudiante()) {
                throw new Error("El usuario de cedula " + cedula + " no es un Estudiante");
            }

            return estudiante;
        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }

    public List<Seccion> findSeccionesDisponibles (Estudiante estudiante) {
        List<Seccion> seccionesDisponibles = new ArrayList<Seccion>();
        EntityManager em = getEntityManager();
        try {
            Carrera carrera = em.find(Carrera.class, estudiante.getCarrera().getId());
            for (Materia m : carrera.getMaterias()) {
                for (Seccion s : m.getSecciones()) {

                     System.out.println("Seccion: " + s);
                     seccionesDisponibles.add(s);
                }

            }
        } catch (Exception e) {
            
        }
        return seccionesDisponibles;
    }

    public int getEstudianteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Estudiante> rt = cq.from(Estudiante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
