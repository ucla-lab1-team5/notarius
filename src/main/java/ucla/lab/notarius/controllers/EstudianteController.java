package ucla.lab.notarius.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.EstudianteJpaController;
import ucla.lab.notarius.models.Estudiante;

public class EstudianteController  implements BasicController<Estudiante>{
    private final EstudianteJpaController estudianteService;
    public EstudianteController () {
        this.estudianteService = new EstudianteJpaController();
    }
      public void registrar(Estudiante est) {
        // Validar que tenga usuario asociado?
        this.estudianteService.create(est);
    }

    public void editar(Estudiante est) {
        try {
            this.estudianteService.edit(est);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int estId) {
        try {
            this.estudianteService.destroy(estId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
