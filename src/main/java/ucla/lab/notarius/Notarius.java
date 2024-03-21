/*
zar Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/

package ucla.lab.notarius;

import ucla.lab.notarius.controllers.AdminGestionDecanatoController;
import ucla.lab.notarius.controllers.AdminInscripcionEstController;
import ucla.lab.notarius.views.AdminGestionDecanatoView;
import ucla.lab.notarius.views.AdminInscripcionEstView1;
import ucla.lab.notarius.views.Login;


public class Notarius {
    public static void main(String[] args) {
        
        // PersistenceService persistenceService = new PersistenceService();
        // AdminInscripcionEstController inscripcionEstController = new AdminInscripcionEstController(new AdminInscripcionEstView1());
        AdminGestionDecanatoController decanatoController = new AdminGestionDecanatoController(new AdminGestionDecanatoView());
        
    }
}