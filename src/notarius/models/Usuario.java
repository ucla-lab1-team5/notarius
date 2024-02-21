//
//package notarius.models;
//
//import javax.persistence.Basic;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//public class Usuario {
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private String cedula;
//    @Basic
//    private String nombreUsuario;
//    private String apellidos;
//    private int edad;
//    private char genero;
//    private String rol;
//
//    public Usuario() {
//    }
//
//    public Usuario(String nombreUsuario, String apellidos, String cedula, int edad, char genero, String rol) {
//        this.nombreUsuario = nombreUsuario;
//        this.apellidos = apellidos;
//        this.cedula = cedula;
//        this.edad = edad;
//        this.genero = genero;
//        this.rol = rol;
//    }
//
//    public String getNombre() {
//        return nombreUsuario;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombreUsuario= nombre;
//    }
//
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public String getCedula() {
//        return cedula;
//    }
//
//    public void setCedula(String cedula) {
//        this.cedula = cedula;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//
//    public char getGenero() {
//        return genero;
//    }
//
//    public void setGenero(char genero) {
//        this.genero = genero;
//    }
//
//    public String getRol() {
//        return rol;
//    }
//
//    public void setRol(String rol) {
//        this.rol = rol;
//    }
//    
//    
//}
