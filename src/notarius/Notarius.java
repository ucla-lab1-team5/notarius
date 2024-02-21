
package notarius;

import notarius.controllers.CalificacionJpaController;
import notarius.controllers.CarreraJpaController;
import notarius.controllers.DecanatoJpaController;
import notarius.controllers.MateriaJpaController;
import notarius.controllers.SeccionJpaController;
import notarius.controllers.SemestreJpaController;
import notarius.models.Calificacion;
import notarius.models.Carrera;
import notarius.models.Decanato;
import notarius.models.Materia;
import notarius.models.Seccion;
import notarius.models.Semestre;


public class Notarius {
    public static void main(String args[]) {
       
       //crear decanato
       Decanato dcyt = new Decanato();
       DecanatoJpaController decanatoController = new DecanatoJpaController();
       decanatoController.create(dcyt);
       
       //crear materia
       Materia programacion1 = new Materia();
       MateriaJpaController materiaController = new MateriaJpaController();
       materiaController.create(programacion1);
       
       //crear carrera
       Carrera ingInformatica = new Carrera();
       CarreraJpaController carreraController = new CarreraJpaController();
       carreraController.create(ingInformatica);
       
       //crear Seccion
       Seccion programacion1Seccion1Informatica = new Seccion();
       SeccionJpaController seccionController = new SeccionJpaController();
       seccionController.create(programacion1Seccion1Informatica);

       //crear Semestre 
       Semestre semestre = new Semestre();
       SemestreJpaController semestreController = new SemestreJpaController();
       semestreController.create(semestre);
       
       //crear Calificaciones
       Calificacion calificacion = new Calificacion();
       CalificacionJpaController calificacionController = new CalificacionJpaController();
       calificacionController.create(calificacion);
       //crear Estudiante
       
    }
}
