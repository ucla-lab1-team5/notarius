
package notarius.models;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seccion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  //cambiar esto de la frecuencia??
    private int numero;
    @OneToMany
    private Calificacion calificaciones;
    @Basic
    private String nombreMateria;
    private String profesorUsuarioId;
    private String nombreDecanato;
    private String carrera;
    private int periodo;

    public Seccion() {
    }

    public Seccion(int numero, Calificacion calificaciones, String nombreMateria, String profesorUsuarioId, String nombreDecanato, String carrera, int periodo) {
        this.numero = numero;
        this.calificaciones = calificaciones;
        this.nombreMateria = nombreMateria;
        this.profesorUsuarioId = profesorUsuarioId;
        this.nombreDecanato = nombreDecanato;
        this.carrera = carrera;
        this.periodo = periodo;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calificacion getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Calificacion calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getProfesorUsuarioId() {
        return profesorUsuarioId;
    }

    public void setProfesorUsuarioId(String profesorUsuarioId) {
        this.profesorUsuarioId = profesorUsuarioId;
    }

    public String getNombreDecanato() {
        return nombreDecanato;
    }

    public void setNombreDecanato(String nombreDecanato) {
        this.nombreDecanato = nombreDecanato;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
      
    
    
    
}
