/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author hanumonke
 */
@Entity
@DiscriminatorValue(value = "user")
public class Profesor extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    // @GeneratedValue(strategy=SEQUENCE, generator="Usuario_Seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    //OneToMany calificaciones?
    
    //OneToMany secciones
    @OneToMany(mappedBy="profesor")
    private List<Seccion> secciones;

    public Profesor() {
    }

    public Profesor(int id, List<Seccion> secciones) {
        this.id = id;
        this.secciones = secciones;
    }

    public Profesor(int id, List<Seccion> secciones, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean administrador, boolean estudiante, boolean profesor) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero, administrador, estudiante, profesor);
        this.id = id;
        this.secciones = secciones;
    }



    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }



   
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "notarius.models.Profesor[ id=" + id + " ]";
    }
    
}
