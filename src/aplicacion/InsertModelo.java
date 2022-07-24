/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InsertModelo extends javax.swing.JFrame {

    /**
     * Creates new form InsertModelo
     */
    public Statement sql;
    public InsertModelo() {
        initComponents();
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

        modFormBG = new javax.swing.JPanel();
        ModeloLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        modNombreTextField = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        modColorTextField = new javax.swing.JTextField();
        sizeLabel = new javax.swing.JLabel();
        modCapacidadTextField = new javax.swing.JTextField();
        capacidadLabel = new javax.swing.JLabel();
        modTamanoTextField = new javax.swing.JTextField();
        brandIdLabel = new javax.swing.JLabel();
        brandIdTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modFormBG.setBackground(new java.awt.Color(247, 247, 247));
        modFormBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ModeloLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ModeloLabel.setForeground(new java.awt.Color(27, 47, 59));
        ModeloLabel.setText("Model");
        modFormBG.add(ModeloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        nombreLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(27, 47, 59));
        nombreLabel.setText("Name");
        modFormBG.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        modFormBG.add(modNombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        colorLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(27, 47, 59));
        colorLabel.setText("Color");
        modFormBG.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        modFormBG.add(modColorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        sizeLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(27, 47, 59));
        sizeLabel.setText("Size");
        modFormBG.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        modFormBG.add(modCapacidadTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        capacidadLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        capacidadLabel.setForeground(new java.awt.Color(27, 47, 59));
        capacidadLabel.setText("Capacity");
        modFormBG.add(capacidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        modFormBG.add(modTamanoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

        brandIdLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        brandIdLabel.setForeground(new java.awt.Color(27, 47, 59));
        brandIdLabel.setText("Brand ID");
        modFormBG.add(brandIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));
        modFormBG.add(brandIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, -1));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmButtonMousePressed(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        modFormBG.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        modFormBG.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        if(        brandIdTextField.getText() != "" 
                && modCapacidadTextField.getText() != "" 
                && modColorTextField.getText() != ""
                && modNombreTextField.getText() != ""
                && modTamanoTextField.getText() != ""){
            String Query = "insert into Modelo (ModNombre, ModColor, ModCapacidad, ModTamaño, MarcaID) values ('" 
                    + modNombreTextField.getText() + "','" 
                    + modColorTextField.getText() + "','" 
                    + modCapacidadTextField.getText() + "','" 
                    + modTamanoTextField.getText() + "','" 
                    + brandIdTextField.getText() + "')";
            try {
                sql.executeQuery(Query);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            modNombreTextField.setText("");
            modColorTextField.setText("");
            modCapacidadTextField.setText("");
            modTamanoTextField.setText("");
            brandIdTextField.setText("");
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

    private void confirmButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMousePressed
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        confirmButton.setIcon(image);
    }//GEN-LAST:event_confirmButtonMousePressed

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMousePressed

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
            java.util.logging.Logger.getLogger(InsertModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ModeloLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel brandIdLabel;
    private javax.swing.JTextField brandIdTextField;
    private javax.swing.JLabel capacidadLabel;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField modCapacidadTextField;
    private javax.swing.JTextField modColorTextField;
    private javax.swing.JPanel modFormBG;
    private javax.swing.JTextField modNombreTextField;
    private javax.swing.JTextField modTamanoTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel sizeLabel;
    // End of variables declaration//GEN-END:variables
}
