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
public class AdminReportesView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public AdminReportesView() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        panelUsuario2 = new javax.swing.JPanel();
        textFieldNombreUs2 = new javax.swing.JTextField();
        labelDecanatoText4 = new javax.swing.JLabel();
        textFieldApellidoUs2 = new javax.swing.JTextField();
        textFieldEstadoUs2 = new javax.swing.JTextField();
        textFieldEstadUs2 = new javax.swing.JTextField();
        textFieldContraUs2 = new javax.swing.JTextField();
        buttonVolverEst3 = new javax.swing.JButton();
        labelUserEstudianteText3 = new javax.swing.JLabel();
        ComboBoxParaFiltrarEst2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUsuario2 = new javax.swing.JTable();
        buttonVolverEst4 = new javax.swing.JButton();
        textFieldBuscarEst2 = new javax.swing.JTextField();
        buttonBuscarEst3 = new javax.swing.JButton();
        panelUsuario1 = new javax.swing.JPanel();
        textFieldNombreUs1 = new javax.swing.JTextField();
        labelDecanatoText3 = new javax.swing.JLabel();
        textFieldApellidoUs1 = new javax.swing.JTextField();
        textFieldEstadoUs1 = new javax.swing.JTextField();
        textFieldEstadUs1 = new javax.swing.JTextField();
        textFieldContraUs1 = new javax.swing.JTextField();
        buttonVolverEst1 = new javax.swing.JButton();
        labelUserEstudianteText2 = new javax.swing.JLabel();
        ComboBoxParaFiltrarEst1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsuario1 = new javax.swing.JTable();
        buttonVolverEst2 = new javax.swing.JButton();
        textFieldBuscarEst1 = new javax.swing.JTextField();
        buttonBuscarEst2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 631));

        panelUsuario2.setBackground(new java.awt.Color(153, 153, 153));
        panelUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNombreUs2.setText("DETALLES");
        textFieldNombreUs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldNombreUs2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                textFieldNombreUs2AncestorRemoved(evt);
            }
        });
        textFieldNombreUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreUs2ActionPerformed(evt);
            }
        });

        labelDecanatoText4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDecanatoText4.setText("REGISTRO");

        textFieldApellidoUs2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldApellidoUs2.setToolTipText("");
        textFieldApellidoUs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldApellidoUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidoUs2ActionPerformed(evt);
            }
        });

        textFieldEstadoUs2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadoUs2.setToolTipText("");
        textFieldEstadoUs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadoUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadoUs2ActionPerformed(evt);
            }
        });

        textFieldEstadUs2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadUs2.setToolTipText("");
        textFieldEstadUs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadUs2ActionPerformed(evt);
            }
        });

        textFieldContraUs2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldContraUs2.setToolTipText("");
        textFieldContraUs2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldContraUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContraUs2ActionPerformed(evt);
            }
        });

        buttonVolverEst3.setText("IMPRIMIR");
        buttonVolverEst3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panelUsuario2Layout = new javax.swing.GroupLayout(panelUsuario2);
        panelUsuario2.setLayout(panelUsuario2Layout);
        panelUsuario2Layout.setHorizontalGroup(
            panelUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario2Layout.createSequentialGroup()
                .addGroup(panelUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuario2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombreUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldApellidoUs2)
                            .addComponent(textFieldEstadoUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldEstadUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldContraUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(buttonVolverEst3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUsuario2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelDecanatoText4)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelUsuario2Layout.setVerticalGroup(
            panelUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDecanatoText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombreUs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldApellidoUs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldEstadoUs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldContraUs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldEstadUs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonVolverEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelUserEstudianteText3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelUserEstudianteText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserEstudianteText3.setText("REPORTES GENERALES");
        labelUserEstudianteText3.setToolTipText("");

        ComboBoxParaFiltrarEst2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "estudiantes que retiraron alguna asignatura ", "estudiantes por carrera", "estudiantes por semestre", "20 mejores promedios por carrera", "20 mejores promedios por Decanat", "por género de carrera y Decanato", "estudiantes con promedios por encima de 16 puntos por sección y por carrera" }));
        ComboBoxParaFiltrarEst2.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarEst2.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarEst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarEst2ActionPerformed(evt);
            }
        });

        tableUsuario2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableUsuario2);

        buttonVolverEst4.setText("VOLVER");
        buttonVolverEst4.setBorder(new javax.swing.border.MatteBorder(null));
        buttonVolverEst4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVolverEst4MouseClicked(evt);
            }
        });

        textFieldBuscarEst2.setText("  Buscar...");
        textFieldBuscarEst2.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldBuscarEst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarEst2ActionPerformed(evt);
            }
        });

        buttonBuscarEst3.setText("Buscar");
        buttonBuscarEst3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVolverEst4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxParaFiltrarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldBuscarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscarEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addComponent(labelUserEstudianteText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelUserEstudianteText3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118)
                        .addComponent(buttonVolverEst4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxParaFiltrarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldBuscarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBuscarEst3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(840, 631));

        panelUsuario1.setBackground(new java.awt.Color(153, 153, 153));
        panelUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textFieldNombreUs1.setText("DETALLES");
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

        textFieldApellidoUs1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
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

        textFieldEstadUs1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldEstadUs1.setToolTipText("");
        textFieldEstadUs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldEstadUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEstadUs1ActionPerformed(evt);
            }
        });

        textFieldContraUs1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 11)); // NOI18N
        textFieldContraUs1.setToolTipText("");
        textFieldContraUs1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 11))); // NOI18N
        textFieldContraUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldContraUs1ActionPerformed(evt);
            }
        });

        buttonVolverEst1.setText("IMPRIMIR");
        buttonVolverEst1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout panelUsuario1Layout = new javax.swing.GroupLayout(panelUsuario1);
        panelUsuario1.setLayout(panelUsuario1Layout);
        panelUsuario1Layout.setHorizontalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuario1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombreUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldApellidoUs1)
                            .addComponent(textFieldEstadoUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldEstadUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(textFieldContraUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(buttonVolverEst1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelUsuario1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelDecanatoText3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelUsuario1Layout.setVerticalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelDecanatoText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNombreUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldApellidoUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldEstadoUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldContraUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldEstadUs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonVolverEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelUserEstudianteText2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelUserEstudianteText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserEstudianteText2.setText("REPORTES GENERALES");
        labelUserEstudianteText2.setToolTipText("");

        ComboBoxParaFiltrarEst1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por", "estudiantes que retiraron alguna asignatura ", "estudiantes por carrera", "estudiantes por semestre", "20 mejores promedios por carrera", "20 mejores promedios por Decanat", "por género de carrera y Decanato", "estudiantes con promedios por encima de 16 puntos por sección y por carrera" }));
        ComboBoxParaFiltrarEst1.setToolTipText(""); // NOI18N
        ComboBoxParaFiltrarEst1.setBorder(new javax.swing.border.MatteBorder(null));
        ComboBoxParaFiltrarEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxParaFiltrarEst1ActionPerformed(evt);
            }
        });

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
        buttonVolverEst2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVolverEst2MouseClicked(evt);
            }
        });

        textFieldBuscarEst1.setText("  Buscar...");
        textFieldBuscarEst1.setBorder(new javax.swing.border.MatteBorder(null));
        textFieldBuscarEst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarEst1ActionPerformed(evt);
            }
        });

        buttonBuscarEst2.setText("Buscar");
        buttonBuscarEst2.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVolverEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxParaFiltrarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldBuscarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(labelUserEstudianteText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelUserEstudianteText2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118)
                        .addComponent(buttonVolverEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxParaFiltrarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldBuscarEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonBuscarEst2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxParaFiltrarEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarEst1ActionPerformed

    private void textFieldContraUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContraUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContraUs1ActionPerformed

    private void textFieldEstadUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadUs1ActionPerformed

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

    private void textFieldBuscarEst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarEst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarEst1ActionPerformed

    private void buttonVolverEst2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVolverEst2MouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_buttonVolverEst2MouseClicked

    private void textFieldNombreUs2AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textFieldNombreUs2AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUs2AncestorRemoved

    private void textFieldNombreUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUs2ActionPerformed

    private void textFieldApellidoUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidoUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidoUs2ActionPerformed

    private void textFieldEstadoUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadoUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadoUs2ActionPerformed

    private void textFieldEstadUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEstadUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEstadUs2ActionPerformed

    private void textFieldContraUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldContraUs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldContraUs2ActionPerformed

    private void ComboBoxParaFiltrarEst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxParaFiltrarEst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxParaFiltrarEst2ActionPerformed

    private void buttonVolverEst4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVolverEst4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVolverEst4MouseClicked

    private void textFieldBuscarEst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarEst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarEst2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarEst1;
    private javax.swing.JComboBox<String> ComboBoxParaFiltrarEst2;
    private javax.swing.JButton buttonBuscarEst2;
    private javax.swing.JButton buttonBuscarEst3;
    private javax.swing.JButton buttonVolverEst1;
    private javax.swing.JButton buttonVolverEst2;
    private javax.swing.JButton buttonVolverEst3;
    private javax.swing.JButton buttonVolverEst4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelDecanatoText3;
    private javax.swing.JLabel labelDecanatoText4;
    private javax.swing.JLabel labelUserEstudianteText2;
    private javax.swing.JLabel labelUserEstudianteText3;
    private javax.swing.JPanel panelUsuario1;
    private javax.swing.JPanel panelUsuario2;
    private javax.swing.JTable tableUsuario1;
    private javax.swing.JTable tableUsuario2;
    private javax.swing.JTextField textFieldApellidoUs1;
    private javax.swing.JTextField textFieldApellidoUs2;
    private javax.swing.JTextField textFieldBuscarEst1;
    private javax.swing.JTextField textFieldBuscarEst2;
    private javax.swing.JTextField textFieldContraUs1;
    private javax.swing.JTextField textFieldContraUs2;
    private javax.swing.JTextField textFieldEstadUs1;
    private javax.swing.JTextField textFieldEstadUs2;
    private javax.swing.JTextField textFieldEstadoUs1;
    private javax.swing.JTextField textFieldEstadoUs2;
    private javax.swing.JTextField textFieldNombreUs1;
    private javax.swing.JTextField textFieldNombreUs2;
    // End of variables declaration//GEN-END:variables
}
