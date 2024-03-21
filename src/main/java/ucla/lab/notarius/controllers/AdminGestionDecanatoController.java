package ucla.lab.notarius.controllers;
// importando todo de los eventos
import java.awt.event.*;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import ucla.lab.notarius.controllers.exceptions.NonexistentEntityException;
import ucla.lab.notarius.models.Decanato;
import ucla.lab.notarius.models.services.DecanatoService;
import ucla.lab.notarius.models.services.PersistenceService;
import ucla.lab.notarius.views.AdminGestionDecanatoView;

public class AdminGestionDecanatoController {
    private AdminGestionDecanatoView view;
    private PersistenceService ps;

    public AdminGestionDecanatoController (AdminGestionDecanatoView adminGestionDecanatoView) {
        this.view = adminGestionDecanatoView;
        this.ps = null;

        this.view.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                cargarDecanatos();
            }
        });

        this.view.submitButtonAgregarDec(e -> agregarDecanato());
        this.view.submitButtonEliminarDec(e -> eliminarDecanato());

        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);
    }



    public void cargarDecanatos() {

        //CONSTRUIR TITULOS DE TABLA
        String decanatoColumns[] =
        {
            "ID", "Nombre", "Ubicacion", "Rector"
        };
        // INSTANCIAR MODELO DE LA TABLA Y DESACTIVAR EDICION DE CELDAS
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        tableModel.setColumnIdentifiers(decanatoColumns);
        view.tableDecnato.setModel(tableModel);
        
//CARGAR DATOS DE LA DB
         ps = new PersistenceService();
        List<Decanato> listaDecanatos = ps.decanato.findDecanatoEntities();

        
        if (listaDecanatos != null)
        {

            for (Decanato d : listaDecanatos)
            {
                String id = Long.toString(d.getId());
                String nombre = d.getNombre();
                String ubicacion = d.getUbicacion();
                String rector = d.getRector();

                String decanatoRow[] =
                {
                    id ,nombre, ubicacion, rector
                };

                tableModel.addRow(decanatoRow);
            }

        }
        ps = null;

    }

    public void agregarDecanato() {
        Decanato decanatoAAgregar = new Decanato();
        decanatoAAgregar.setNombre(view.getNombreDecanato());
        decanatoAAgregar.setRector(view.getRectorDecanato());
        decanatoAAgregar.setUbicacion(view.getUbicacionDecanato());

        ps = new PersistenceService();
        ps.decanato.create(decanatoAAgregar);
        cargarDecanatos();
        
    }

    public void eliminarDecanato() {
        int id = Integer.valueOf(view.getDecanatoSeleccionado());
        ps = new PersistenceService();
        try {
            ps.decanato.destroy(Integer.valueOf(id));
        } catch (NonexistentEntityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cargarDecanatos();
    }
}
