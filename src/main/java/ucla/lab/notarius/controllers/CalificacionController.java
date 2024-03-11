package ucla.lab.notarius.controllers;

import ucla.lab.notarius.controllers.persistence.CalificacionJpaController;
import ucla.lab.notarius.models.Calificacion;

public class CalificacionController implements BasicController<Calificacion> {
    private final CalificacionJpaController calificacionService;

    public CalificacionController() {
        this.calificacionService = new CalificacionJpaController();
    }


}   
