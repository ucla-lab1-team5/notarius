
package notarius;

import notarius.controllers.Controller;
import notarius.models.Decanato;





public class Notarius {
    public static void main(String args[]) {
       
     //Iniciar la db
     Controller control = new Controller();
    
     // crear un admin user por defecto
     
     //creamos un decanato
     Decanato dcyt = new Decanato();
     dcyt.setNombre("Ciencia y Tecnologia");
     dcyt.setUbicacion("Obelisco");
     
     //guardamos el decanato en la db
     control.registrarDecanato(dcyt, control.defaultAdmin.getId());
     
     //creamos un segundo decanato
     Decanato dah = new Decanato();
     dah.setNombre("Artes y Humanidades");
     dah.setUbicacion("Carrera 16 entre Calles 26 y 27");
     
     //guardamos el segundo decanato en la db
     control.registrarDecanato(dah, control.defaultAdmin.getId());
     
     control.eliminarDecanato(dcyt.getIdDecanato(), control.defaultAdmin.getId());
     
     dah.setUbicacion("Centro de Barquisimeto");
     
     control.editarDecanato(dah, control.defaultAdmin.getId());
    }
}
