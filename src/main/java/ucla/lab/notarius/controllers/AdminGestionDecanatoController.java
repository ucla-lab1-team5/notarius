// package ucla.lab.notarius.controllers;
// // importando todo de los eventos
// import java.awt.event.*;
// import java.util.List;

// import javax.swing.table.DefaultTableModel;

// import ucla.lab.notarius.models.Decanato;
// import ucla.lab.notarius.models.services.DecanatoService;
// import ucla.lab.notarius.models.services.PersistenceService;
// import ucla.lab.notarius.views.AdminGestionDecanatoView;

// public class AdminGestionDecanatoController {
//     private AdminGestionDecanatoView view;
//     private DecanatoService service;

//     public AdminGestionDecanatoController (AdminGestionDecanatoView adminGestionDecanatoView, DecanatoService decanatoService) {
//         this.view = adminGestionDecanatoView;
//         this.service = decanatoService;

//         this.view.addWindowListener(new WindowAdapter() {
//             public void windowOpened(WindowEvent evt) {
//                 cargarDecanatos();
//             }
//         });

//         this.view.setVisible(true);
//         this.view.setLocationRelativeTo(null);
//     }

//     public void cargarDecanatos() {

//         //CONSTRUIR TITULOS DE TABLA
//         String decanatoColumns[] =
//         {
//             "ID", "Nombre", "Ubicacion", "Rector"
//         };
//         // INSTANCIAR MODELO DE LA TABLA Y DESACTIVAR EDICION DE CELDAS
//         DefaultTableModel tableModel = new DefaultTableModel() {
//             @Override
//             public boolean isCellEditable(int row, int col) {
//                 return false;
//             }
//         };

//         tableModel.setColumnIdentifiers(decanatoColumns);
//         view.tableDecnato.setModel(tableModel);
        
// //CARGAR DATOS DE LA DB
//         PersistenceService control = new PersistenceService();
//         List<Decanato> listaDecanatos = control.decanato.findDecanatoEntities();

        
//         if (listaDecanatos != null)
//         {

//             for (Decanato d : listaDecanatos)
//             {
//                 String id = Long.toString(d.getId());
//                 String nombre = d.getNombre();
//                 String ubicacion = d.getUbicacion();
//                 String rector = d.getRector();

//                 String decanatoRow[] =
//                 {
//                     id ,nombre, ubicacion, rector
//                 };

//                 tableModel.addRow(decanatoRow);
//             }

//         }
//         control = null;

//     }

// }
