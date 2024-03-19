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
import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@DiscriminatorValue(value = "user")
public class Estudiante extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany(mappedBy="estudiante")
    private List<Calificacion> calificaciones;
    
    @OneToOne 
    private Carrera carrera;
    
    @ManyToOne
    private PeriodoAcademico periodo;
    
    @Basic
    private float promedio;
    private int semestre;
    

    public Estudiante() {
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }



    public Estudiante(int id, List<Calificacion> calificaciones, PeriodoAcademico periodo, float promedio, int semestre, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean administrador, boolean estudiante, boolean profesor) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero, administrador, estudiante, profesor);
        this.id = id;
        this.calificaciones = calificaciones;
        this.periodo = periodo;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder estudianteString = new StringBuilder("Estudiante ");
        estudianteString.append(getNombres()).append(" - Cedula ").append(getCedula()).append(" - id: ").append(getId());
        return estudianteString.toString();
    }
    
}
