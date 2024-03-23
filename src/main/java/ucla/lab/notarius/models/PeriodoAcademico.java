/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author hanumonke
 */
@Entity
public class PeriodoAcademico implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    // @SequenceGenerator(name="PeriodoAcademico_Seq", allocationSize=1)
    // @GeneratedValue(strategy=SEQUENCE, generator="PeriodoAcademico_Seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany(mappedBy="periodo")
    private List<Seccion> secciones; 
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCierre;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTopeRetiro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTopeInclusion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTopePrimerParcial;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTopeSegundoParcial;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaTopeTercerParcial;
    private String codigo;



    public PeriodoAcademico() {
    }

    public PeriodoAcademico(int id, List<Seccion> secciones, Date fechaInicio, Date fechaCierre, Date fechaTopeRetiro, Date fechaTopeInclusion, Date fechaTopePrimerParcial, Date fechaTopeSegundoParcial, Date fechaTopeTercerParcial, String codigo) {
        this.id = id;
        this.secciones = secciones;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.fechaTopeRetiro = fechaTopeRetiro;
        this.fechaTopeInclusion = fechaTopeInclusion;
        this.fechaTopePrimerParcial = fechaTopePrimerParcial;
        this.fechaTopeSegundoParcial = fechaTopeSegundoParcial;
        this.fechaTopeTercerParcial = fechaTopeTercerParcial;
        this.codigo = codigo;
    }
    
 
    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Date getFechaTopeRetiro() {
        return fechaTopeRetiro;
    }

    public void setFechaTopeRetiro(Date fechaTopeRetiro) {
        this.fechaTopeRetiro = fechaTopeRetiro;
    }

    public Date getFechaTopeInclusion() {
        return fechaTopeInclusion;
    }

    public void setFechaTopeInclusion(Date fechaTopeInclusion) {
        this.fechaTopeInclusion = fechaTopeInclusion;
    }

    public Date getFechaTopePrimerParcial() {
        return fechaTopePrimerParcial;
    }

    public void setFechaTopePrimerParcial(Date fechaTopePrimerParcial) {
        this.fechaTopePrimerParcial = fechaTopePrimerParcial;
    }

    public Date getFechaTopeSegundoParcial() {
        return fechaTopeSegundoParcial;
    }

    public void setFechaTopeSegundoParcial(Date fechaTopeSegundoParcial) {
        this.fechaTopeSegundoParcial = fechaTopeSegundoParcial;
    }

    public Date getFechaTopeTercerParcial() {
        return fechaTopeTercerParcial;
    }

    public void setFechaTopeTercerParcial(Date fechaTopeTercerParcial) {
        this.fechaTopeTercerParcial = fechaTopeTercerParcial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "notarius.models.PeriodoAcademico[ id=" + id + " ]";
    }
    
}
