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
        //Inscripcion
        //Paso 1: Buscar el estudiante por su cedula
        Estudiante estudianteInscribiendo = persistenceService.estudiante.findEstudianteWithCedula("1234567890");
        List<Seccion> seccionesAInscribir = (List)new ArrayList<Seccion>();
        System.out.println(estudianteInscribiendo.toString());
        
        //Listar secciones disponibles segun la carrera y el semestre
        for (Seccion seccionDisponible : estudianteInscribiendo.getSeccionesDisponibles()) {
            //escoger las secciones, en este caso solo las de indice impar
            if ((seccionDisponible.getId() % 2) == 0) {
                seccionesAInscribir.add(seccionDisponible);
            }
        }
        
        Inscripcion estudianteInscripcion = new Inscripcion();
        
        estudianteInscripcion.setCarrera(estudianteInscribiendo.getCarrera());
        estudianteInscripcion.setDecanato(estudianteInscribiendo.getCarrera().getDecanato());
        estudianteInscripcion.setEstudiante(estudianteInscribiendo);
        estudianteInscripcion.setPeriodo(persistenceService.periodoAcademico.findLastPeriodo());
        estudianteInscripcion.setSecciones(seccionesAInscribir);
        estudianteInscripcion.setSemestre(estudianteInscribiendo.getSemestre());

        try {
             persistenceService.inscripcion.create(estudianteInscripcion);
            List<Inscripcion> inscripciones = persistenceService.inscripcion.findInscripcionEntities();
            for (Inscripcion i : inscripciones) {
                System.out.println(i.getSecciones().toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }
}
