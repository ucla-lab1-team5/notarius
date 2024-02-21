
package notarius;

import java.util.ArrayList;
import java.util.List;
import notarius.controllers.CarreraJpaController;
import notarius.controllers.DecanatoJpaController;
import notarius.models.Carrera;
import notarius.models.Decanato;


public class Notarius {
    public static void main(String args[]) {
       
        //crear decanato
       Decanato dcyt = new Decanato();
       DecanatoJpaController decanatoController = new DecanatoJpaController();
       dcyt.setNombre("Ciencias y Tecnologia");
       dcyt.setDescripcion("Escuela de ciencias");
       decanatoController.create(dcyt);
       
       // crear carrera
       Carrera ingInformatica = new Carrera(1, dcyt, "Ingenieria Informatica", "Escuela de informatica");
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
