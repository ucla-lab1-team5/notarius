
package ucla.lab.notarius.controllers;
import java.awt.event.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.views.GestionEstudianteView;

public class GestionEstudianteController {
    private GestionEstudianteView view;
    private PersistenceService ps;
    
    public GestionEstudianteController (GestionEstudianteView gestionEstudianteView) {
        this.view = gestionEstudianteView;
        this.ps = null;

        this.view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent evt) {
                //cargarLOQUESEAs();
            }
        });

      //  this.view.submitButtonAgregarDec(e -> agregarDecanato());
       // this.view.submitButtonEliminarDec(e -> eliminarDecanato());
       // this.view.submitActualizarButtonDec(e -> actualizarDecanato());

        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
    }
    
    public void cargarEstudiantes(){
        //CONSTRUIR TITULOS DE TABLA
        String estudianteColumns[] =
        {
            "ID", "Cedula", "Nombres", "Apellidos", "Carrera", "Genero", "Edad"
        };
        // INSTANCIAR MODELO DE LA TABLA Y DESACTIVAR EDICION DE CELDAS
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        tableModel.setColumnIdentifiers(estudianteColumns);
        view.tableEstudiante.setModel(tableModel);
        
//CARGAR DATOS DE LA DB
         ps = new PersistenceService();
        List<Estudiante> listaEstudiantes = ps.estudiante.findEstudianteEntities();

        
        if (listaEstudiantes != null)
        {

            for (Estudiante e : listaEstudiantes)
            {
                String id = Long.toString(e.getId());
                String cedula = e.getCedula();
                String nombres = e.getNombres();
                String apellidos = e.getApellidos();
                String carrera = e.getCarrera().getNombre();      //getNombre es para tener el String desde Carrera
                String genero = Character.toString((e.getGenero()));          //tiene que ser un CHAR
                String edad = Integer.toString(e.getEdad());

                String estudianteRow[] =
                {
                    id , cedula, nombres, apellidos, carrera, genero, edad
                };

                tableModel.addRow(estudianteRow);
            }

        }
        ps = null;  
    }
    
    public void agregarEstudiante(){
        
      if (validarCampos()){
        System.err.println("Error, hay campos vacíos");
        return;
      }
      
      
        Estudiante estudianteAAgregar = new Estudiante();
        estudianteAAgregar.setCedula(view.getCedula());
        estudianteAAgregar.setNombres(view.getNombre());
        estudianteAAgregar.setApellidos(view.getApellido());
     //   estudianteAAgregar.setCarrera(view.getCarrera());
        estudianteAAgregar.setGenero(view.getGenero().charAt(0));       //EL PARAMETRO DEBE SER CERO ? @HANUMÁ
        estudianteAAgregar.setEdad(Integer.parseInt(view.getEdad()));
       
        ps = new PersistenceService();
        ps.estudiante.create(estudianteAAgregar);
      cargarEstudiantes();
     
      
    }
     public void eliminarEstudiante(){
      if (validarCampos()){
        System.err.println("Error, hay campos vacíos");
        return;
      }
       int id = Integer.valueOf(view.getEstudianteSeleccionado());
       ps = new PersistenceService();
         try {
           Estudiante e = ps.estudiante.findEstudiante(id);
           e.setCedula(view.getCedula());
           e.setNombres(view.getNombre());
           e.setApellidos(view.getApellido());
           e.setEdad(Integer.parseInt(view.getEdad()));
           e.setGenero(view.getGenero().charAt(0));
          // e.setCarrera(getNombre(view.getCarrera()));        //PENDIENTE POR REVISAAR NO FUNCIONOY FALTA PROBAR
           
            ps.estudiante.edit(e);
        }catch (NonexistentEntityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(GestionEstudianteController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      
    }
      public void actualizarEstudiante(){
      if (validarCampos()){
        System.err.println("Error, hay campos vacíos");
        return;
      }
    }
    
    
    
    

public boolean validarCampos () {
         System.out.println("Comprobando campos");
         if (this.view.getNombre() == null || this.view.getNombre().trim().isEmpty()) {
            return true;}
         if (this.view.getApellido() == null || this.view.getApellido().trim().isEmpty()){   
              return true;
          }
         if (this.view.getUsername() == null || this.view.getUsername().trim().isEmpty()){   
              return true;
          }
         if (this.view.getCedula() == null || this.view.getCedula().trim().isEmpty()) {
            return true;}
         if (this.view.getGenero() == null || this.view.getGenero().trim().isEmpty()){   
              return true;
          }
         if (this.view.getEdad() == null || this.view.getEdad().trim().isEmpty()){   
              return true;
          }
          if (this.view.getCarrera() == null || this.view.getCarrera().trim().isEmpty()) {
            return true;}
        if (this.view.getPassword() == null || this.view.getPassword().trim().isEmpty()) {
            return true;}
        
        
        
                return false;
     } 

    
}
