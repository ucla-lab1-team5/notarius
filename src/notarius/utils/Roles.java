
package notarius.utils;

/**
 *
 * @author hanumonke
 */
public class Roles {
    private boolean estudiante;    
    private boolean profesor;
    private boolean admin;

    public Roles() {
    }
    public Roles(boolean estudiante, boolean profesor, boolean admin) {
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.admin = admin;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public boolean isProfesor() {
        return profesor;
    }

    public void setProfesor(boolean profesor) {
        this.profesor = profesor;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

 

    
}
