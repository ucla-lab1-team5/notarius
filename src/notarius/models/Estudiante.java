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
//public class Estudiante extends Usuario implements Serializable{
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Usuario idUsuario;
//    @Basic
//    private Carrera carrera;
//    private Seccion seccion;
//    private double promedio;
//    private int semestre;
//
//    public Estudiante() {
//    }
//
//    public Estudiante(Usuario idUsuario, Carrera carrera, Seccion seccion, double promedio, int semestre) {
//        this.idUsuario = idUsuario;
//        this.carrera = carrera;
//        this.seccion = seccion;
//        this.promedio = promedio;
//        this.semestre = semestre;
//    }
//
//    public Usuario getIdEstudiante() {
//        return idUsuario;
//    }
//
//    public void setIdEstudiante(Usuario idUsuario) {
//        this.idUsuario = idUsuario;
//    }
//
//    public Carrera getCarrera() {
//        return carrera;
//    }
//
//    public void setCarrera(Carrera carrera) {
//        this.carrera = carrera;
//    }
//
//    public Seccion getSeccion() {
//        return seccion;
//    }
//
//    public void setSeccion(Seccion seccion) {
//        this.seccion = seccion;
//    }
//
//    public double getPromedio() {
//        return promedio;
//    }
//
//    public void setPromedio(double promedio) {
//        this.promedio = promedio;
//    }
//
//    public int  getSemestre() {
//        return semestre;
//    }
//
//    public void setSemestre(int semestre) {
//        this.semestre = semestre;
//    }
//    
//    
//    
//}
