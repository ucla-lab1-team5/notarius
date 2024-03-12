package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.EstudianteJpaController;
import ucla.lab.notarius.models.Estudiante;

public class EstudianteController  implements BasicController<Estudiante>{
    private final EstudianteJpaController estudianteService;
    public EstudianteController (EntityManagerFactory emf) {
        this.estudianteService = new EstudianteJpaController(emf);
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


    public ArrayList<Estudiante> traerTodos() {
       List<Estudiante> listaEstudianteEntities = this.estudianteService.findEstudianteEntities();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>(listaEstudianteEntities);
        return listaEstudiantes;
    }

    public Estudiante encontrar(int estId) {
        try {
            return this.estudianteService.findEstudiante(estId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
