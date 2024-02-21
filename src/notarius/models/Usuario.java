
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
@Inheritance(strategy=InheritanceType.JOINED)
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
//    private boolean es_profesor;
//    private boolean es_estudiante;
//    private boolean es_admin;

    public Usuario() {
    }

    public Usuario(long id, String nombreUsuario, String clave, String cedula, String nombres, String apellidos, int edad, char genero) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
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
