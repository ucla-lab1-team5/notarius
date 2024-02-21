//
//package notarius.models;
//
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Profesor extends Usuario implements Serializable{
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private String idProfesor; 
//    @Basic
//    private Materia materias;
//
//    public Profesor() {
//    }
//
//    public Profesor(String idProfesor, Materia materias) {
//        this.idProfesor = idProfesor;
//        this.materias = materias;
//    }
//
//    public String getIdProfesor() {
//        return idProfesor;
//    }
//
//    public void setIdProfesor(String idProfesor) {
//        this.idProfesor = idProfesor;
//    }
//
//    public Materia getMaterias() {
//        return materias;
//    }
//
//    public void setMaterias(Materia materias) {
//        this.materias = materias;
//    }
//    
//    
//}
