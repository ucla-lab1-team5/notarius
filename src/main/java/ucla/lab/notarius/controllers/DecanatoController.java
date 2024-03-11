package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.CarreraJpaController;
import ucla.lab.notarius.controllers.persistence.DecanatoJpaController;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Decanato;

public class DecanatoController implements BasicController<Decanato> {

    private final DecanatoJpaController decanatoService;

    public DecanatoController() {
        this.decanatoService = new DecanatoJpaController();
    }

    public void registrar(Decanato dec) {
        try {
            this.decanatoService.create(dec);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Decanato dec) {
        try {
            CarreraJpaController carreraService = new CarreraJpaController();
            List<Carrera> carrerasDecanato = dec.getCarreras();
            for (Carrera c : carrerasDecanato) {
                if (carreraService.findCarrera(c.getId()) == null) {
                    carreraService.create(c);
                }
            }
            this.decanatoService.edit(dec);
            carreraService = null;
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int decId) {
        try {
            this.decanatoService.destroy(decId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Decanato> traerTodos() {
        List<Decanato> listaDecanatosEntities = this.decanatoService.findDecanatoEntities();
        ArrayList<Decanato> listaDecanatos = new ArrayList<Decanato>(listaDecanatosEntities);
        return listaDecanatos;
    }

    public Decanato encontrar(int decId) {
        try {
            return this.decanatoService.findDecanato(decId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
