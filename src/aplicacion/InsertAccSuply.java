/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Usuario
 */
public class InsertAccSuply extends javax.swing.JFrame {

    /**
     * Creates new form InsertAccSuply
     */
    public InsertAccSuply() {
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

        accSupFormBG = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        accSupLabel = new javax.swing.JLabel();
        accIDLabel = new javax.swing.JLabel();
        accIDTextField = new javax.swing.JTextField();
        supIDLabel = new javax.swing.JLabel();
        supIDTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accSupFormBG.setBackground(new java.awt.Color(247, 247, 247));
        accSupFormBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setText("Confirm");
        accSupFormBG.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

        accSupLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        accSupLabel.setForeground(new java.awt.Color(27, 47, 59));
        accSupLabel.setText("Accessory Supplier");
        accSupFormBG.add(accSupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        accIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        accIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        accIDLabel.setText("Accessory ID");
        accSupFormBG.add(accIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        accSupFormBG.add(accIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        supIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        supIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        supIDLabel.setText("Supplier ID");
        accSupFormBG.add(supIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        accSupFormBG.add(supIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        quantityLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(27, 47, 59));
        quantityLabel.setText("Qt.");
        accSupFormBG.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        accSupFormBG.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        priceLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(27, 47, 59));
        priceLabel.setText("Price");
        accSupFormBG.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        accSupFormBG.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, -1));

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
            java.util.logging.Logger.getLogger(InsertAccSuply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAccSuply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAccSuply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accIDLabel;
    private javax.swing.JTextField accIDTextField;
    private javax.swing.JPanel accSupFormBG;
    private javax.swing.JLabel accSupLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel supIDLabel;
    private javax.swing.JTextField supIDTextField;
    // End of variables declaration//GEN-END:variables
}
