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
public class InsertDispositivo extends javax.swing.JFrame {

    /**
     * Creates new form Dispositivo
     */
    public InsertDispositivo() {
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
        accSupLabel = new javax.swing.JLabel();
        modIDLabel = new javax.swing.JLabel();
        modIdTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setText("Confirm");
        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, 40));

        accSupLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        accSupLabel.setForeground(new java.awt.Color(27, 47, 59));
        accSupLabel.setText("Device");
        jPanel1.add(accSupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        modIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        modIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        modIDLabel.setText("Model ID");
        jPanel1.add(modIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(modIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        quantityLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(27, 47, 59));
        quantityLabel.setText("Qt.");
        jPanel1.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        priceLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(27, 47, 59));
        priceLabel.setText("Price");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(InsertDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDispositivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertDispositivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accSupLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel modIDLabel;
    private javax.swing.JTextField modIdTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    // End of variables declaration//GEN-END:variables
}
