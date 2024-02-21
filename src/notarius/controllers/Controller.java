package notarius.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import notarius.controllers.exceptions.NonexistentEntityException;

//importando modelos
import notarius.models.Carrera;
import notarius.models.Decanato;
import notarius.models.Estudiante;
import notarius.models.Materia;
import notarius.models.Profesor;
import notarius.models.Usuario;

/**
 * @authors: Hanuman Sanchez - 28.316.086 - ING. INFORMATICA Anthony Moreno - -
 */
public class Controller {

    private final DecanatoJpaController decanatoService;
    private final MateriaJpaController materiaService;
    private final CarreraJpaController carreraService;
    private final SeccionJpaController seccionService;
    private final SemestreJpaController semestreServicio;
    private final CalificacionJpaController calificacionService;
    private final EstudianteJpaController estudianteService;
    private final ProfesorJpaController profesorService;
    private final UsuarioJpaController usuarioService;


    // inicio la db - instancia de los services para manipular la db. 
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
        
        this.usuarioService = new UsuarioJpaController();
      
    }
//FUNCIONES ADMINISTRADOR

  
    //GESTION DECANATO
    
    public void registrarDecanato(Decanato dec) {
        Controller.this.decanatoService.create(dec);
    }
    public void editarDecanato(Decanato dec) {
        try
        {
            Controller.this.decanatoService.edit(dec);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void eliminarDecanato(int decId){
        try
        {
            Controller.this.decanatoService.destroy(decId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //TODO AGREGAR PERMISOS AL RESTO DE TABLAS
    //GESTION CARRERA
    public void registrarCarrera(Carrera carr) {
        Controller.this.carreraService.create(carr);
    }
    public void editarCarrera(Carrera carr){
        try
        {
            Controller.this.carreraService.edit(carr);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarCarrera(int carrId) {
        try
        {
            Controller.this.carreraService.destroy(carrId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //GESTION MATERIA
    public void registrarMateria(Materia mat) {
        Controller.this.materiaService.create(mat);
    }
    public void editarMateria(Materia mat) {
        try
        {
            Controller.this.materiaService.edit(mat);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarMateria(String matId){
        try
        {
            Controller.this.materiaService.destroy(matId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION PROFESORES
    public void registrarProfesor(Profesor prof) {
        Controller.this.profesorService.create(prof);
    }
    public void editarProfesor(Profesor prof) {
        try
        {
            Controller.this.profesorService.edit(prof);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarProfesor(long profId){
        try
        {
            Controller.this.profesorService.destroy(profId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION ESTUDIANTES
    public void registrarEstudiante(Estudiante est) {
        //Validar que tenga usuario asociado?
        Controller.this.estudianteService.create(est);
    }
    public void editarEstudiante(Estudiante est){
        try
        {
            Controller.this.estudianteService.edit(est);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarEstudiante(long estId){
        try
        {
            Controller.this.profesorService.destroy(estId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION ADMINISTRADOR
    public void registrarAdministrador(Usuario admin) {
        try
        {
            Controller.this.usuarioService.create(admin);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void editarAdmin(Usuario admin){
        try
        {
            Controller.this.usuarioService.edit(admin);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarAdmin(long adminId){
        try
        {
            Controller.this.profesorService.destroy(adminId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//FUNCIONES PROFESOR & ADMINISTRADOR
    //GESTION CALIFICACIONES
//FUNCIONES ESTUDIANTES
    //SOLICITUD INCLUSION y RETIRO DE MATERIA
}
