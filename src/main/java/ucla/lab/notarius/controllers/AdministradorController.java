package ucla.lab.notarius.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.controllers.persistence.UsuarioJpaController;

import ucla.lab.notarius.models.Usuario;

public class AdministradorController implements BasicController<Usuario>{
    private final UsuarioJpaController usuarioService;
    public AdministradorController() {
        this.usuarioService = new UsuarioJpaController();
    }

    public void registrar(Usuario admin) {
        try {
            this.usuarioService.create(admin);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editar(Usuario admin) {
        try {
            this.usuarioService.edit(admin);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(int adminId) {
        try {
            this.usuarioService.destroy(adminId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuario> traerTodos() {
       List<Usuario> listaAdminEntities = this.usuarioService.findUsuarioEntities();
        ArrayList<Usuario> listaAdmins = new ArrayList<Usuario>(listaAdminEntities);
        return listaAdmins;
    }

    public Usuario encontrar(int adminId) {
        try {
            return this.usuarioService.findUsuario(adminId);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
