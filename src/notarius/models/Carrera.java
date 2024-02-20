
package notarius.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Carrera {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCarrera;
    @Basic
    private String nombreCarrera;
    private Asignatura asignaturas;

    public Carrera() {
    }

    public Carrera(int idCarrera, String nombreCarrera, Asignatura asignaturas) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.asignaturas = asignaturas;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Asignatura getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
    
    
}
