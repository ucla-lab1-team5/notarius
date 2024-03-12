package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.CarreraJpaController;
import ucla.lab.notarius.models.Carrera;

public class CarreraController implements BasicController<Carrera> {
    private final CarreraJpaController carreraService;

    public CarreraController (EntityManagerFactory emf) {
        this.carreraService = new CarreraJpaController(emf);
    }

    public void registrar(Carrera carr) {
        this.carreraService.create(carr);
    }

    public void editar(Carrera carr) {
        try {
            this.carreraService.edit(carr);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int carrId) {
        try {
            this.carreraService.destroy(carrId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera encontrar(int carrId) {
        try {
            return this.carreraService.findCarrera(carrId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public ArrayList<Carrera> traerTodos() {
        List<Carrera> listaCarreraEntities = this.carreraService.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera>(listaCarreraEntities);
        return listaCarreras;
    }
}
