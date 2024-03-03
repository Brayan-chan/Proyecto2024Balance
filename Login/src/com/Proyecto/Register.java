package com.register;

import java.awt.Color;

public class Register extends javax.swing.JFrame {
              int xMouse, yMouse;
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRegister = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        empreseName = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        nameLogo = new javax.swing.JLabel();
        registerText = new javax.swing.JLabel();
        LogoAdjuntLabel = new javax.swing.JLabel();
        nameEmpresaTextField = new javax.swing.JTextField();
        nameUserLabelRegister = new javax.swing.JLabel();
        correoUserLabelRegister = new javax.swing.JLabel();
        nameUserTextFieldRegister = new javax.swing.JTextField();
        correoUserTextFieldRegister = new javax.swing.JTextField();
        passwordLabelRegister = new javax.swing.JLabel();
        empresaLabelRegister = new javax.swing.JLabel();
        passwordTextFieldRegister = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelRegisterButton = new javax.swing.JPanel();
        registerButton = new javax.swing.JLabel();
        panelAdjuntarButton = new javax.swing.JPanel();
        adjuntarBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgRegister.setBackground(new java.awt.Color(255, 255, 255));
        bgRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/logo.png"))); // NOI18N
        bgRegister.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 290, 140));

        empreseName.setBackground(new java.awt.Color(255, 255, 255));
        empreseName.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        empreseName.setForeground(new java.awt.Color(255, 255, 255));
        empreseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empreseName.setText("NOMBRE EMPRESA");
        bgRegister.add(empreseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 230, 290, 30));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/city.png"))); // NOI18N
        bgRegister.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -10, 290, 500));

        nameLogo.setBackground(new java.awt.Color(255, 255, 255));
        nameLogo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nameLogo.setForeground(new java.awt.Color(0, 0, 0));
        nameLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/favicon.png"))); // NOI18N
        nameLogo.setText("BG'SFDI");
        bgRegister.add(nameLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        registerText.setBackground(new java.awt.Color(255, 255, 255));
        registerText.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        registerText.setForeground(new java.awt.Color(0, 0, 0));
        registerText.setText("REGISTRARSE");
        bgRegister.add(registerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        LogoAdjuntLabel.setBackground(new java.awt.Color(255, 255, 255));
        LogoAdjuntLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        LogoAdjuntLabel.setForeground(new java.awt.Color(0, 0, 0));
        LogoAdjuntLabel.setText("LOGO");
        bgRegister.add(LogoAdjuntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));

        nameEmpresaTextField.setBackground(new java.awt.Color(255, 255, 255));
        nameEmpresaTextField.setForeground(new java.awt.Color(204, 204, 204));
        nameEmpresaTextField.setText("Ingrese el nombre de la empresa");
        nameEmpresaTextField.setBorder(null);
        bgRegister.add(nameEmpresaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 410, 30));

        nameUserLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        nameUserLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        nameUserLabelRegister.setForeground(new java.awt.Color(0, 0, 0));
        nameUserLabelRegister.setText("NOMBRE DE USUARIO");
        bgRegister.add(nameUserLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        correoUserLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        correoUserLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        correoUserLabelRegister.setForeground(new java.awt.Color(0, 0, 0));
        correoUserLabelRegister.setText("CORREO");
        bgRegister.add(correoUserLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        nameUserTextFieldRegister.setBackground(new java.awt.Color(255, 255, 255));
        nameUserTextFieldRegister.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameUserTextFieldRegister.setForeground(new java.awt.Color(204, 204, 204));
        nameUserTextFieldRegister.setText("Registre su nombre de usuario");
        nameUserTextFieldRegister.setBorder(null);
        nameUserTextFieldRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUserTextFieldRegisterActionPerformed(evt);
            }
        });
        bgRegister.add(nameUserTextFieldRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 410, 30));

        correoUserTextFieldRegister.setBackground(new java.awt.Color(255, 255, 255));
        correoUserTextFieldRegister.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        correoUserTextFieldRegister.setForeground(new java.awt.Color(204, 204, 204));
        correoUserTextFieldRegister.setText("Ingrese su correo electronico");
        correoUserTextFieldRegister.setBorder(null);
        correoUserTextFieldRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoUserTextFieldRegisterActionPerformed(evt);
            }
        });
        bgRegister.add(correoUserTextFieldRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 410, 30));

        passwordLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordLabelRegister.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabelRegister.setText("CONTRASEÃ‘A");
        bgRegister.add(passwordLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        empresaLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        empresaLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        empresaLabelRegister.setForeground(new java.awt.Color(0, 0, 0));
        empresaLabelRegister.setText("EMPRESA");
        bgRegister.add(empresaLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        passwordTextFieldRegister.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextFieldRegister.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextFieldRegister.setText("****************");
        passwordTextFieldRegister.setBorder(null);
        passwordTextFieldRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldRegisterActionPerformed(evt);
            }
        });
        bgRegister.add(passwordTextFieldRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 410, 30));
        bgRegister.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 410, 20));
        bgRegister.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 410, 10));
        bgRegister.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 410, 10));
        bgRegister.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 410, 10));

        panelRegisterButton.setBackground(new java.awt.Color(0, 134, 190));
        panelRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        registerButton.setBackground(new java.awt.Color(0, 0, 0));
        registerButton.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("REGISTRAR");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterButtonLayout = new javax.swing.GroupLayout(panelRegisterButton);
        panelRegisterButton.setLayout(panelRegisterButtonLayout);
        panelRegisterButtonLayout.setHorizontalGroup(
            panelRegisterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegisterButtonLayout.setVerticalGroup(
            panelRegisterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgRegister.add(panelRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 110, -1));

        panelAdjuntarButton.setBackground(new java.awt.Color(0, 134, 190));
        panelAdjuntarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        adjuntarBtn.setBackground(new java.awt.Color(0, 0, 0));
        adjuntarBtn.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        adjuntarBtn.setForeground(new java.awt.Color(255, 255, 255));
        adjuntarBtn.setText("ADJUNTAR");
        adjuntarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adjuntarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        adjuntarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adjuntarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adjuntarBtnMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelAdjuntarButtonLayout = new javax.swing.GroupLayout(panelAdjuntarButton);
        panelAdjuntarButton.setLayout(panelAdjuntarButtonLayout);
        panelAdjuntarButtonLayout.setHorizontalGroup(
            panelAdjuntarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdjuntarButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(adjuntarBtn)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelAdjuntarButtonLayout.setVerticalGroup(
            panelAdjuntarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdjuntarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adjuntarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgRegister.add(panelAdjuntarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 110, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(0, 0, 0));
        exitTxt.setText("X");
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
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 765, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgRegister.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameUserTextFieldRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUserTextFieldRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUserTextFieldRegisterActionPerformed

    private void passwordTextFieldRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldRegisterActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonMouseClicked

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonMouseEntered

    private void adjuntarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adjuntarBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adjuntarBtnMouseClicked

    private void adjuntarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adjuntarBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adjuntarBtnMouseEntered

    private void correoUserTextFieldRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoUserTextFieldRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoUserTextFieldRegisterActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
          System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
       exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoAdjuntLabel;
    private javax.swing.JLabel adjuntarBtn;
    private javax.swing.JPanel bgRegister;
    private javax.swing.JLabel citybg;
    private javax.swing.JLabel correoUserLabelRegister;
    private javax.swing.JTextField correoUserTextFieldRegister;
    private javax.swing.JLabel empresaLabelRegister;
    private javax.swing.JLabel empreseName;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nameEmpresaTextField;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JLabel nameUserLabelRegister;
    private javax.swing.JTextField nameUserTextFieldRegister;
    private javax.swing.JPanel panelAdjuntarButton;
    private javax.swing.JPanel panelRegisterButton;
    private javax.swing.JLabel passwordLabelRegister;
    private javax.swing.JPasswordField passwordTextFieldRegister;
    private javax.swing.JLabel registerButton;
    private javax.swing.JLabel registerText;
    // End of variables declaration//GEN-END:variables
}
