
package notarius;

import notarius.controllers.Controller;
import notarius.models.Decanato;
import notarius.views.AddDecanatoView;

public class Notarius {
    public static void main(String args[]) {
        
     //Setup de la app
     //Agregar/Crear conexion
     //Iniciar la db
     
     Controller control = new Controller();
    
     // crear un admin user por defecto
     
     //creamos un decanato
     Decanato dcyt = new Decanato();
     dcyt.setNombre("Ciencias y Tecnologias");
     
     
     //guardamos el decanato en la db
     control.registrarDecanato(dcyt);
     
     //creamos un segundo decanato
     Decanato dah = new Decanato();
     dah.setNombre("Artes y Humanidades");
    
     
     //guardamos el segundo decanato en la db
     control.registrarDecanato(dah);
     
     control.eliminarDecanato(dcyt.getIdDecanato());
     
     
     //control.editarDecanato(dah);
     
     //PROBANDO LAS VISTAS
     AddDecanatoView addDecanatoView = new AddDecanatoView();
     
     
    }
}
