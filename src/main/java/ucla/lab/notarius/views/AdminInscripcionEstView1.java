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
public class AdminInscripcionEstView1 extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public AdminInscripcionEstView1() {
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

        panelUsuario1 = new javax.swing.JPanel();
        textFieldNombreUs1 = new javax.swing.JTextField();
        labelDecanatoText3 = new javax.swing.JLabel();
        textFieldApellidoUs1 = new javax.swing.JTextField();
        textFieldEstadoUs1 = new javax.swing.JTextField();
        buttonVolverEst5 = new javax.swing.JButton();
        buttonVolverEst6 = new javax.swing.JButton();
        labelUserEstudianteText2 = new javax.swing.JLabel();
        ComboBoxParaFiltrarEst1 = new javax.swing.JComboBox<>();
        buttonBuscarEst1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsuario1 = new javax.swing.JTable();
        buttonVolverEst2 = new javax.swing.JButton();
        buttonVolverEst1 = new javax.swing.JButton();
        buttonVolverEst3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(840, 631));

        panelUsuario1.setBackground(new java.awt.Color(153, 153, 153));
        panelUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNombreUs1.setEditable(false);
        textFieldNombreUs1.setText("JUAN CANUTO");
        textFieldNombreUs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldNombreUs1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textFieldNombreUs1AncestorRemoved(evt);
            }
        });
        textFieldNombreUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreUs1ActionPerformed(evt);
            }
        });

        labelDecanatoText3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDecanatoText3.setText("REGISTRO");

        textFieldApellidoUs1.setEditable(false);
        textFieldApellidoUs1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        textFieldApellidoUs1.setText("PEREZ CHAVEZ");
        textFieldApellidoUs1.setToolTipText("");
        textFieldApellidoUs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldApellidoUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidoUs1ActionPerformed(evt);
            }
        });

        textFieldEstadoUs1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadoUs1.setToolTipText("");
        textFieldEstadoUs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadoUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadoUs1ActionPerformed(evt);
            }
        });

        buttonVolverEst5.setText("CARGAR");
        buttonVolverEst5.setBorder(new javax.swing.border.MatteBorder(null));

        buttonVolverEst6.setText("LIMPIAR");
        buttonVolverEst6.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panelUsuario1Layout = new javax.swing.GroupLayout(panelUsuario1);
        panelUsuario1.setLayout(panelUsuario1Layout);
        panelUsuario1Layout.setHorizontalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuario1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelDecanatoText3))
                    .addGroup(panelUsuario1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUsuario1Layout.createSequentialGroup()
                                .addComponent(buttonVolverEst5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonVolverEst6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldApellidoUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(textFieldNombreUs1)
                                .addComponent(textFieldEstadoUs1)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelUsuario1Layout.setVerticalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDecanatoText3)
                .addGap(11, 11, 11)
                .addComponent(textFieldEstadoUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombreUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldApellidoUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVolverEst5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVolverEst6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        labelUserEstudianteText2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelUserEstudianteText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserEstudianteText2.setText("INSCRIPCIÓN ESTUDIANTE");
        labelUserEstudianteText2.setToolTipText("");

        ComboBoxParaFiltrarEst1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "estudiantes que retiraron alguna asignatura ", "estudiantes por carrera", "estudiantes por semestre", "20 mejores promedios por carrera", "20 mejores promedios por Decanat", "por género de carrera y Decanato", "estudiantes con promedios por encima de 16 puntos por sección y por carrera" }));
        ComboBoxParaFiltrarEst1.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarEst1.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarEst1ActionPerformed(evt);
            }
        });

        buttonBuscarEst1.setText("FILTRAR");
        buttonBuscarEst1.setBorder(new javax.swing.border.MatteBorder(null));

        tableUsuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CED_EST", "Usuario", "Nombre", "Apellido", "Contraseña", "Rol", "Estado", "..."
            }
        ));
        jScrollPane2.setViewportView(tableUsuario1);

        buttonVolverEst2.setText("VOLVER");
        buttonVolverEst2.setBorder(new javax.swing.border.MatteBorder(null));

        buttonVolverEst1.setText("Inscribir");
        buttonVolverEst1.setBorder(new javax.swing.border.MatteBorder(null));

        buttonVolverEst3.setText("Imprimir");
        buttonVolverEst3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxParaFiltrarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonBuscarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonVolverEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonVolverEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(labelUserEstudianteText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(buttonVolverEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(646, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelUserEstudianteText2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxParaFiltrarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBuscarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panelUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVolverEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVolverEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(560, Short.MAX_VALUE)
                    .addComponent(buttonVolverEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEstadoUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadoUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadoUs1ActionPerformed

    private void textFieldApellidoUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidoUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidoUs1ActionPerformed

    private void textFieldNombreUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUs1ActionPerformed

    private void textFieldNombreUs1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textFieldNombreUs1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUs1AncestorRemoved

    private void ComboBoxParaFiltrarEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarEst1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarEst1;
    private javax.swing.JButton buttonBuscarEst1;
    private javax.swing.JButton buttonVolverEst1;
    private javax.swing.JButton buttonVolverEst2;
    private javax.swing.JButton buttonVolverEst3;
    private javax.swing.JButton buttonVolverEst5;
    private javax.swing.JButton buttonVolverEst6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDecanatoText3;
    private javax.swing.JLabel labelUserEstudianteText2;
    private javax.swing.JPanel panelUsuario1;
    private javax.swing.JTable tableUsuario1;
    private javax.swing.JTextField textFieldApellidoUs1;
    private javax.swing.JTextField textFieldEstadoUs1;
    private javax.swing.JTextField textFieldNombreUs1;
    // End of variables declaration//GEN-END:variables
}
