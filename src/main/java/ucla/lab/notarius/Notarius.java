/*
zar Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/

package ucla.lab.notarius;

import java.util.ArrayList;
import java.util.List;

import ucla.lab.notarius.controllers.AdminGestionDecanatoController;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Inscripcion;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.Profesor;
import ucla.lab.notarius.models.Seccion;
import ucla.lab.notarius.models.Usuario;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.views.AdminGestionDecanatoView;

public class Notarius {
    public static void main(String[] args) {

        PersistenceService persistenceService = new PersistenceService();
        List<Seccion> secciones = persistenceService.seccion.findSeccionEntities();
        System.out.println(secciones.toString());

        
        
    }
}
