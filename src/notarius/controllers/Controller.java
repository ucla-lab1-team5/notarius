package notarius.controllers;

import notarius.controllers.exceptions.NonexistentEntityException;
import notarius.models.Decanato;

/**
 * @authors:
 *      Hanuman Sanchez - 28.316.086 - ING. INFORMATICA
 *      Anthony Moreno  -            - 
 */
public class Controller {
    DecanatoJpaController decanatoService;
    MateriaJpaController materiaService;
    CarreraJpaController carreraService;
    SeccionJpaController seccionService;
    SemestreJpaController semestreServicio;
    CalificacionJpaController calificacionService;
    EstudianteJpaController estudianteService;
    ProfesorJpaController profesorService;
    // inicio la db
    public Controller() {
       //crear decanato
       this.decanatoService = new DecanatoJpaController();
       
       //crear materia
       this.materiaService = new MateriaJpaController();

       //crear carrera
       this.carreraService = new CarreraJpaController();

       //crear seccion
       this.seccionService = new SeccionJpaController();

       //crear semestre 
       this.semestreServicio = new SemestreJpaController();

       //crear calificaciones
       this.calificacionService = new CalificacionJpaController();

       //crear estudiante
       this.estudianteService = new EstudianteJpaController();
       
       //Crear profesor
        this.profesorService = new ProfesorJpaController();
    }
//FUNCIONES ADMINISTRADOR
    //GESTION DECANATO
        public void registrarDecanato(Decanato dec) {
            Controller.this.decanatoService.create(dec);
        }
        public void editarDecanato(Decanato dec) throws Exception {
            Controller.this.decanatoService.edit(dec);
        }
        public void eliminarDecanato(int id) throws NonexistentEntityException {
            Controller.this.decanatoService.destroy(id);
        }
       
 
    //GESTION CARRERA
    //GESTION MATERIA
    //GESTION PROFESORES
    //GESTION ESTUDIANTES
    
    
//FUNCIONES PROFESOR & ADMINISTRADOR
    //GESTION CALIFICACIONES

//FUNCIONES ESTUDIANTES
    //SOLICITUD INCLUSION y RETIRO DE MATERIA
}
