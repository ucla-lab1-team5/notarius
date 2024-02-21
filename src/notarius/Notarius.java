
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
     dcyt.setUbicacion("Obelisco");
     
     //guardamos el decanato en la db
     control.registrarDecanato(dcyt);
     
     //creamos un segundo decanato
     Decanato dah = new Decanato();
     dah.setNombre("Artes y Humanidades");
     dah.setUbicacion("Carrera 16 entre Calles 26 y 27");
     
     //guardamos el segundo decanato en la db
     control.registrarDecanato(dah);
     
     control.eliminarDecanato(dcyt.getIdDecanato());
     
     dah.setUbicacion("Centro de Barquisimeto");
     
     control.editarDecanato(dah);
    }
}
