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
public class InsertAccSuplidor extends javax.swing.JFrame {

    /**
     * Creates new form InsertAccSuply
     */
    
    public Statement sql;
    ImageIcon image = new ImageIcon();
    
    public InsertAccSuplidor() {
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

        accSupFormBG = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        accSupLabel = new javax.swing.JLabel();
        accIDLabel = new javax.swing.JLabel();
        supIDLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        quantityTextField = new javax.swing.JTextField();
        accIDTextField = new javax.swing.JTextField();
        supIDTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accSupFormBG.setBackground(new java.awt.Color(247, 247, 247));
        accSupFormBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        accSupFormBG.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

        accSupLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        accSupLabel.setForeground(new java.awt.Color(27, 47, 59));
        accSupLabel.setText("Accessory Supplier");
        accSupFormBG.add(accSupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, -1));

        accIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        accIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        accIDLabel.setText("Accessory ID");
        accSupFormBG.add(accIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        supIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        supIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        supIDLabel.setText("Supplier ID");
        accSupFormBG.add(supIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        quantityLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(27, 47, 59));
        quantityLabel.setText("Qt.");
        accSupFormBG.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        priceLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(27, 47, 59));
        priceLabel.setText("Price");
        accSupFormBG.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, -1));

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
        accSupFormBG.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 40));
        accSupFormBG.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 22));
        accSupFormBG.add(accIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 22));
        accSupFormBG.add(supIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 22));
        accSupFormBG.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accSupFormBG, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accSupFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        if(accIDTextField.getText() != "" && priceTextField.getText() != "" && quantityTextField.getText() != "" 
                && supIDTextField.getText() != ""){
                String Query = "insert into AccSuplidor (AccID,SupID,Precio,Cantidad) values ('" + accIDTextField.getText() + "','"
                 + supIDTextField.getText() + "','" + priceTextField.getText() + "','" + quantityTextField.getText() + "')";
            try {
                sql.executeQuery(Query);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            accIDTextField.setText("");
            priceTextField.setText("");
            quantityTextField.setText("");
            supIDTextField.setText("");
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
            java.util.logging.Logger.getLogger(InsertAccSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAccSuplidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accIDLabel;
    private javax.swing.JTextField accIDTextField;
    private javax.swing.JPanel accSupFormBG;
    private javax.swing.JLabel accSupLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel supIDLabel;
    private javax.swing.JTextField supIDTextField;
    // End of variables declaration//GEN-END:variables
}
