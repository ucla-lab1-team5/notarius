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

import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Inscripcion;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Seccion;

import ucla.lab.notarius.models.services.PersistenceService;


public class Notarius {
    public static void main(String[] args) {

        PersistenceService persistenceService = new PersistenceService();

        Estudiante estudianteInscribiendo = persistenceService.estudiante.findEstudianteWithCedula("1234567890");


        List<Seccion> seccionesDisponibles = persistenceService.estudiante.findSeccionesDisponibles(estudianteInscribiendo);

        List<Seccion> seccionesElegidas = new ArrayList<Seccion>();

        for (Seccion seccion : seccionesDisponibles) {
            if (seccion.getId() % 2 != 0) {
                seccionesElegidas.add(seccion);
            }
        }


        System.out.println(seccionesDisponibles.size());

        PeriodoAcademico ultimoPeriodo = persistenceService.periodoAcademico.findLastPeriodo();

        Inscripcion inscripcion = new Inscripcion(estudianteInscribiendo, seccionesElegidas, ultimoPeriodo);

        persistenceService.inscripcion.create(inscripcion);

        
    }
}