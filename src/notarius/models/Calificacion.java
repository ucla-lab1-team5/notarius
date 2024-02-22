
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author antho
 */
@Entity
public class Calificacion implements Serializable {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private long id;
    @OneToOne 
    private Estudiante estudiante;
    private Seccion seccion;
     @Basic

    private float primeraNota;
    private float segundaNota;
    private float terceraNota;
    private float notaFinal;
    private char status;
 
    
    public Calificacion() {
        }

    public Calificacion(long id, Estudiante estudiante, Seccion seccion, float primeraNota, float segundaNota, float terceraNota, float notaFinal, char status) {
        this.id = id;
        this.estudiante = estudiante;
        this.seccion = seccion;
        this.primeraNota = primeraNota;
        this.segundaNota = segundaNota;
        this.terceraNota = terceraNota;
        this.notaFinal = notaFinal;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public float getPrimeraNota() {
        return primeraNota;
    }

    public void setPrimeraNota(float primeraNota) {
        this.primeraNota = primeraNota;
    }

    public float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public float getTerceraNota() {
        return terceraNota;
    }

    public void setTerceraNota(float terceraNota) {
        this.terceraNota = terceraNota;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
    
    
}
