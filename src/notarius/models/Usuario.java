
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Basic
    // atributos genericos
    private String nombreUsuario;
    private String clave;
    private String cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private char genero;
    // atributos para condicionar funcionalidad
    private boolean es_profesor;
    private boolean es_estudiante;
    private boolean es_admin;

    public Usuario() {
    }

    public Usuario(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean es_profesor, boolean es_estudiante, boolean es_admin) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.es_profesor = es_profesor;
        this.es_estudiante = es_estudiante;
        this.es_admin = es_admin;
    }

    public boolean isEs_profesor() {
        return es_profesor;
    }

    public void setEs_profesor(boolean es_profesor) {
        this.es_profesor = es_profesor;
    }

    public boolean isEs_estudiante() {
        return es_estudiante;
    }

    public void setEs_estudiante(boolean es_estudiante) {
        this.es_estudiante = es_estudiante;
    }

    public boolean isEs_admin() {
        return es_admin;
    }

    public void setEs_admin(boolean es_admin) {
        this.es_admin = es_admin;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    
}
