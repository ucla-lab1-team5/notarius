
package notarius.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @OneToOne
    private Decanato decanato;
    @ManyToMany(mappedBy = "carreras")
    private Set<Materia> materias;
    
    @Basic
    private String nombre;
    private String descripcion;

    public Carrera() {
    }

    public Carrera(int id, Decanato decanato, Set<Materia> materias, String nombre, String descripcion) {
        this.id = id;
        this.decanato = decanato;
        this.materias = materias;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Decanato getDecanato() {
        return decanato;
    }

    public void setDecanato(Decanato decanato) {
        this.decanato = decanato;
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

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public int getIdCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
    
}
