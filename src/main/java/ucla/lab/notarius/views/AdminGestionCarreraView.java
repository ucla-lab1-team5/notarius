/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package ucla.lab.notarius.views;

/**
 *
 * @author ANGELITE
 */
public class AdminGestionCarreraView extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public AdminGestionCarreraView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCarreraText1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCarrera = new javax.swing.JTable();
        panelCarrera = new javax.swing.JPanel();
        textFieldCodigoCar = new javax.swing.JTextField();
        labelCarreraText2 = new javax.swing.JLabel();
        textFieldCarreraCar = new javax.swing.JTextField();
        comboBoxDecanatoCar = new javax.swing.JComboBox<>();
        textFieldCantSemestreCar = new javax.swing.JTextField();
        textFieldBuscarCar = new javax.swing.JTextField();
        buttonVolverCar = new javax.swing.JButton();
        buttonBuscarCar = new javax.swing.JButton();
        buttonAgregarCar = new javax.swing.JButton();
        ComboBoxParaFiltrarCar = new javax.swing.JComboBox<>();
        buttonActualizarCar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 600));

        labelCarreraText1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCarreraText1.setText("GESTION DE CARRERA");
        labelCarreraText1.setToolTipText("");

        tableCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3422432", "ING EN ZAMUREAR", "DPUTA", "5", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "COD", "CARRERA", "DECANATO", "SEMESTRES", "..."
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
        jScrollPane1.setViewportView(tableCarrera);

        panelCarrera.setBackground(new java.awt.Color(153, 153, 153));
        panelCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldCodigoCar.setFont(new java.awt.Font("Arial Narrow", 0, 11)); // NOI18N
        textFieldCodigoCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldCodigoCar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textFieldCodigoCarAncestorRemoved(evt);
            }
        });
        textFieldCodigoCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoCarActionPerformed(evt);
            }
        });

        labelCarreraText2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCarreraText2.setText("REGISTRO");

        textFieldCarreraCar.setFont(new java.awt.Font("Arial Narrow", 0, 11)); // NOI18N
        textFieldCarreraCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrera", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldCarreraCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCarreraCarActionPerformed(evt);
            }
        });

        comboBoxDecanatoCar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        comboBoxDecanatoCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DECANATO", "DCYT", "DULA", "DPTE" }));
        comboBoxDecanatoCar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBoxDecanatoCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDecanatoCarActionPerformed(evt);
            }
        });

        textFieldCantSemestreCar.setFont(new java.awt.Font("Arial Narrow", 0, 11)); // NOI18N
        textFieldCantSemestreCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de Semestres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldCantSemestreCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCantSemestreCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCarreraLayout = new javax.swing.GroupLayout(panelCarrera);
        panelCarrera.setLayout(panelCarreraLayout);
        panelCarreraLayout.setHorizontalGroup(
            panelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarreraLayout.createSequentialGroup()
                .addGroup(panelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCarreraLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCarreraCar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCodigoCar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldCantSemestreCar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxDecanatoCar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCarreraLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(labelCarreraText2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelCarreraLayout.setVerticalGroup(
            panelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarreraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelCarreraText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCodigoCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCarreraCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(comboBoxDecanatoCar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldCantSemestreCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textFieldBuscarCar.setText("Buscar...");
        textFieldBuscarCar.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldBuscarCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarCarActionPerformed(evt);
            }
        });

        buttonVolverCar.setText("VOLVER");
        buttonVolverCar.setBorder(new javax.swing.border.MatteBorder(null));

        buttonBuscarCar.setText("Buscar");
        buttonBuscarCar.setBorder(new javax.swing.border.MatteBorder(null));

        buttonAgregarCar.setText("Agregar");
        buttonAgregarCar.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAgregarCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarCarActionPerformed(evt);
            }
        });

        ComboBoxParaFiltrarCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "DECANATO", " " }));
        ComboBoxParaFiltrarCar.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarCar.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarCarActionPerformed(evt);
            }
        });

        buttonActualizarCar.setText("Actualizar");
        buttonActualizarCar.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCarreraText1)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(buttonVolverCar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(buttonAgregarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonActualizarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxParaFiltrarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelCarreraText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonActualizarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAgregarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxParaFiltrarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarCar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(buttonVolverCar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoCarActionPerformed

    private void textFieldCarreraCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCarreraCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCarreraCarActionPerformed

    private void textFieldCantSemestreCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCantSemestreCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCantSemestreCarActionPerformed

    private void textFieldCodigoCarAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textFieldCodigoCarAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoCarAncestorRemoved

    private void comboBoxDecanatoCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDecanatoCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDecanatoCarActionPerformed

    private void textFieldBuscarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarCarActionPerformed

    private void buttonAgregarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgregarCarActionPerformed

    private void ComboBoxParaFiltrarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarCar;
    private javax.swing.JButton buttonActualizarCar;
    private javax.swing.JButton buttonAgregarCar;
    private javax.swing.JButton buttonBuscarCar;
    private javax.swing.JButton buttonVolverCar;
    private javax.swing.JComboBox<String> comboBoxDecanatoCar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCarreraText1;
    private javax.swing.JLabel labelCarreraText2;
    private javax.swing.JPanel panelCarrera;
    private javax.swing.JTable tableCarrera;
    private javax.swing.JTextField textFieldBuscarCar;
    private javax.swing.JTextField textFieldCantSemestreCar;
    private javax.swing.JTextField textFieldCarreraCar;
    private javax.swing.JTextField textFieldCodigoCar;
    // End of variables declaration//GEN-END:variables
}
