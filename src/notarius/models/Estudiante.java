
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Estudiante extends Usuario implements Serializable{
    @OneToOne
    private Carrera carrera;
    @OneToOne
    private Semestre semestreActual;
    @Basic
    private double promedio;
    private int semestre;

    public Estudiante() {
    }

    public Estudiante(Carrera carrera, Semestre semestreActual, double promedio, int semestre, long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero) {
        super(id, nombreUsuario, clave, cedula, nombres, apellidos, edad, genero);
        this.carrera = carrera;
        this.semestreActual = semestreActual;
        this.promedio = promedio;
        this.semestre = semestre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Semestre getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(Semestre semestreActual) {
        this.semestreActual = semestreActual;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
}
