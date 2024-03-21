/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.views;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ucla.lab.notarius.models.Decanato;

/**
 *
 * @author User
 */
public class AdminGestionDecanatoView extends javax.swing.JFrame {

    /**
     * Creates new form AdminGestionDecanatoView
     */
    public AdminGestionDecanatoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDecanato = new javax.swing.JPanel();
        textFieldNombreDec = new javax.swing.JTextField();
        labelDecanatoText2 = new javax.swing.JLabel();
        textFieldCodigoDec = new javax.swing.JTextField();
        textFieldUbicacionDec = new javax.swing.JTextField();
        textFieldRectorDec = new javax.swing.JTextField();
        labelDecanatoText1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDecnato = new javax.swing.JTable();
        textFieldBuscarDec = new javax.swing.JTextField();
        buttonVolverDec = new javax.swing.JButton();
        buttonBuscarDec = new javax.swing.JButton();
        buttonAgregarDec = new javax.swing.JButton();
        ComboBoxParaFiltrarDec = new javax.swing.JComboBox<>();
        buttonEliminarDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelDecanato.setBackground(new java.awt.Color(153, 153, 153));
        panelDecanato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNombreDec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldNombreDec.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textFieldNombreDecAncestorRemoved(evt);
            }
        });
        textFieldNombreDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreDecActionPerformed(evt);
            }
        });

        labelDecanatoText2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDecanatoText2.setText("REGISTRO");

        textFieldCodigoDec.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldCodigoDec.setToolTipText("");
        textFieldCodigoDec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldCodigoDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoDecActionPerformed(evt);
            }
        });

        textFieldUbicacionDec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubicación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldUbicacionDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUbicacionDecActionPerformed(evt);
            }
        });

        textFieldRectorDec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rector", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldRectorDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldRectorDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDecanatoLayout = new javax.swing.GroupLayout(panelDecanato);
        panelDecanato.setLayout(panelDecanatoLayout);
        panelDecanatoLayout.setHorizontalGroup(
            panelDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDecanatoLayout.createSequentialGroup()
                .addGroup(panelDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDecanatoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombreDec, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldCodigoDec)
                            .addComponent(textFieldUbicacionDec)
                            .addComponent(textFieldRectorDec)))
                    .addGroup(panelDecanatoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(labelDecanatoText2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelDecanatoLayout.setVerticalGroup(
            panelDecanatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDecanatoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDecanatoText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombreDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCodigoDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(textFieldUbicacionDec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldRectorDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        labelDecanatoText1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelDecanatoText1.setText("GESTION DE DECANATO");
        labelDecanatoText1.setToolTipText("");

        tableDecnato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableDecnato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3422432", "ING EN ZAMUREAR", "DPUTA", "5", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CODIGO", "UBICACION", "RECTOR", "..."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDecnato);

        textFieldBuscarDec.setText("Buscar...");
        textFieldBuscarDec.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldBuscarDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarDecActionPerformed(evt);
            }
        });

        buttonVolverDec.setText("VOLVER");
        buttonVolverDec.setBorder(new javax.swing.border.MatteBorder(null));
        buttonVolverDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVolverDecMouseClicked(evt);
            }
        });

        buttonBuscarDec.setText("Buscar");
        buttonBuscarDec.setBorder(new javax.swing.border.MatteBorder(null));

        buttonAgregarDec.setText("Agregar");
        buttonAgregarDec.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAgregarDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarDecActionPerformed(evt);
            }
        });

        ComboBoxParaFiltrarDec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "DECANATO", " " }));
        ComboBoxParaFiltrarDec.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarDec.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarDecActionPerformed(evt);
            }
        });

        buttonEliminarDec.setText("Eliminar");
        buttonEliminarDec.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 229, Short.MAX_VALUE)
                .addComponent(labelDecanatoText1)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelDecanato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonVolverDec, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(buttonAgregarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonEliminarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboBoxParaFiltrarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldBuscarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBuscarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelDecanatoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDecanato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBuscarDec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxParaFiltrarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldBuscarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonEliminarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAgregarDec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(buttonVolverDec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // cargarDecanatos();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // cargarDecanatos();
    }//GEN-LAST:event_formWindowGainedFocus

    private void textFieldNombreDecAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textFieldNombreDecAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreDecAncestorRemoved

    private void textFieldNombreDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreDecActionPerformed

    private void textFieldCodigoDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoDecActionPerformed

    private void textFieldUbicacionDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUbicacionDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUbicacionDecActionPerformed

    private void textFieldRectorDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldRectorDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldRectorDecActionPerformed

    private void textFieldBuscarDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarDecActionPerformed

    private void buttonAgregarDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgregarDecActionPerformed

    private void ComboBoxParaFiltrarDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarDecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarDecActionPerformed

    private void buttonVolverDecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVolverDecMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_buttonVolverDecMouseClicked

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
//         tableDecnato.setModel(tableModel);
        
// //CARGAR DATOS DE LA DB
//         Controller control = new Controller();
//         ArrayList<Decanato> listaDecanatos = control.decanato.traerTodos();

        
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

     //listeners
     public void submitButtonAgregarDec(ActionListener actionListener) {
        buttonAgregarDec.addActionListener(actionListener);
    }
    public void submitButtonEliminarDec(ActionListener actionListener) {
        buttonEliminarDec.addActionListener(actionListener);
    }

  


    // getters
    public  String getNombreDecanato() {
        return textFieldNombreDec.getText();
    }

    public  String getRectorDecanato() {
        return textFieldRectorDec.getText();
    }
    public  String getCodigoDecanato() {
        return textFieldCodigoDec.getText();
    }
    public  String getUbicacionDecanato() {
        return textFieldUbicacionDec.getText();
    }

    public String getDecanatoSeleccionado() {
        int selectedRow = tableDecnato.getSelectedRow();
        Object id = tableDecnato.getValueAt(selectedRow, 0);
        System.out.println(id.getClass());
        return (String)id;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarDec;
    private javax.swing.JButton buttonEliminarDec;
    private javax.swing.JButton buttonAgregarDec;
    private javax.swing.JButton buttonBuscarDec;
    private javax.swing.JButton buttonVolverDec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDecanatoText1;
    private javax.swing.JLabel labelDecanatoText2;
    private javax.swing.JPanel panelDecanato;
    public javax.swing.JTable tableDecnato;
    private javax.swing.JTextField textFieldBuscarDec;
    private javax.swing.JTextField textFieldCodigoDec;
    private javax.swing.JTextField textFieldNombreDec;
    private javax.swing.JTextField textFieldRectorDec;
    private javax.swing.JTextField textFieldUbicacionDec;
    // End of variables declaration//GEN-END:variables
}
