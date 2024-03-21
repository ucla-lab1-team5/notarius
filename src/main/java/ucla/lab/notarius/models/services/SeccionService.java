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
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Profesor;
import ucla.lab.notarius.models.Calificacion;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.Inscripcion;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Seccion;

/**
 *
 * @author antho
 */
public class SeccionService implements Serializable {

    public SeccionService(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public SeccionService () {
         emf = Persistence.createEntityManagerFactory("notariusPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // public void create(Seccion seccion) {
    //     if (seccion.getCalificaciones() == null) {
    //         seccion.setCalificaciones(new ArrayList<Calificacion>());
    //     }
    //     EntityManager em = null;
    //     try {
    //         em = getEntityManager();
    //         em.getTransaction().begin();
    //         Materia materia = seccion.getMateria();
    //         if (materia != null) {
    //             materia = em.getReference(materia.getClass(), materia.getId());
    //             seccion.setMateria(materia);
    //         }
    //         PeriodoAcademico periodo = seccion.getPeriodo();
    //         if (periodo != null) {
    //             periodo = em.getReference(periodo.getClass(), periodo.getId());
    //             seccion.setPeriodo(periodo);
    //         }
    //         Profesor profesor = seccion.getProfesor();
    //         if (profesor != null) {
    //             profesor = em.getReference(profesor.getClass(), profesor.getId());
    //             seccion.setProfesor(profesor);
    //         }
    //         List<Calificacion> attachedCalificaciones = new ArrayList<Calificacion>();
    //         for (Calificacion calificacionesCalificacionToAttach : seccion.getCalificaciones()) {
    //             calificacionesCalificacionToAttach = em.getReference(calificacionesCalificacionToAttach.getClass(), calificacionesCalificacionToAttach.getId());
    //             attachedCalificaciones.add(calificacionesCalificacionToAttach);
    //         }
    //         seccion.setCalificaciones(attachedCalificaciones);
    //         em.persist(seccion);
    //         if (materia != null) {
    //             materia.getSecciones().add(seccion);
    //             materia = em.merge(materia);
    //         }
    //         if (periodo != null) {
    //             periodo.getSecciones().add(seccion);
    //             periodo = em.merge(periodo);
    //         }
    //         if (profesor != null) {
    //             profesor.getSecciones().add(seccion);
    //             profesor = em.merge(profesor);
    //         }
    //         for (Calificacion calificacionesCalificacion : seccion.getCalificaciones()) {
    //             Seccion oldSeccionOfCalificacionesCalificacion = calificacionesCalificacion.getSeccion();
    //             calificacionesCalificacion.setSeccion(seccion);
    //             calificacionesCalificacion = em.merge(calificacionesCalificacion);
    //             if (oldSeccionOfCalificacionesCalificacion != null) {
    //                 oldSeccionOfCalificacionesCalificacion.getCalificaciones().remove(calificacionesCalificacion);
    //                 oldSeccionOfCalificacionesCalificacion = em.merge(oldSeccionOfCalificacionesCalificacion);
    //             }
    //         }
    //         em.getTransaction().commit();
    //     } finally {
    //         if (em != null) {
    //             em.close();
    //         }
    //     }
    // }

public void create(Seccion seccion) {
        if (seccion.getInscripciones() == null) {
            seccion.setInscripciones(new ArrayList<Inscripcion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Inscripcion> attachedInscripciones = new ArrayList<Inscripcion>();
            for (Inscripcion inscripcionToAttach : seccion.getInscripciones()) {
                inscripcionToAttach = em.getReference(inscripcionToAttach.getClass(), inscripcionToAttach.getId());
                attachedInscripciones.add(inscripcionToAttach);
            }
            seccion.setInscripciones(attachedInscripciones);
            em.persist(seccion);
            for (Inscripcion inscripcion : seccion.getInscripciones()) {
                inscripcion.getSecciones().add(seccion);
                inscripcion = em.merge(inscripcion);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Seccion seccion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Seccion persistentSeccion = em.find(Seccion.class, seccion.getId());
            Materia materiaOld = persistentSeccion.getMateria();
            Materia materiaNew = seccion.getMateria();
            PeriodoAcademico periodoOld = persistentSeccion.getPeriodo();
            PeriodoAcademico periodoNew = seccion.getPeriodo();
            Profesor profesorOld = persistentSeccion.getProfesor();
            Profesor profesorNew = seccion.getProfesor();
            List<Calificacion> calificacionesOld = persistentSeccion.getCalificaciones();
            List<Calificacion> calificacionesNew = seccion.getCalificaciones();
            if (materiaNew != null) {
                materiaNew = em.getReference(materiaNew.getClass(), materiaNew.getId());
                seccion.setMateria(materiaNew);
            }
            if (periodoNew != null) {
                periodoNew = em.getReference(periodoNew.getClass(), periodoNew.getId());
                seccion.setPeriodo(periodoNew);
            }
            if (profesorNew != null) {
                profesorNew = em.getReference(profesorNew.getClass(), profesorNew.getId());
                seccion.setProfesor(profesorNew);
            }
            List<Calificacion> attachedCalificacionesNew = new ArrayList<Calificacion>();
            for (Calificacion calificacionesNewCalificacionToAttach : calificacionesNew) {
                calificacionesNewCalificacionToAttach = em.getReference(calificacionesNewCalificacionToAttach.getClass(), calificacionesNewCalificacionToAttach.getId());
                attachedCalificacionesNew.add(calificacionesNewCalificacionToAttach);
            }
            calificacionesNew = attachedCalificacionesNew;
            seccion.setCalificaciones(calificacionesNew);
            seccion = em.merge(seccion);
            if (materiaOld != null && !materiaOld.equals(materiaNew)) {
                materiaOld.getSecciones().remove(seccion);
                materiaOld = em.merge(materiaOld);
            }
            if (materiaNew != null && !materiaNew.equals(materiaOld)) {
                materiaNew.getSecciones().add(seccion);
                materiaNew = em.merge(materiaNew);
            }
            if (periodoOld != null && !periodoOld.equals(periodoNew)) {
                periodoOld.getSecciones().remove(seccion);
                periodoOld = em.merge(periodoOld);
            }
            if (periodoNew != null && !periodoNew.equals(periodoOld)) {
                periodoNew.getSecciones().add(seccion);
                periodoNew = em.merge(periodoNew);
            }
            if (profesorOld != null && !profesorOld.equals(profesorNew)) {
                profesorOld.getSecciones().remove(seccion);
                profesorOld = em.merge(profesorOld);
            }
            if (profesorNew != null && !profesorNew.equals(profesorOld)) {
                profesorNew.getSecciones().add(seccion);
                profesorNew = em.merge(profesorNew);
            }
            for (Calificacion calificacionesOldCalificacion : calificacionesOld) {
                if (!calificacionesNew.contains(calificacionesOldCalificacion)) {
                    calificacionesOldCalificacion.setSeccion(null);
                    calificacionesOldCalificacion = em.merge(calificacionesOldCalificacion);
                }
            }
            for (Calificacion calificacionesNewCalificacion : calificacionesNew) {
                if (!calificacionesOld.contains(calificacionesNewCalificacion)) {
                    Seccion oldSeccionOfCalificacionesNewCalificacion = calificacionesNewCalificacion.getSeccion();
                    calificacionesNewCalificacion.setSeccion(seccion);
                    calificacionesNewCalificacion = em.merge(calificacionesNewCalificacion);
                    if (oldSeccionOfCalificacionesNewCalificacion != null && !oldSeccionOfCalificacionesNewCalificacion.equals(seccion)) {
                        oldSeccionOfCalificacionesNewCalificacion.getCalificaciones().remove(calificacionesNewCalificacion);
                        oldSeccionOfCalificacionesNewCalificacion = em.merge(oldSeccionOfCalificacionesNewCalificacion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = seccion.getId();
                if (findSeccion(id) == null) {
                    throw new NonexistentEntityException("The seccion with id " + id + " no longer exists.");
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
            Seccion seccion;
            try {
                seccion = em.getReference(Seccion.class, id);
                seccion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The seccion with id " + id + " no longer exists.", enfe);
            }
            Materia materia = seccion.getMateria();
            if (materia != null) {
                materia.getSecciones().remove(seccion);
                materia = em.merge(materia);
            }
            PeriodoAcademico periodo = seccion.getPeriodo();
            if (periodo != null) {
                periodo.getSecciones().remove(seccion);
                periodo = em.merge(periodo);
            }
            Profesor profesor = seccion.getProfesor();
            if (profesor != null) {
                profesor.getSecciones().remove(seccion);
                profesor = em.merge(profesor);
            }
            List<Calificacion> calificaciones = seccion.getCalificaciones();
            for (Calificacion calificacionesCalificacion : calificaciones) {
                calificacionesCalificacion.setSeccion(null);
                calificacionesCalificacion = em.merge(calificacionesCalificacion);
            }
            em.remove(seccion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Seccion> findSeccionEntities() {
        return findSeccionEntities(true, -1, -1);
    }

    public List<Seccion> findSeccionEntities(int maxResults, int firstResult) {
        return findSeccionEntities(false, maxResults, firstResult);
    }

    private List<Seccion> findSeccionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Seccion.class));
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

    public Seccion findSeccion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Seccion.class, id);
        } finally {
            em.close();
        }
    }

    

   

    public int getSeccionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Seccion> rt = cq.from(Seccion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
