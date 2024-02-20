
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profesor extends Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idProfesor; 
    @Basic
    private Asignatura asignaturas;

    public Profesor() {
    }

    public Profesor(String idProfesor, Asignatura asignaturas) {
        this.idProfesor = idProfesor;
        this.asignaturas = asignaturas;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Asignatura getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
