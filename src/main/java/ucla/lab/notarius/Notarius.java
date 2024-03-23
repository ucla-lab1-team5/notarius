/*
zar Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/

package ucla.lab.notarius;

import ucla.lab.notarius.controllers.InscripcionController;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.views.InscripcionView;



public class Notarius {
    public static void main(String[] args) {
        
         PersistenceService persistenceService = new PersistenceService();
         InscripcionController inscripcionEstController = new InscripcionController(new InscripcionView());
//        AdminGestionDecanatoController decanatoController = new AdminGestionDecanatoController(new AdminGestionDecanatoView());
        
    }
}