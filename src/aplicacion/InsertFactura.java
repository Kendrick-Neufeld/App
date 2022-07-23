/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class InsertFactura extends javax.swing.JFrame {

    /**
     * Creates new form InsertClient
     */
    public Statement sql;
    public InsertFactura() {
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

        facturaFormBG = new javax.swing.JPanel();
        tipoProdSelect = new javax.swing.JComboBox<>();
        itemIdTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsToPurchaseTextArea = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        facturaLabel = new javax.swing.JLabel();
        purchaseLabel = new javax.swing.JLabel();
        cliIdTextField = new javax.swing.JTextField();
        cliIDLabel = new javax.swing.JLabel();
        itemIdLabel = new javax.swing.JLabel();
        modIDLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        facturaFormBG.setBackground(new java.awt.Color(247, 247, 247));
        facturaFormBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipoProdSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dispo", "Acc" }));
        facturaFormBG.add(tipoProdSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));
        facturaFormBG.add(itemIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        itemsToPurchaseTextArea.setColumns(20);
        itemsToPurchaseTextArea.setRows(5);
        jScrollPane1.setViewportView(itemsToPurchaseTextArea);

        facturaFormBG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 160));

        addButton.setText("Add");
        facturaFormBG.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, -1));

        confirmButton.setText("Confirm");
        facturaFormBG.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

        facturaLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        facturaLabel.setForeground(new java.awt.Color(27, 47, 59));
        facturaLabel.setText("Receipt");
        facturaFormBG.add(facturaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        purchaseLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        purchaseLabel.setForeground(new java.awt.Color(27, 47, 59));
        purchaseLabel.setText("Purchase");
        facturaFormBG.add(purchaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 60, -1));
        facturaFormBG.add(cliIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        cliIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cliIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        cliIDLabel.setText("Client ID");
        facturaFormBG.add(cliIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        itemIdLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        itemIdLabel.setForeground(new java.awt.Color(27, 47, 59));
        itemIdLabel.setText("Item ID");
        facturaFormBG.add(itemIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        modIDLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        modIDLabel2.setForeground(new java.awt.Color(27, 47, 59));
        modIDLabel2.setText("Type");
        facturaFormBG.add(modIDLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        facturaFormBG.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaFormBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        TableSelect selectTable = new TableSelect();
        selectTable.sql = this.sql;
        selectTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InsertFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cliIDLabel;
    private javax.swing.JTextField cliIdTextField;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel facturaFormBG;
    private javax.swing.JLabel facturaLabel;
    private javax.swing.JLabel itemIdLabel;
    private javax.swing.JTextField itemIdTextField;
    private javax.swing.JTextArea itemsToPurchaseTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modIDLabel2;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JComboBox<String> tipoProdSelect;
    // End of variables declaration//GEN-END:variables
}
