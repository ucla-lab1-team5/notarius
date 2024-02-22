
package notarius.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Semestre {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idSemestre;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCierre;
    private int semana;
    private String periodo;

    public Semestre() {
    }

    public Semestre(int idSemestre, Date fechaInicio, Date fechaCierre, int semana, String periodo) {
        this.idSemestre = idSemestre;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.semana = semana;
        this.periodo = periodo;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
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

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
   


    
    
}
