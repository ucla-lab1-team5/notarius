package ucla.lab.notarius.controllers;

import java.util.ArrayList;

import ucla.lab.notarius.controllers.persistence.UsuarioJpaController;
import ucla.lab.notarius.models.Usuario;

public class UsuarioController implements BasicController<Usuario> {
    private final UsuarioJpaController usuarioService;
    public UsuarioController() {
        this.usuarioService = new UsuarioJpaController();
    }

   

    
}
