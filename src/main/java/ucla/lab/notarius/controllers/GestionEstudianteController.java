package ucla.lab.notarius.controllers;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Carrera;
import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.utils.Reporte;
import ucla.lab.notarius.views.GestionEstudianteView;

public class GestionEstudianteController {

    private GestionEstudianteView view;
    private PersistenceService ps;

    public GestionEstudianteController(GestionEstudianteView gestionEstudianteView) {
        this.view = gestionEstudianteView;
        this.ps = null;

        this.view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent evt) {
              cargarCarreras();
              cargarEstudiantes();
              cargarReportes();
            }
        });

        this.view.submitButtonAgregarEstudiante(e -> agregarEstudiante());
        this.view.submitButtonELiminarEstudiante(e -> eliminarEstudiante());
        this.view.submitButtonActualzarEstudiante(e -> actualizarEstudiante());
        this.view.submitButtonImprimirReportes(e -> mostrarReporte());

        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
    }

    public void cargarEstudiantes() {
        //CONSTRUIR TITULOS DE TABLA
        String estudianteColumns[]
                = {
                    "ID", "Cedula", "Nombres", "Apellidos", "Carrera", "Genero", "Edad", "Semestre"
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

        if (listaEstudiantes != null) {

            for (Estudiante e : listaEstudiantes) {
                String id = Long.toString(e.getId());
                String cedula = e.getCedula();
                String nombres = e.getNombres();
                String apellidos = e.getApellidos();
                String carrera = e.getCarrera().getNombre();      //getNombre es para tener el String desde Carrera
                String genero = Character.toString((e.getGenero()));          //tiene que ser un CHAR
                String edad = Integer.toString(e.getEdad());
                String semestre = Integer.toString(e.getSemestre());

                String estudianteRow[]
                        = {
                            id, cedula, nombres, apellidos, carrera, genero, edad, semestre
                        };

                tableModel.addRow(estudianteRow);
            }

        }
        ps = null;
    }

    public void agregarEstudiante() {
         ps = new PersistenceService();
        if (validarCampos()) {
            System.err.println("Error, hay campos vacíos");
            return;
        }

        Estudiante estudianteAAgregar = new Estudiante();
        estudianteAAgregar.setCedula(view.getCedula());
        estudianteAAgregar.setNombres(view.getNombre());
        estudianteAAgregar.setApellidos(view.getApellido());
        Carrera carreraEstudiante = ps.carrera.findCarreraByNombre(view.getCarrera());
        estudianteAAgregar.setCarrera(carreraEstudiante);
        estudianteAAgregar.setGenero(view.getGenero().charAt(0));       //EL PARAMETRO DEBE SER CERO ? @HANUMÁ
        estudianteAAgregar.setEdad(Integer.parseInt(view.getEdad()));
        estudianteAAgregar.setSemestre(1);
        estudianteAAgregar.setEstudiante(true);
        ps.estudiante.create(estudianteAAgregar);
        System.out.println("Estudiante registrado exitosamente");
        cargarEstudiantes();

    }

    public void eliminarEstudiante() {
        if (validarCampos()) {
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
        } catch (NonexistentEntityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(GestionEstudianteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void actualizarEstudiante() {
        if (validarCampos()) {
            System.err.println("Error, hay campos vacíos");
            return;
        }
        // logica de actualizacion
    }

    public void alertaCampoVacio(String campoNombre) {
        System.err.println("Elemento" + campoNombre + " vacio o no seleccionado");
    }
    public boolean validarCampos() {
       
        if (this.view.getNombre() == null || this.view.getNombre().trim().isEmpty()) {
            alertaCampoVacio(view.getNombre());
            return true;
        }
        if (this.view.getApellido() == null || this.view.getApellido().trim().isEmpty()) {
             alertaCampoVacio(view.getApellido());
            return true;
        }
        if (this.view.getUsername() == null || this.view.getUsername().trim().isEmpty()) {
             alertaCampoVacio(view.getUsername());
            return true;
        }
        if (this.view.getCedula() == null || this.view.getCedula().trim().isEmpty()) {
             alertaCampoVacio(view.getCedula());
            return true;
        }
        if (this.view.getGenero() == null || this.view.getGenero().trim().isEmpty()) {
             alertaCampoVacio(view.getGenero());
            return true;
        }
        if (this.view.getEdad() == null || this.view.getEdad().trim().isEmpty()) {
             alertaCampoVacio(view.getEdad());
            return true;
        }
        if (this.view.getCarrera() == null || this.view.getCarrera().trim().isEmpty() || "Carrera".equals(this.view.getCarrera())) {
             alertaCampoVacio(view.getCarrera());
            return true;
        }
        if (this.view.getPassword() == null || this.view.getPassword().trim().isEmpty()) { alertaCampoVacio(view.getPassword());
            
            return true;
        }

        return false;
    }

    public void cargarCarreras() {
        ArrayList <String> carrerasString = new ArrayList<>();
        ps = new PersistenceService();
        List<Carrera> carrerasDB = ps.carrera.findCarreraEntities();
        for (Carrera c : carrerasDB) {
            carrerasString.add(c.getNombre());
        }
        
        this.view.setCarreras(carrerasString.toArray(new String[0]));
        
    }
    
    public void mostrarReporte() {
        if ( view.getReporteSeleccionado() == 0) {
            System.err.println("No has seleccionado ningun reporte");
            return;
        }
        System.out.println("Imprimiendo reporte seleccionado");
        
        Reporte r = null;
        switch (view.getReporteSeleccionado()) {
            case 1:
                r = new Reporte("jasper/1_Notarius_Students_With_Materia_Retirada.jrxml");
          
                break;
            case 2:
                r = new Reporte("jasper/2_Notarius_Students_Per_Career.jrxml");
                
                break;
            case 3:
                r = new Reporte("jasper/3_Notarius_Students_Per_Semester.jrxml");
                break;
              case 4:
                r = new Reporte("jasper/4_Notarius_Students_20_Best_By_Decanato.jrxml");
                break;
              case 5:
                r = new Reporte("jasper/4_Notarius_Students_20_Best_By_Decanato.jrxml");
                break;
              case 6:
                r = new Reporte("jasper/4_Notarius_Students_20_Best_By_Decanato.jrxml");
                break;
              case 7:
                  System.err.println("Lo sentimos, aun no tenemos este reporte");
//                r = new Reporte("jasper/");
                break;
            default:
                throw new AssertionError();
        }
        r.showReport();
    
    }
    
     public void cargarReportes() {
        String[] reportes = {
            "Reportes", 
            "Estudiantes con Materia Retirada", //-1
            "Estudiantes por Carrera", //-2
            "Estudiantes por Semestre", //-3
            "20 mejores estudantes por Decanato", //-4
            "Estudiantes por Genero de Carrera y Decanato", //-5
            "Estudiantes reprobados", //-6
            "Estudiantes con materias retiradas", //-7
            "Estudiantes con promedio mayor a 16 por seccion" //-8
        };
        
        this.view.setReportes(reportes);
        
        
    }
}
