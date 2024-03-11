package ucla.lab.notarius.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.persistence.jpa.config.Basic;

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
}
