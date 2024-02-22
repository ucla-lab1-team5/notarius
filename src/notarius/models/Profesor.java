/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.models;
 //No es una entity como tal
import javax.persistence.Entity;


@Entity
public class Profesor extends Usuario{ 
    //Posiblemente tener: secciones
    public Profesor() {}

    public Profesor(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean es_profesor, boolean es_estudiante, boolean es_admin) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero, es_profesor, es_estudiante, es_admin);
    }

    
}
