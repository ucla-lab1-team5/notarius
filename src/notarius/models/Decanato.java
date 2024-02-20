
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Decanato implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idDecanato; 
    @OneToMany
    private Carrera carreras;
    @Basic
    private String nombre;
    private String descripcion;
    
  
    

    public Decanato() {
    }

    public Decanato(int idDecanato, String nombre, String descripcion, Carrera carreras) {
        this.idDecanato = idDecanato;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.carreras = carreras;
    }

    public int getIdDecanato() {
        return idDecanato;
    }

    public void setIdDecanato(int idDecanato) {
        this.idDecanato = idDecanato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public Carrera getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera carreras) {
        this.carreras = carreras;
    }
    
    
    
}
