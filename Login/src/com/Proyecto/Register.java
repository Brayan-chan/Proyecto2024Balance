package com.Proyecto;

import java.awt.Color;
import com.Proyecto.UserManager;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    int xMouse, yMouse;
    int red = 0;
    int green = 134;
    int blue = 190;
    int rojo = 0;
    int verde = 83;
    int azul = 117;

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        companyName = new javax.swing.JTextField();
        nameUserLabelRegister = new javax.swing.JLabel();
        correoUserLabelRegister = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        passwordLabelRegister = new javax.swing.JLabel();
        empresaLabelRegister = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelRegisterButton = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panelAdjuntarButton = new javax.swing.JPanel();
        adjuntarBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        nameLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/favicon.png"))); // NOI18N
        nameLogo.setText("BG'SFDI");
        bgRegister.add(nameLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        registerText.setBackground(new java.awt.Color(255, 255, 255));
        registerText.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        registerText.setText("REGISTRARSE");
        bgRegister.add(registerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        LogoAdjuntLabel.setBackground(new java.awt.Color(255, 255, 255));
        LogoAdjuntLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        LogoAdjuntLabel.setText("LOGO");
        bgRegister.add(LogoAdjuntLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 50, -1));

        companyName.setBorder(null);
        companyName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                companyNameMousePressed(evt);
            }
        });
        companyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameActionPerformed(evt);
            }
        });
        bgRegister.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 410, 30));

        nameUserLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        nameUserLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        nameUserLabelRegister.setText("NOMBRE DE USUARIO");
        bgRegister.add(nameUserLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        correoUserLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        correoUserLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        correoUserLabelRegister.setText("CORREO");
        bgRegister.add(correoUserLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        userName.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userName.setBorder(null);
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userNameMousePressed(evt);
            }
        });
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        bgRegister.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 410, 30));

        email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailMousePressed(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        bgRegister.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 410, 30));

        passwordLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordLabelRegister.setText("CONTRASEÑA");
        bgRegister.add(passwordLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        empresaLabelRegister.setBackground(new java.awt.Color(255, 255, 255));
        empresaLabelRegister.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        empresaLabelRegister.setText("EMPRESA");
        bgRegister.add(empresaLabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        bgRegister.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 410, 30));
        bgRegister.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 410, 20));
        bgRegister.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 410, 10));
        bgRegister.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 410, 10));
        bgRegister.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 410, 10));

        panelRegisterButton.setBackground(new java.awt.Color(0, 134, 190));
        panelRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(0, 134, 190));
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterButtonLayout = new javax.swing.GroupLayout(panelRegisterButton);
        panelRegisterButton.setLayout(panelRegisterButtonLayout);
        panelRegisterButtonLayout.setHorizontalGroup(
            panelRegisterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRegisterButtonLayout.setVerticalGroup(
            panelRegisterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        bgRegister.add(panelRegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 100, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdjuntarButtonLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(adjuntarBtn)
                .addGap(16, 16, 16))
        );
        panelAdjuntarButtonLayout.setVerticalGroup(
            panelAdjuntarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdjuntarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adjuntarBtn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        bgRegister.add(panelAdjuntarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 110, 40));

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
        exitTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/arrow.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitTxt)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 764, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgRegister.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        getContentPane().add(bgRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void adjuntarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adjuntarBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adjuntarBtnMouseClicked

    private void adjuntarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adjuntarBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adjuntarBtnMouseEntered

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
        Login newframe = new Login();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.GRAY);
        exitTxt.setForeground(Color.GRAY);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String username = userName.getText();
    String passwordText = String.valueOf(password.getPassword());
    String companyNameText = companyName.getText();
    String emailText = email.getText();

    // Verificar que todos los campos estén llenos
    if (username.isEmpty() || passwordText.isEmpty() || companyNameText.isEmpty() || emailText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Registro de usuario
        UserManager userManager = new UserManager();
        boolean registrado = userManager.registerUser(username, passwordText, companyNameText, emailText);
        if (registrado) {
            JOptionPane.showMessageDialog(this, "Registro exitoso.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Redirigir al frame de Login
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMousePressed

    }//GEN-LAST:event_emailMousePressed

    private void userNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMousePressed

    }//GEN-LAST:event_userNameMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed

    }//GEN-LAST:event_passwordMousePressed

    private void companyNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyNameMousePressed

    }//GEN-LAST:event_companyNameMousePressed

    private void companyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        Color customColor = new Color(rojo, verde, azul);
        jButton1.setBackground(customColor);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        Color customColor = new Color(red, green, blue);
        jButton1.setBackground(customColor);
    }//GEN-LAST:event_jButton1MouseExited

    public static void main(String args[]) {

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
    private javax.swing.JTextField companyName;
    private javax.swing.JLabel correoUserLabelRegister;
    private javax.swing.JTextField email;
    private javax.swing.JLabel empresaLabelRegister;
    private javax.swing.JLabel empreseName;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JLabel nameUserLabelRegister;
    private javax.swing.JPanel panelAdjuntarButton;
    private javax.swing.JPanel panelRegisterButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabelRegister;
    private javax.swing.JLabel registerText;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
