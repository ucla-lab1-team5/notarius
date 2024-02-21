package notarius.controllers;

/**
 * @authors:
 *      Hanuman Sanchez - 28.316.086 - ING. INFORMATICA
 *      Anthony Moreno  -            - 
 */
public class Controller {
    // inicio la db
    public Controller() {
       //crear decanato
       DecanatoJpaController decanatoService = new DecanatoJpaController();
       
       //crear materia
       MateriaJpaController materiaService = new MateriaJpaController();

       //crear carrera
       CarreraJpaController carreraService = new CarreraJpaController();

       //crear seccion
       SeccionJpaController seccionService = new SeccionJpaController();

       //crear semestre 
       SemestreJpaController semestreServicio = new SemestreJpaController();

       //crear calificaciones
       CalificacionJpaController calificacionService = new CalificacionJpaController();

       //crear estudiante
       EstudianteJpaController estudianteService = new EstudianteJpaController();
       
       //Crear profesor
        ProfesorJpaController profesorService = new ProfesorJpaController();
    }
//FUNCIONES ADMINISTRADOR
    //GESTION DECANATO
    //GESTION CARRERA
    //GESTION MATERIA
    //GESTION PROFESORES
    //GESTION ESTUDIANTES
    
    
//FUNCIONES PROFESOR & ADMINISTRADOR
    //GESTION CALIFICACIONES

//FUNCIONES ESTUDIANTES
    //SOLICITUD INCLUSION y RETIRO DE MATERIA
}
