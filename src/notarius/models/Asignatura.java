
package notarius.models;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> a598430e2c927617a1dd89ce32bb4ce2af7cf94b
=======
>>>>>>> a598430e2c927617a1dd89ce32bb4ce2af7cf94b
=======
import java.io.Serializable;
>>>>>>> hanu/JPAimpl
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class Asignatura implements Serializable {
=======
public class Asignatura {
>>>>>>> a598430e2c927617a1dd89ce32bb4ce2af7cf94b
=======
public class Asignatura {
>>>>>>> a598430e2c927617a1dd89ce32bb4ce2af7cf94b
=======
public class Asignatura implements Serializable {
>>>>>>> hanu/JPAimpl
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idAsignatura;
     @Basic
    private String nombreAsignatura;

    public Asignatura() {
    }

    public Asignatura(String idAsignatura, String nombreAsignatura) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    
    
}
