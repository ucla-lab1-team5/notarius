package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.MateriaJpaController;
import ucla.lab.notarius.models.Materia;

public class MateriaController implements BasicController<Materia> {
    private final MateriaJpaController materiaService;

    public MateriaController(EntityManagerFactory emf) {
        this.materiaService = new MateriaJpaController(emf);
    }

    public void registrar(Materia mat) {
        this.materiaService.create(mat);
    }

    public void editar(Materia mat) {
        try {
            this.materiaService.edit(mat);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int matId) {
        try {
            this.materiaService.destroy(matId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Materia> traerTodos() {
        List<Materia> listaMateriaEntities = this.materiaService.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList<>(listaMateriaEntities);
        return listaMaterias;
    }

    public Materia encontrar(int matId) {
        try {
            return this.materiaService.findMateria(matId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
