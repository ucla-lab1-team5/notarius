
package notarius.models;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Seccion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  //cambiar esto de la frecuencia??
    private int id;
    @OneToOne
    private Materia materia;
    @OneToOne
    private Decanato decanato;
    @OneToOne
    private Carrera carrera;
    @OneToOne
    private Usuario profesor;
    @OneToOne
    private Semestre semestre;
//  @OneToMany
//  private Calificacion calificaciones;
    @Basic
    private String codigo;

    public Seccion() {
    }

    public Seccion(int id, Materia materia, Decanato decanato, Carrera carrera, Usuario profesor, Semestre semestre, String codigo) {
        this.id = id;
        this.materia = materia;
        this.decanato = decanato;
        this.carrera = carrera;
        this.profesor = profesor;
        this.semestre = semestre;
        this.codigo = codigo;
    }

    public Usuario getProfesor() {
        return profesor;
    }

    public void setProfesor(Usuario profesor) {
        this.profesor = profesor;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Decanato getDecanato() {
        return decanato;
    }

    public void setDecanato(Decanato decanato) {
        this.decanato = decanato;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}