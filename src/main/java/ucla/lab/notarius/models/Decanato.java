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
import javax.persistence.OneToMany;


@Entity
public class Decanato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    // lista carreras
    @OneToMany(mappedBy="decanato")
    private List<Carrera> carreras;
    @Basic
    private String nombre;
    private String ubicacion; 
    private String rector;

    public Decanato() {
    }

    public Decanato(int id, List<Carrera> carreras, String nombre, String ubicacion, String rector) {
        this.id = id;
        this.carreras = carreras;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.rector = rector;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void agregarCarrera(Carrera c) {
        c.setDecanato(this);
        this.carreras.add(c);
    }
   
    @Override
    public String toString() {
        return "notarius.models.Decanato[ id=" + id + ", " + nombre +", " + rector +"," + ubicacion +"]";
    }
    
}
