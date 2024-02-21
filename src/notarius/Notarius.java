
package notarius;

import notarius.controllers.CalificacionJpaController;
import notarius.controllers.CarreraJpaController;
import notarius.controllers.DecanatoJpaController;
import notarius.controllers.EstudianteJpaController;
import notarius.controllers.MateriaJpaController;
import notarius.controllers.ProfesorJpaController;
import notarius.controllers.SeccionJpaController;
import notarius.controllers.SemestreJpaController;
import notarius.models.Calificacion;
import notarius.models.Carrera;
import notarius.models.Decanato;
import notarius.models.Estudiante;
import notarius.models.Materia;
import notarius.models.Profesor;
import notarius.models.Seccion;
import notarius.models.Semestre;


public class Notarius {
    public static void main(String args[]) {
       
       //crear decanato
       Decanato dcyt = new Decanato();

       //crear materia
       Materia programacion1 = new Materia();

       //crear carrera
       Carrera ingInformatica = new Carrera();

       //crear Seccion
       Seccion programacion1Seccion1Informatica = new Seccion();

       //crear Semestre 
       Semestre semestre = new Semestre();

       //crear Calificaciones
       Calificacion calificacion = new Calificacion();

       //crear Estudiante
       Estudiante estudiante = new Estudiante();
       
       //Crear Profesor
        Profesor profesor = new Profesor();

    }
}
