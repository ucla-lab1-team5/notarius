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
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="Materia_Seq", allocationSize=1)
    @GeneratedValue(strategy=SEQUENCE, generator="Materia_Seq")
    private int id;
    
    //many to many con carreras
    @ManyToMany(mappedBy = "materias")
    private List<Carrera> carreras;
    
    @OneToMany(mappedBy="materia")
    private List<Seccion> secciones;
    @Basic
    private String nombre;
    private String descripcion;
    

    public Materia() {
    }

    public Materia(int id, List<Carrera> carreras, List<Seccion> secciones, String nombre, String descripcion) {
        this.id = id;
        this.carreras = carreras;
        this.secciones = secciones;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "notarius.models.Materia[ id=" + id + " ]";
    }
    
}
