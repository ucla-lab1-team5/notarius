/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.views;

/**
 *
 * @author ANGELITE
 */
public class AdminGestionUsuarioView extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public AdminGestionUsuarioView() {
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

        buttonBuscarEst = new javax.swing.JButton();
        panelUsuario = new javax.swing.JPanel();
        textFieldNombreUs = new javax.swing.JTextField();
        labelDecanatoText2 = new javax.swing.JLabel();
        textFieldApellidoUs = new javax.swing.JTextField();
        textFieldEstadoUs = new javax.swing.JTextField();
        comboBoxDecanatoUserEstud = new javax.swing.JComboBox<>();
        textFieldEstadUs = new javax.swing.JTextField();
        textFieldContraUs = new javax.swing.JTextField();
        buttonAgregarEst = new javax.swing.JButton();
        ComboBoxParaFiltrarEst = new javax.swing.JComboBox<>();
        labelUserEstudianteText1 = new javax.swing.JLabel();
        buttonActualizarEst = new javax.swing.JButton();
        textFieldBuscarEst = new javax.swing.JTextField();
        buttonVolverEst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(840, 631));

        buttonBuscarEst.setText("Buscar");
        buttonBuscarEst.setBorder(new javax.swing.border.MatteBorder(null));

        panelUsuario.setBackground(new java.awt.Color(153, 153, 153));
        panelUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNombreUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldNombreUs.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textFieldNombreUsAncestorRemoved(evt);
            }
        });
        textFieldNombreUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreUsActionPerformed(evt);
            }
        });

        labelDecanatoText2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDecanatoText2.setText("REGISTRO");

        textFieldApellidoUs.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldApellidoUs.setToolTipText("");
        textFieldApellidoUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldApellidoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidoUsActionPerformed(evt);
            }
        });

        textFieldEstadoUs.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadoUs.setToolTipText("");
        textFieldEstadoUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadoUsActionPerformed(evt);
            }
        });

        comboBoxDecanatoUserEstud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROL", "Administrador", "Profesor", "Estudiante", " ", " " }));

        textFieldEstadUs.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadUs.setToolTipText("");
        textFieldEstadUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadUsActionPerformed(evt);
            }
        });

        textFieldContraUs.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldContraUs.setToolTipText("");
        textFieldContraUs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldContraUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContraUsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldNombreUs, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(textFieldApellidoUs))
                            .addComponent(comboBoxDecanatoUserEstud, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldEstadoUs, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldEstadUs, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldContraUs, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelDecanatoText2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDecanatoText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombreUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldApellidoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldEstadoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldContraUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(textFieldEstadUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxDecanatoUserEstud, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonAgregarEst.setText("Agregar");
        buttonAgregarEst.setBorder(new javax.swing.border.MatteBorder(null));
        buttonAgregarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarEstActionPerformed(evt);
            }
        });

        ComboBoxParaFiltrarEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "DECANATO", " " }));
        ComboBoxParaFiltrarEst.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarEst.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarEstActionPerformed(evt);
            }
        });

        labelUserEstudianteText1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelUserEstudianteText1.setText("GESTION DE USUARIO");
        labelUserEstudianteText1.setToolTipText("");

        buttonActualizarEst.setText("Actualizar");
        buttonActualizarEst.setBorder(new javax.swing.border.MatteBorder(null));

        textFieldBuscarEst.setText("Buscar...");
        textFieldBuscarEst.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarEstActionPerformed(evt);
            }
        });

        buttonVolverEst.setText("VOLVER");
        buttonVolverEst.setBorder(new javax.swing.border.MatteBorder(null));

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Nombre", "Apellido", "Contraseña", "Rol", "Estado", "..."
            }
        ));
        jScrollPane1.setViewportView(tableUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelUserEstudianteText1)
                .addGap(268, 268, 268))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonVolverEst, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(buttonAgregarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxParaFiltrarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelUserEstudianteText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBuscarEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonActualizarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAgregarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxParaFiltrarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(buttonVolverEst, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNombreUsAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textFieldNombreUsAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUsAncestorRemoved

    private void textFieldNombreUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUsActionPerformed

    private void textFieldApellidoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidoUsActionPerformed

    private void textFieldEstadoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadoUsActionPerformed

    private void buttonAgregarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgregarEstActionPerformed

    private void ComboBoxParaFiltrarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarEstActionPerformed

    private void textFieldBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarEstActionPerformed

    private void textFieldEstadUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadUsActionPerformed

    private void textFieldContraUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContraUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContraUsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarEst;
    private javax.swing.JButton buttonActualizarEst;
    private javax.swing.JButton buttonAgregarEst;
    private javax.swing.JButton buttonBuscarEst;
    private javax.swing.JButton buttonVolverEst;
    private javax.swing.JComboBox<String> comboBoxDecanatoUserEstud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDecanatoText2;
    private javax.swing.JLabel labelUserEstudianteText1;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField textFieldApellidoUs;
    private javax.swing.JTextField textFieldBuscarEst;
    private javax.swing.JTextField textFieldContraUs;
    private javax.swing.JTextField textFieldEstadUs;
    private javax.swing.JTextField textFieldEstadoUs;
    private javax.swing.JTextField textFieldNombreUs;
    // End of variables declaration//GEN-END:variables
}
