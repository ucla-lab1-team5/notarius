/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Decanato implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@SequenceGenerator(name = "seq_name", sequenceName = "seq_name", allocationSize =  1)
    private int idDecanato; 
    @Basic
    private String nombre;
    private String ubicacion;
    private String rector;
    private String codigoDecanato;
    

    public Decanato() {
    }

    public Decanato(int idDecanato, String nombre, String programa, String rector, String codigoDecanato) {
        this.idDecanato = idDecanato;
        this.nombre = nombre;
        this.programa = programa;
        this.rector = rector;
        this.codigoDecanato = codigoDecanato;
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

    public String getCodigoDecanato() {
        return codigoDecanato;
    }

    public void setCodigoDecanato(String codigoDecanato) {
        this.codigoDecanato = codigoDecanato;
    }
    
    
}
