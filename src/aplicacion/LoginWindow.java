/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class LoginWindow extends javax.swing.JFrame {
    
    public Statement sql;
    int xMouse, yMouse;
    /**
     * Creates new form LoginWindow
     */
    
    public LoginWindow() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(logoLabel, "src/aplicacion/Imagenes/Logo #1.png" );
        rsscalelabel.RSScaleLabel.setScaleLabel(userIcon, "src/aplicacion/Imagenes/user.png" );
        rsscalelabel.RSScaleLabel.setScaleLabel(pwIcon, "src/aplicacion/Imagenes/pw.png" );
        logoLabel.requestFocusInWindow();     
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordTextField = new javax.swing.JPasswordField();
        userTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        connectButton = new javax.swing.JButton();
        pwIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        redStripe = new javax.swing.JPanel();
        blueStripe = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        windowActions = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTextField.setBackground(new java.awt.Color(194, 200, 203));
        passwordTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(146, 147, 149));
        passwordTextField.setText("•••••••••");
        passwordTextField.setBorder(null);
        passwordTextField.setEchoChar('\u25cf');
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextFieldMousePressed(evt);
            }
        });
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 250, 50));

        userTextField.setBackground(new java.awt.Color(194, 200, 203));
        userTextField.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        userTextField.setForeground(new java.awt.Color(146, 147, 149));
        userTextField.setText("Username");
        userTextField.setBorder(null);
        userTextField.setVerifyInputWhenFocusTarget(false);
        userTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextFieldMousePressed(evt);
            }
        });
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 250, 50));

        jPanel3.setBackground(new java.awt.Color(194, 200, 203));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 260, 50));

        jPanel4.setBackground(new java.awt.Color(194, 200, 203));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 260, 50));
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 280, 140));

        connectButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        connectButton.setForeground(new java.awt.Color(27, 47, 59));
        connectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor3.png"))); // NOI18N
        connectButton.setText("Connect");
        connectButton.setBorder(null);
        connectButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        connectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                connectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                connectButtonMouseExited(evt);
            }
        });
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(connectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 130, 60));
        jPanel1.add(pwIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 75, 56));
        jPanel1.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 75, 56));

        redStripe.setBackground(new java.awt.Color(211, 22, 34));

        blueStripe.setBackground(new java.awt.Color(27, 47, 59));

        javax.swing.GroupLayout blueStripeLayout = new javax.swing.GroupLayout(blueStripe);
        blueStripe.setLayout(blueStripeLayout);
        blueStripeLayout.setHorizontalGroup(
            blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        blueStripeLayout.setVerticalGroup(
            blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout redStripeLayout = new javax.swing.GroupLayout(redStripe);
        redStripe.setLayout(redStripeLayout);
        redStripeLayout.setHorizontalGroup(
            redStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redStripeLayout.createSequentialGroup()
                .addComponent(blueStripe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        redStripeLayout.setVerticalGroup(
            redStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redStripeLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(blueStripe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(redStripe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 740, 40));

        headerPanel.setBackground(new java.awt.Color(194, 200, 203));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        windowActions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeButton.setBackground(new java.awt.Color(194, 200, 203));

        minimizeLabel.setBackground(new java.awt.Color(247, 247, 247));
        minimizeLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        minimizeLabel.setForeground(new java.awt.Color(27, 47, 59));
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("—");
        minimizeLabel.setToolTipText("");
        minimizeLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minimizeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizeButtonLayout = new javax.swing.GroupLayout(minimizeButton);
        minimizeButton.setLayout(minimizeButtonLayout);
        minimizeButtonLayout.setHorizontalGroup(
            minimizeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        minimizeButtonLayout.setVerticalGroup(
            minimizeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeButtonLayout.createSequentialGroup()
                .addComponent(minimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        windowActions.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        exitButton.setBackground(new java.awt.Color(194, 200, 203));

        exitLabel.setBackground(new java.awt.Color(247, 247, 247));
        exitLabel.setFont(new java.awt.Font("Roboto", 1, 19)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(27, 47, 59));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        windowActions.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, -1));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 660, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        try{
        sql = getConexion(userTextField.getText(),passwordTextField.getText()).createStatement();
        System.out.println("Login Succesful!");
        MainMenu Mainmenu = new MainMenu();
        Mainmenu.setVisible(true);
        Mainmenu.sql = this.sql;
         this.dispose();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void userTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextFieldMousePressed
        if (userTextField.getText().equals("Username")){
            userTextField.setText("");
            userTextField.setForeground(new Color(27,47,59));
        }
        
        if (String.valueOf(passwordTextField.getPassword()).isEmpty()){
            passwordTextField.setText("•••••••••");
            passwordTextField.setForeground(new Color(146,147,149));
        }
    }//GEN-LAST:event_userTextFieldMousePressed

    private void passwordTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMousePressed
        if (String.valueOf(passwordTextField.getPassword()).equals("•••••••••")){
            passwordTextField.setText("");
            passwordTextField.setForeground(new Color(27,47,59));
        }
        
        if (userTextField.getText().isEmpty()){
            userTextField.setText("Username");
            userTextField.setForeground(new Color(146,147,149));
        }
    }//GEN-LAST:event_passwordTextFieldMousePressed

    private void connectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor4.png");
        connectButton.setIcon(image);
    }//GEN-LAST:event_connectButtonMouseEntered

    private void connectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor3.png");
        connectButton.setIcon(image);
    }//GEN-LAST:event_connectButtonMouseExited

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(TableSelect.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void minimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseEntered
        minimizeButton.setBackground(new Color(146,147,149));
    }//GEN-LAST:event_minimizeLabelMouseEntered

    private void minimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseExited
        minimizeButton.setBackground(new Color(194,200,203));
    }//GEN-LAST:event_minimizeLabelMouseExited

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        exitButton.setBackground(new Color(211,22,34));
        exitLabel.setForeground(new Color(247,247,247));
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        exitButton.setBackground(new Color(194,200,203));
        exitLabel.setForeground(new Color(27,47,59));
    }//GEN-LAST:event_exitLabelMouseExited

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    
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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }
    
    
    public static Connection getConexion(String User, String Password){
        String conexion = "jdbc:sqlserver://localhost:1433;"
                + "database=App;"
                + "encrypt=true;trustServerCertificate=true;"
                + "user=" + User + ";"
                + "password=" + Password + ";"
                + "loginTimeout=30;";
        
        try{
            Connection con = DriverManager.getConnection(conexion);
            return con;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "User or Password Incorrect");
            System.out.println(ex);
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blueStripe;
    private javax.swing.JButton connectButton;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel pwIcon;
    private javax.swing.JPanel redStripe;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField userTextField;
    private javax.swing.JPanel windowActions;
    // End of variables declaration//GEN-END:variables
}
