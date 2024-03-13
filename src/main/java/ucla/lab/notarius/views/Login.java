/*
Hanuman Sánchez CI: 28.316.086
Anthony Moreno CI: 28.204.620
Angel Goyo CI: 29.737.583
Miller Arias CI: 29.561.941
Luis Ochoa CI: 29.778.672
*/
package notarius.views;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        logoNameNotarius = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        titleInicioSesion = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        textFielduserTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        textFieldpassTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        buttonloginTxt = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();
        notariusLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        logoNameNotarius.setBackground(new java.awt.Color(255, 255, 255));
        logoNameNotarius.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoNameNotarius.setForeground(new java.awt.Color(0, 0, 0));
        logoNameNotarius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoNameNotarius.setText("Notarius");

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(logoNameNotarius, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoNameNotarius, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        logoNameNotarius.getAccessibleContext().setAccessibleName("windowTitle");

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        titleInicioSesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        titleInicioSesion.setText("INICIAR SESIÓN");
        bg.add(titleInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 70, -1));

        textFielduserTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textFielduserTxt.setForeground(new java.awt.Color(204, 204, 204));
        textFielduserTxt.setText("Ingrese su nombre de usuario");
        textFielduserTxt.setBorder(null);
        textFielduserTxt.setSelectionColor(new java.awt.Color(66, 60, 195));
        textFielduserTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFielduserTxtMousePressed(evt);
            }
        });
        textFielduserTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFielduserTxtActionPerformed(evt);
            }
        });
        bg.add(textFielduserTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 410, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        textFieldpassTxt.setForeground(new java.awt.Color(204, 204, 204));
        textFieldpassTxt.setText("Contraseña");
        textFieldpassTxt.setBorder(null);
        textFieldpassTxt.setSelectionColor(new java.awt.Color(66, 60, 195));
        textFieldpassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldpassTxtMousePressed(evt);
            }
        });
        textFieldpassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldpassTxtActionPerformed(evt);
            }
        });
        bg.add(textFieldpassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 410, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 410, 20));

        loginBtn.setBackground(new java.awt.Color(17, 8, 197));

        buttonloginTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        buttonloginTxt.setForeground(new java.awt.Color(255, 255, 255));
        buttonloginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonloginTxt.setText("ENTRAR");
        buttonloginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonloginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonloginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonloginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonloginTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(buttonloginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonloginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 130, 40));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notarius/img/university.png"))); // NOI18N
        bg.add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        notariusLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notarius/img/notariusLogo.png"))); // NOI18N
        bg.add(notariusLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void buttonloginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonloginTxtMouseEntered
        loginBtn.setBackground(new Color(66, 60, 195));
    }//GEN-LAST:event_buttonloginTxtMouseEntered

    private void buttonloginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonloginTxtMouseExited
        loginBtn.setBackground(new Color(17,9,197));
    }//GEN-LAST:event_buttonloginTxtMouseExited

    private void textFielduserTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFielduserTxtMousePressed
        if (textFielduserTxt.getText().equals("Ingrese su nombre de usuario")) {
            textFielduserTxt.setText("");
            textFielduserTxt.setForeground(Color.black);
        }
        if (String.valueOf(textFieldpassTxt.getPassword()).isEmpty()) {
            textFieldpassTxt.setText("Contraseña");
            textFieldpassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textFielduserTxtMousePressed

    private void textFieldpassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldpassTxtMousePressed
        if (String.valueOf(textFieldpassTxt.getPassword()).equals("Contraseña")) {
            textFieldpassTxt.setText("");
            textFieldpassTxt.setForeground(Color.black);
        }
        if (textFielduserTxt.getText().isEmpty()) {
            textFielduserTxt.setText("Ingrese su nombre de usuario");
            textFielduserTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textFieldpassTxtMousePressed

    private void buttonloginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonloginTxtMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + textFielduserTxt.getText() + "\nContraseña: " + String.valueOf(textFieldpassTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
     AdminGestionDecanatoView adminGestionDecanatoView = new AdminGestionDecanatoView();
     adminGestionDecanatoView.setVisible(true);
     adminGestionDecanatoView.setLocationRelativeTo(null);
        this.setVisible(false);
    
    }//GEN-LAST:event_buttonloginTxtMouseClicked

    private void textFieldpassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldpassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldpassTxtActionPerformed

    private void textFielduserTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFielduserTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFielduserTxtActionPerformed

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel buttonloginTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel logoNameNotarius;
    private javax.swing.JLabel notariusLogo;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField textFieldpassTxt;
    private javax.swing.JTextField textFielduserTxt;
    private javax.swing.JLabel titleInicioSesion;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
