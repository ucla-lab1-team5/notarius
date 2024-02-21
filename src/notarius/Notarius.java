
package notarius;

import notarius.controllers.Controller;
import notarius.models.Decanato;





public class Notarius {
    public static void main(String args[]) {
       
     //Iniciar la db
     Controller control = new Controller();
    
     //creamos un decanato
     Decanato dcyt = new Decanato();
     dcyt.setNombre("Ciencia y Tecnologia");
     dcyt.setDescripcion("Ubicacion: Obelisco");
     
     //guardamos el decanato en la db
     control.registrarDecanato(dcyt);
     
    }
}
