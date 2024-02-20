
package notarius.models;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author antho
 */
@Entity
public class Calificacion {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)  //cambiar esto de la frecuencia??
    private Estudiante idEstudiante;
     @Basic
    private Seccion numero;
    private float primeraNota;
    private float segundaNota;
    private float terceraNota;
    private float notaFinal;
    private char status;
 
    
    public Calificacion() {
    }

    public Calificacion(Estudiante idEstudiante, Seccion numero, float primeraNota, float segundaNota, float terceraNota, float notaFinal, char status) {
        this.idEstudiante = idEstudiante;
        this.numero = numero;
        this.primeraNota = primeraNota;
        this.segundaNota = segundaNota;
        this.terceraNota = terceraNota;
        this.notaFinal = notaFinal;
        this.status = status;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Seccion getNumero() {
        return numero;
    }

    public void setNumero(Seccion numero) {
        this.numero = numero;
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
