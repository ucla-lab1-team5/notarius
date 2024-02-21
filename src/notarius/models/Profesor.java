
package notarius.models;
 //No es una entity como tal
import javax.persistence.Entity;


@Entity
public class Profesor extends Usuario{
    public Profesor() {}

    public Profesor(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean es_profesor, boolean es_estudiante, boolean es_admin) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero, es_profesor, es_estudiante, es_admin);
    }

    
}
