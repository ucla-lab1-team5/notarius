
package notarius.models;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seccion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  //cambiar esto de la frecuencia??
    private int numero;
    @Basic
    private Estudiante estudiantes;
    private Profesor profesor;

    public Seccion() {
    }

    public double ObtenerPromedio( ){
    return 0; 
    }
    
      public int ObtenerAprobados( ){
    return 0; 
    }
      public void EncimaPromedio( ){               //PUBLIC STRING
    
    }
      public void DebajoPromedio( ){          //PUBLIC STRING
    
    }
      
    public Seccion(int numero, Estudiante estudiantes, Profesor profesor) {
        this.numero = numero;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    
}
