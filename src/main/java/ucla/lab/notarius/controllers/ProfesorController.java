package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.ProfesorJpaController;
import ucla.lab.notarius.models.Profesor;

public class ProfesorController implements BasicController<Profesor> {
    private final ProfesorJpaController profesorService;
    public ProfesorController(EntityManagerFactory emf) {
        this.profesorService = new ProfesorJpaController(emf);    
    }

     public void registrar(Profesor prof) {
        this.profesorService.create(prof);
    }

    public void editar(Profesor prof) {
        try {
            this.profesorService.edit(prof);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int profId) {
        try {
            this.profesorService.destroy(profId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ArrayList<Profesor> traerTodos() {
       List<Profesor> listaProfesorEntities = this.profesorService.findProfesorEntities();
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(listaProfesorEntities);
        return listaProfesores;
    }

    public Profesor encontrar(int profId) {
        try {
            return this.profesorService.findProfesor(profId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
