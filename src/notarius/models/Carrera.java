
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCarrera;
    @ManyToMany
    private Materia materias;
    @Basic
    private String nombreCarrera;
    private String nombreDecanato;

    public Carrera() {
    }

    public Carrera(int idCarrera, String nombreCarrera, Materia materias, String nombreDecanato) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.materias = materias;
        this.nombreDecanato = nombreDecanato;
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

    public Materia getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materias) {
        this.materias = materias;
    }

    public String getDecanato() {
        return nombreDecanato;
    }

    public void setDecanato(String nombreDecanato) {
        this.nombreDecanato = nombreDecanato;
    }
    
    
    
    
}
