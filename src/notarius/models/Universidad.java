
package notarius.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Universidad {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String nombre;
    @Basic
    private Decanato decanatos;

    public Universidad() {
    }

    public Universidad(String nombre, Decanato decanatos) {
        this.nombre = nombre;
        this.decanatos = decanatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Decanato getDecanatos() {
        return decanatos;
    }

    public void setDecanatos(Decanato decanatos) {
        this.decanatos = decanatos;
    }
    
   
    
    
}
