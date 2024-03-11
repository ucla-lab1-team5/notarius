/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.controllers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//importando modelos


/**
 * @authors: Hanuman Sanchez - 28.316.086 - ING. INFORMATICA Anthony Moreno - -
 */
public class Controller {
    private EntityManagerFactory emf = null;
    public final DecanatoController decanato;
    public final CarreraController carrera;
    public final MateriaController materia;
    public final SeccionController seccion;
    public final CalificacionController calificacion;
    public final EstudianteController estudiante;
    public final ProfesorController profesor;
    public final UsuarioController usuario;

    // inicio la db - instancia de los services para manipular la db.
    public Controller() {
        this.emf = Persistence.createEntityManagerFactory("notariusPU");
        // crear controlador decanato
        this.decanato = new DecanatoController();
        // crear controlador carrera
        this.carrera = new CarreraController();
        // crear controlador materia
        this.materia = new MateriaController();
        // crear controlador seccion
        this.seccion = new SeccionController();
        // crear controlador calificaciones
        this.calificacion = new CalificacionController();
        // crear controlador estudiante
        this.estudiante = new EstudianteController();
        // crear controlador profesor
        this.profesor = new ProfesorController();
        // crear controlador usuario
        this.usuario = new UsuarioController();

    }
}
