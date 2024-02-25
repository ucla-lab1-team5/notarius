/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notarius.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hanumonke
 */
@Entity
public class Calificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private Seccion seccion;
    @ManyToOne
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

    public Calificacion(Long id, Estudiante estudiante, Seccion seccion, Materia materia, PeriodoAcademico periodo, float primeraNota, float segundaNota, float terceraNota, float notaFinal, String status) {
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
        
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificacion))
        {
            return false;
        }
        Calificacion other = (Calificacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "notarius.models.Calificacion[ id=" + id + " ]";
    }
    
}
