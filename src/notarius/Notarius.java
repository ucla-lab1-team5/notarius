
package notarius;

import java.util.ArrayList;
import java.util.List;
import notarius.controllers.CarreraJpaController;
import notarius.controllers.DecanatoJpaController;
import notarius.controllers.MateriaJpaController;
import notarius.models.Carrera;
import notarius.models.Decanato;
import notarius.models.Materia;


public class Notarius {
    public static void main(String args[]) {
       
        //crear decanato
       Decanato dcyt = new Decanato();
       DecanatoJpaController decanatoController = new DecanatoJpaController();
       dcyt.setNombre("Ciencias y Tecnologia");
       dcyt.setDescripcion("Escuela de ciencias");
       decanatoController.create(dcyt);
       
       //crear aunq sea una materia para carrera
       Materia programacion1 = new Materia();
       programacion1.setNombre("Programacion 1");
       programacion1.setDescripcion("Conceptos elementales de la programacion web");
       MateriaJpaController materiaController = new MateriaJpaController();
       materiaController.create(programacion1);

      
       
       // crear carrera
       Carrera ingInformatica = new Carrera();
       ingInformatica.setNombre("Ingenieria Informatica");
       ingInformatica.setDescripcion("Aprende a contruir software");
       ingInformatica.setDecanato(dcyt);

       
       //array de carreras para materia
//       Set<Carrera> carrerasConProgramacion1;
//       carrerasConProgramacion1.add(ingInformatica);
       
       
       
       CarreraJpaController carreraController = new CarreraJpaController();
       carreraController.create(ingInformatica);
       
       //Consultar carrera
       List<Carrera> listaCarreras = carreraController.findCarreraEntities();
       ArrayList<Carrera> arrayCarreras = new ArrayList(listaCarreras);
       
       //Printear la carrera
       for (int i = 0; i < arrayCarreras.size(); i++) {
           Carrera tempCarrera = arrayCarreras.get(i);
           String mensaje = tempCarrera.getNombre() + " pertenece al Decanato de " + tempCarrera.getDecanato().getNombre();
           System.out.print(mensaje);
       }
       
       
       
    }
}
