/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Calificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="Calification_Seq", allocationSize=1)
    @GeneratedValue(strategy=SEQUENCE, generator="Calification_Seq")
    private int id;
    
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Seccion seccion;
    @OneToOne
    private Materia materia;
    @ManyToOne
    private PeriodoAcademico periodo;
    private float primeraNota;
    private float segundaNota;
    private float terceraNota;
    private float notaFinal;
    private String status;

    public Calificacion() {
    }

    public Calificacion(int id, Estudiante estudiante, Seccion seccion, Materia materia, PeriodoAcademico periodo, float primeraNota, float segundaNota, float terceraNota, float notaFinal, String status) {
        this.id = id;
        this.estudiante = estudiante;
        this.seccion = seccion;
        this.materia = materia;
        this.periodo = periodo;
        this.primeraNota = primeraNota;
        this.segundaNota = segundaNota;
        this.terceraNota = terceraNota;
        this.notaFinal = notaFinal;
        this.status = status;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "notarius.models.Calificacion[ id=" + id + " ]";
    }
    
}
