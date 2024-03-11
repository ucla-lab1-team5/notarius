package ucla.lab.notarius.controllers;

import ucla.lab.notarius.controllers.persistence.SeccionJpaController;
import ucla.lab.notarius.models.Seccion;

public class SeccionController implements BasicController<Seccion> {
    private final SeccionJpaController seccionService;
    public SeccionController() {
        this.seccionService = new SeccionJpaController();
    }

    
}
