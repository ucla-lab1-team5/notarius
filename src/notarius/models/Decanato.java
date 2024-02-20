
package notarius.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Decanato{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idDecanato; 
    @Basic
    private Carrera carreras;
    private String nombre;
    

    public Decanato() {
    }

    public Decanato(int idDecanato, String nombre, Carrera carreras) {
        this.idDecanato = idDecanato;
        this.nombre = nombre;
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

    public Carrera getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera carreras) {
        this.carreras = carreras;
    }
    
    
    
}
