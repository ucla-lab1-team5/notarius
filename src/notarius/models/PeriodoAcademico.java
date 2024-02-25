/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notarius.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author hanumonke
 */
@Entity
public class PeriodoAcademico implements Serializable {
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToMany
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

    public PeriodoAcademico(Long id, List<Seccion> secciones, Date fechaInicio, Date fechaCierre, Date fechaTopeRetiro, Date fechaTopeInclusion, Date fechaTopePrimerParcial, Date fechaTopeSegundoParcial, Date fechaTopeTercerParcial, String codigo) {
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
        if (!(object instanceof PeriodoAcademico))
        {
            return false;
        }
        PeriodoAcademico other = (PeriodoAcademico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "notarius.models.PeriodoAcademico[ id=" + id + " ]";
    }
    
}
