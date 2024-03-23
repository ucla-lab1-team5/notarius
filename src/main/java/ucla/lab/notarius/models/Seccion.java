/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Seccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne
    private Materia materia;
    @ManyToOne
    private Decanato decanato;
    @ManyToOne
    private Carrera carrera;
     
    //OneToMany con calificaciones
    @OneToMany(mappedBy="seccion")
    private List<Calificacion> calificaciones;
    // Many to One con periodo academico
    @ManyToOne
    private PeriodoAcademico periodo;
    // Many to One con profesor
    @ManyToOne
    private Profesor profesor;

   
     @ManyToMany(mappedBy = "secciones", cascade = CascadeType.ALL)
    private List<Inscripcion> inscripciones;

    @Basic
    private String codigo;

    public Seccion() {
    }

    public Seccion(int id, Materia materia, Decanato decanato, Carrera carrera, List<Calificacion> calificaciones, List<Inscripcion> inscripciones, PeriodoAcademico periodo, Profesor profesor, String codigo) {
        this.id = id;
        this.materia = materia;
        this.decanato = decanato;
        this.carrera = carrera;
        this.calificaciones = calificaciones;
        this.periodo = periodo;
        this.profesor = profesor;
        this.codigo = codigo;
        this.inscripciones = inscripciones;
    }


    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Decanato getDecanato() {
        return decanato;
    }

    public void setDecanato(Decanato decanato) {
        this.decanato = decanato;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    @Override
    public String toString() {
        return "notarius.models.Seccion[ id=" + id + " ]";
    }
    
}
