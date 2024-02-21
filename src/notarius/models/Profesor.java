
package notarius.models;
 //No es una entity como tal
import javax.persistence.Entity;


@Entity
public class Profesor extends Usuario{

    public Profesor() {
    }

    public Profesor(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero);
    }
    
    

}
