package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.UsuarioJpaController;
import ucla.lab.notarius.models.Usuario;

public class UsuarioController implements BasicController<Usuario> {
    private final UsuarioJpaController usuarioService;
    public UsuarioController(EntityManagerFactory emf) {
        this.usuarioService = new UsuarioJpaController(emf);
    }
    public UsuarioController() {
        this.usuarioService = new UsuarioJpaController();
    }

        public void registrar(Usuario u) {
            if (Integer.valueOf(u.getEdad()) == null) {
                u.setEdad(0);
            }
            if (Character.valueOf(u.getGenero()) == null) {
                u.setGenero('N');
            }
        try {
            this.usuarioService.create(u);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar(Usuario u) {
        try {
            this.usuarioService.edit(u);
            
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int userId) {
        try {
            this.usuarioService.destroy(userId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Usuario> traerTodos() {
        List<Usuario> listaUsuarioEntities = this.usuarioService.findUsuarioEntities();
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(listaUsuarioEntities);
        return listaUsuarios;
    }

    public Usuario encontrar(int userId) {
        try {
            return this.usuarioService.findUsuario(userId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   

    
}
