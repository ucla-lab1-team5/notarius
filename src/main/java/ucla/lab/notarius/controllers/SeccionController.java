package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.SeccionJpaController;
import ucla.lab.notarius.models.Seccion;

public class SeccionController implements BasicController<Seccion> {
    private final SeccionJpaController seccionService;
    public SeccionController(EntityManagerFactory emf) {
        this.seccionService = new SeccionJpaController(emf);
    }

           public void registrar(Seccion secc) {
        try {
            this.seccionService.create(secc);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Seccion secc) {
        try {
            this.seccionService.edit(secc);
            
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int seccInt) {
        try {
            this.seccionService.destroy(seccInt);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Seccion> traerTodos() {
        List<Seccion> listaSeccionEntities = this.seccionService.findSeccionEntities();
        ArrayList<Seccion> listaSecciones = new ArrayList<Seccion>(listaSeccionEntities);
        return listaSecciones;
    }

    public Seccion encontrar(int seccId) {
        try {
            return this.seccionService.findSeccion(seccId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
