
package notarius.models;


import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Materia implements Serializable {

     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idMateria;
     @OneToMany 
    
    private Seccion secciones;
    
    @Basic
    private String nombreMateria;
    private String descripcion;
    private int semestre;

    public Materia() {
    }

    public Materia(String idMateria,  Seccion secciones, String nombreMateria, String descripcion, int semestre) {
        this.idMateria = idMateria;
         this.secciones = secciones;
        this.nombreMateria = nombreMateria;  
        this.descripcion = descripcion;
        this.semestre = semestre;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Seccion getSecciones() {
        return secciones;
    }

    public void setSecciones(Seccion secciones) {
        this.secciones = secciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
