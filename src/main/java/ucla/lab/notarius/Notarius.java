/*
zar Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/

package ucla.lab.notarius;

import java.util.List;

import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Profesor;
import ucla.lab.notarius.models.Usuario;
import ucla.lab.notarius.models.services.PersistenceService;

public class Notarius {
    public static void main(String[] args) {

        PersistenceService control = new PersistenceService();
        // List<Estudiante> estudiantes = control.estudiante.findEstudianteEntities();
        // System.out.println("Estudiantes:");
        // for (Estudiante e : estudiantes) {
        //     System.out.println(e.getNombres());
        // }
        // System.out.println("Profesores:");
        // List<Profesor> profesores = control.profesor.findProfesorEntities();
        // for (Profesor p : profesores) {
        //     System.out.println(p.getNombres());
        // }

        // System.out.println("Usuarios:");
        // List<Usuario> usuarios = control.usuario.findUsuarioEntities();
        // for (Usuario u : usuarios) {
        //     System.out.println(u.getNombres());
        // }

        //Inscripcion
        //Paso 1: Buscar el estudiante por su cedula

        Estudiante estudianteInscribiendo2 = control.estudiante.findEstudianteWithCedula("0123456789");
        System.out.println(estudianteInscribiendo2.toString());

        //Listar secciones disponibles 

        
    }
}
