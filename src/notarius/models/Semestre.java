
package notarius.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Semestre implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idSemestre;
    @Temporal(TemporalType.DATE)
    private Date semana;

    public Semestre() {
    }

    public Semestre(int idSemestre, Date semana) {
        this.idSemestre = idSemestre;
        this.semana = semana;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Date getSemana() {
        return semana;
    }

    public void setSemana(Date semana) {
        this.semana = semana;
    }


    
    
}
