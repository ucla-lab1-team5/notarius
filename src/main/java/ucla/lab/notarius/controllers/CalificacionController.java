package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.CalificacionJpaController;
import ucla.lab.notarius.models.Calificacion;


public class CalificacionController implements BasicController<Calificacion> {
    private final CalificacionJpaController calificacionService;

    public CalificacionController(EntityManagerFactory emf) {
        this.calificacionService = new CalificacionJpaController(emf);
    }


     public void registrar(Calificacion c) {
        this.calificacionService.create(c);
    }

    public void editar(Calificacion c) {
        try {
            this.calificacionService.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int calificationId) {
        try {
            this.calificacionService.destroy(calificationId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ArrayList<Calificacion> traerTodos() {
       List<Calificacion> listaCalificationEntities = this.calificacionService.findCalificacionEntities();
        ArrayList<Calificacion> listaCalifications = new ArrayList<Calificacion>(listaCalificationEntities);
        return listaCalifications;
    }

    public Calificacion encontrar(int calificationId) {
        try {
            return this.calificacionService.findCalificacion(calificationId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


}   
