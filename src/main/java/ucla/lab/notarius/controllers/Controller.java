/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;

//importando modelos
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.Profesor;
import ucla.lab.notarius.models.Usuario;

/**
 * @authors: Hanuman Sanchez - 28.316.086 - ING. INFORMATICA Anthony Moreno - -
 */
public class Controller {
    private EntityManagerFactory emf = null;
    private final DecanatoJpaController decanatoService;
    private final MateriaJpaController materiaService;
    private final CarreraJpaController carreraService;
    private final SeccionJpaController seccionService;
    private final CalificacionJpaController calificacionService;
    private final EstudianteJpaController estudianteService;
    private final ProfesorJpaController profesorService;
    private final UsuarioJpaController usuarioService;


    // inicio la db - instancia de los services para manipular la db. 
    public Controller() {
        this.emf = Persistence.createEntityManagerFactory("notariusPU");
        //crear decanato
        this.decanatoService = new DecanatoJpaController(this.emf);

        //crear materia
        this.materiaService = new MateriaJpaController(this.emf);

        //crear carrera
        this.carreraService = new CarreraJpaController(this.emf);

        //crear seccion
        this.seccionService = new SeccionJpaController(this.emf);

        //crear semestre 


        //crear calificaciones
        this.calificacionService = new CalificacionJpaController(this.emf);

        //crear estudiante
        this.estudianteService = new EstudianteJpaController(this.emf);

        //Crear profesor
        this.profesorService = new ProfesorJpaController(this.emf);
        
        this.usuarioService = new UsuarioJpaController(this.emf);
      
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

    
    public void eliminarDecanato (int decId) {
        try
        {
            this.decanatoService.destroy(decId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public ArrayList<Decanato> traerDecanatos () {

        List<Decanato> listaDecanatosEntities = this.decanatoService.findDecanatoEntities();
        ArrayList<Decanato> listaDecanatos = new ArrayList(listaDecanatosEntities);
        return listaDecanatos;
        
    }
    
    public Decanato encontrarDecanato (int decId) {
     try
        {
          return this.decanatoService.findDecanato(decId);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    
    }

    
    //TODO AGREGAR PERMISOS AL RESTO DE TABLAS
    //GESTION CARRERA
    public void registrarCarrera(Carrera carr) {
        this.carreraService.create(carr);
    }
    public void editarCarrera(Carrera carr){
        try
        {
            this.carreraService.edit(carr);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarCarrera(int carrId) {
        try
        {
            this.carreraService.destroy(carrId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //GESTION MATERIA
    public void registrarMateria(Materia mat) {
        this.materiaService.create(mat);
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
    public void eliminarMateria(int matId){
        try
        {
            this.materiaService.destroy(matId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION PROFESORES
    public void registrarProfesor(Profesor prof) {
       this.profesorService.create(prof);
    }
    public void editarProfesor(Profesor prof) {
        try
        {
           this.profesorService.edit(prof);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarProfesor(int profId){
        try
        {
           this.profesorService.destroy(profId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION ESTUDIANTES
    public void registrarEstudiante(Estudiante est) {
        //Validar que tenga usuario asociado?
        this.estudianteService.create(est);
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
    public void eliminarEstudiante(int estId){
        try
        {
            this.profesorService.destroy(estId);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //GESTION ADMINISTRADOR
    public void registrarAdministrador(Usuario admin) {
        try
        {
            this.usuarioService.create(admin);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void editarAdmin(Usuario admin){
        try
        {
            this.usuarioService.edit(admin);
        } catch (Exception ex)
        {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarAdmin(int adminId){
        try
        {
          this.profesorService.destroy(adminId);
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
