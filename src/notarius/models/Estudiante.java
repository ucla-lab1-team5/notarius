
package notarius.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante extends Usuario{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idEstudiante;
    @Basic
    private Carrera carrera;
    private Seccion seccion;
    private double promedio;
    private Semestre semestre;

    public Estudiante() {
    }

    public Estudiante(String idEstudiante, Carrera carrera, Seccion seccion, double promedio, Semestre semestre) {
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.seccion = seccion;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
    
    
    
}
