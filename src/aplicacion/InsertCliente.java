/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InsertCliente extends javax.swing.JFrame {

    /**
     * Creates new form InsertMarca
     */
    
    public Statement sql;
    public InsertCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        cliNombreTextField = new javax.swing.JTextField();
        apellidoLabel = new javax.swing.JLabel();
        cliApellidoTextField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        cliNumTelefonoTextField = new javax.swing.JTextField();
        empLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(27, 47, 59));
        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor1.png"))); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.setBorder(null);
        confirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

        backButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 47, 59));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor1.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 40));

        nombreLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(27, 47, 59));
        nombreLabel.setText("Name");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, -1));
        jPanel1.add(cliNombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        apellidoLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        apellidoLabel.setForeground(new java.awt.Color(27, 47, 59));
        apellidoLabel.setText("Second Name");
        jPanel1.add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));
        jPanel1.add(cliApellidoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        numberLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(27, 47, 59));
        numberLabel.setText("Phone No.");
        jPanel1.add(numberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(cliNumTelefonoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        empLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        empLabel.setForeground(new java.awt.Color(27, 47, 59));
        empLabel.setText("Client");
        jPanel1.add(empLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        if(cliNombreTextField.getText() != "" 
                && cliApellidoTextField.getText() != ""
                && cliNumTelefonoTextField.getText() != ""){
            String Query = "insert into Cliente (CliNombre, CliApellido, CliTelefono) "
                    + "values ('" + cliNombreTextField.getText() + "','"
                    + cliApellidoTextField.getText() + "','"
                    +cliNumTelefonoTextField.getText() +"')" ;
            try {
                sql.executeQuery(Query);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            cliNombreTextField.setText("");
            cliApellidoTextField.setText("");
            cliNumTelefonoTextField.setText("");
            JOptionPane.showMessageDialog(null, "Data succesfully added");
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Insert Data First");
        }     
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        TableSelect selectTable = new TableSelect();
        selectTable.sql = this.sql;
        selectTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor2.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMouseExited

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor2.png");
        confirmButton.setIcon(image);
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        confirmButton.setIcon(image);
    }//GEN-LAST:event_confirmButtonMouseExited

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
            java.util.logging.Logger.getLogger(InsertCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cliApellidoTextField;
    private javax.swing.JTextField cliNombreTextField;
    private javax.swing.JTextField cliNumTelefonoTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel empLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel numberLabel;
    // End of variables declaration//GEN-END:variables
}
