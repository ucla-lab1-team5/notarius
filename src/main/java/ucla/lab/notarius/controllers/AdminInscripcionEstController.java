/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucla.lab.notarius.controllers;

/**
 *
 * @author hanumonke
 */

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import ucla.lab.notarius.models.Estudiante;
import ucla.lab.notarius.models.Inscripcion;
import ucla.lab.notarius.models.Materia;
import ucla.lab.notarius.models.PeriodoAcademico;
import ucla.lab.notarius.models.Seccion;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.views.AdminInscripcionEstView1;


public class AdminInscripcionEstController {
    private AdminInscripcionEstView1 view;
    private Estudiante estudianteAInscribir;
    private List<Seccion> seccionesDisponibles;
    private List<Seccion> seccionesPaLaInscripcion;
    private List<String> seccionesSeleccioniadas;
    private PersistenceService ps;
    public AdminInscripcionEstController(AdminInscripcionEstView1 view) {
        this.view = view;
        this.seccionesPaLaInscripcion = new ArrayList<>();
        this.seccionesSeleccioniadas = new ArrayList<>();
        this.view.submitCargarButton(e -> cargarEstudiante());
        this.view.submitInscribirButton(e -> inscribirEstudiante());
        this.view.submitAgregarSeccionButton(e -> agregarSecccionAInscripcion());
        this.view.submitMateriaSeccionada(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED) {
                            String selectedItem = (String) e.getItem();
                            cargarSecciones(selectedItem);
                        }
                    }
                });

        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
    
    }

    public void cerrarVista () {
        this.view.setVisible(false);
        this.view.dispose();
    }

    public void cargarEstudiante () {

        String cedula = this.view.getCedula();
        ps = null;
        ps = new PersistenceService();
        //cargar datos basicos de estudiante
        this.estudianteAInscribir = ps.estudiante.findEstudianteWithCedula(cedula);
        
        this.view.setNombres(estudianteAInscribir.getNombres());
        this.view.setApellidos(estudianteAInscribir.getApellidos());

        //cargar materias
        
        this.seccionesDisponibles = ps.estudiante.findSeccionesDisponibles(estudianteAInscribir);
        List<Materia> materiasDisponibles = new ArrayList<>();
        for (Seccion s : seccionesDisponibles) {
            if (!materiasDisponibles.contains(s.getMateria())) {
                materiasDisponibles.add(s.getMateria());
            }
        }
        ArrayList<String> materiasDisponiblesString = new ArrayList<>();
        for (Materia m : materiasDisponibles) {
            materiasDisponiblesString.add(m.getNombre());
        }

        this.view.setComboBoxMaterias(materiasDisponiblesString.toArray(new String[0]));
        

        ps = null;

    }

    public void cargarSecciones (String selectedItem) {
        ArrayList<String> secciones = new ArrayList<>();
        for (Seccion s : this.seccionesDisponibles) {
            if (s.getMateria().getNombre() == selectedItem) {
                secciones.add(s.getCodigo());
                
            }
        }
        this.view.setComboBoxSecciones(secciones.toArray(new String[0]));

    }

    public void agregarSecccionAInscripcion() {
        String seccionSeleccionada = this.view.getSeleccionSeccionesComboBox();
        this.seccionesSeleccioniadas.add(seccionSeleccionada);
        
        System.out.println(this.seccionesSeleccioniadas.toString());
        this.view.setseccionesElegidas(this.seccionesSeleccioniadas.toArray(new String[0]));

    }

    public void inscribirEstudiante() {
        for (Seccion sd : seccionesDisponibles) {
            if(seccionesSeleccioniadas.contains(sd.getCodigo())) {
                System.out.println(sd.getCodigo());
                seccionesPaLaInscripcion.add(sd);
            }
        }
       
        ps = new PersistenceService();
        PeriodoAcademico ultimoPeriodo = ps.periodoAcademico.findLastPeriodo();
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setCarrera(this.estudianteAInscribir.getCarrera());
        inscripcion.setDecanato(this.estudianteAInscribir.getCarrera().getDecanato());
        inscripcion.setEstudiante(estudianteAInscribir);
        inscripcion.setPeriodo(ultimoPeriodo);
        inscripcion.setSecciones(seccionesDisponibles);
        ps.inscripcion.create(inscripcion);
    }

    public void clear(){
    
    
    }
    
}
