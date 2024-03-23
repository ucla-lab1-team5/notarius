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

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="Inscripcion_Seq", allocationSize=1)
    @GeneratedValue(strategy=SEQUENCE, generator="Inscripcion_Seq")
    private int id;
    
    @ManyToMany
    @JoinTable(
        name = "inscripcion_seccion", 
        joinColumns = @JoinColumn(name="inscripcion_id"), 
        inverseJoinColumns = @JoinColumn(name="seccion_id")
        
        )
    private List<Seccion> secciones;

    @OneToOne
    private PeriodoAcademico periodo;
    @OneToOne
    private Estudiante estudiante;
    @OneToOne
    private Carrera carrera; 
    @OneToOne
    private Decanato decanato;
    private int semestre;

    public Inscripcion() {
    }

    public Inscripcion(int id, List<Seccion> secciones, PeriodoAcademico periodo, Estudiante estudiante, Carrera carrera, Decanato decanato, int semestre) {
        this.id = id;
        this.secciones = secciones;
        this.periodo = periodo;
        this.estudiante = estudiante;
        this.carrera = carrera;
        this.decanato = decanato;
        this.semestre = semestre;
    }

    public Inscripcion (Estudiante estudiante, List<Seccion> secciones, PeriodoAcademico periodoMasReciente) {
        this.secciones = secciones;
        this.periodo = periodoMasReciente;
        this.estudiante = estudiante;
        this.carrera = estudiante.getCarrera();
        this.decanato = estudiante.getCarrera().getDecanato();
        this.semestre = estudiante.getSemestre();
    
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

    public PeriodoAcademico getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoAcademico periodo) {
        this.periodo = periodo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Decanato getDecanato() {
        return decanato;
    }

    public void setDecanato(Decanato decanato) {
        this.decanato = decanato;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    


    @Override
    public String toString() {
        return "notarius.models.Inscripcion[ id=" + id + " ]";
    }
    
}
