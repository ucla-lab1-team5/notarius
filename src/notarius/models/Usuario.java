/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.models;

import java.io.Serializable;
import javax.persistence.Basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
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
    //atributos para condicionar funcionalidad
    private boolean profesor;
    private boolean estudiante;
    private boolean admin;

    public Usuario(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero, boolean es_profesor, boolean es_estudiante, boolean es_admin) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.profesor = es_profesor;
        this.estudiante = es_estudiante;
        this.admin = es_admin;
    }

    public Usuario() {
   
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

    public boolean isEs_profesor() {
        return profesor;
    }

    public void setEs_profesor(boolean es_profesor) {
        this.profesor = es_profesor;
    }

    public boolean isEs_estudiante() {
        return estudiante;
    }

    public void setEs_estudiante(boolean es_estudiante) {
        this.estudiante = es_estudiante;
    }

    public boolean isEs_admin() {
        return admin;
    }

    public void setEs_admin(boolean es_admin) {
        this.admin = es_admin;
    }
    
    
    
}
