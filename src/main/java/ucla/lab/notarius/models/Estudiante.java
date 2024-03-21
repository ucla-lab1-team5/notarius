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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Estudiante extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany(mappedBy="estudiante")
    private List<Calificacion> calificaciones;
    
    @ManyToOne
    private PeriodoAcademico periodo;
    @Basic
    
    private float promedio;
    private int semestre;
    

    public Estudiante() {
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
        return "notarius.models.Estudiante[ id=" + id + " ]";
    }
    
}
