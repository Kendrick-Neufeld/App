/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class TableSelect extends javax.swing.JFrame {

    /**
     * Creates new form TableSelect
     */
    
    public Statement sql;
    int xMouse, yMouse;
    
    public TableSelect() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(logoLabel, "src/aplicacion/Imagenes/Logo #1.png" );
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
        Tabla = new javax.swing.JComboBox<>();
        connectButton = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        windowActions = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        blueStripe = new javax.swing.JPanel();
        redStripe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        catalog = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setBackground(new java.awt.Color(194, 200, 203));
        Tabla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(27, 47, 59));
        Tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Supplier", "Device", "Model", "Brand", "Accessory", "Receipt", "Accessory Supply", "Device Supply", "Client" }));
        Tabla.setSelectedIndex(-1);
        Tabla.setBorder(null);
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tabla.setLightWeightPopupEnabled(false);
        Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaActionPerformed(evt);
            }
        });
        jPanel1.add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 310, 270, 50));

        connectButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        connectButton.setForeground(new java.awt.Color(27, 47, 59));
        connectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor3.png"))); // NOI18N
        connectButton.setText("Continue");
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
        jPanel1.add(connectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 380, 110, 50));

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
                .addGap(0, 920, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        blueStripe.setBackground(new java.awt.Color(27, 47, 59));

        redStripe.setBackground(new java.awt.Color(211, 22, 34));

        javax.swing.GroupLayout redStripeLayout = new javax.swing.GroupLayout(redStripe);
        redStripe.setLayout(redStripeLayout);
        redStripeLayout.setHorizontalGroup(
            redStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        redStripeLayout.setVerticalGroup(
            redStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Insert");

        catalog.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        catalog.setForeground(new java.awt.Color(247, 247, 247));
        catalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor7.png"))); // NOI18N
        catalog.setText("Catalog");
        catalog.setBorder(null);
        catalog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        catalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catalogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catalogMouseExited(evt);
            }
        });

        menu.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        menu.setForeground(new java.awt.Color(247, 247, 247));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor7.png"))); // NOI18N
        menu.setText("Menu");
        menu.setBorder(null);
        menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        insert.setForeground(new java.awt.Color(247, 247, 247));
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor6.png"))); // NOI18N
        insert.setText("Insert");
        insert.setBorder(null);
        insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        edit.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        edit.setForeground(new java.awt.Color(247, 247, 247));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor7.png"))); // NOI18N
        edit.setText("Database");
        edit.setBorder(null);
        edit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blueStripeLayout = new javax.swing.GroupLayout(blueStripe);
        blueStripe.setLayout(blueStripeLayout);
        blueStripeLayout.setHorizontalGroup(
            blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueStripeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catalog, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(blueStripeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(redStripe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueStripeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(49, 49, 49))
        );
        blueStripeLayout.setVerticalGroup(
            blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueStripeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redStripe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catalog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jPanel1.add(blueStripe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 570));
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 380, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TablaActionPerformed

    private void connectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor4.png");
        connectButton.setIcon(image);
    }//GEN-LAST:event_connectButtonMouseEntered

    private void connectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor3.png");
        connectButton.setIcon(image);
    }//GEN-LAST:event_connectButtonMouseExited

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        int IdTableSelect = Tabla.getSelectedIndex();
        switch(IdTableSelect){
            case 0:
                InsertEmpleado insEmp = new InsertEmpleado();
                insEmp.sql = this.sql;
                insEmp.setVisible(true);
                this.dispose();
                break;
            case 1:
                InsertSuplidor insSup = new InsertSuplidor();
                insSup.sql = this.sql;
                insSup.setVisible(true);
                this.dispose();
                break;
            case 2:
                InsertDispositivo insDispo= new InsertDispositivo();
                insDispo.sql = this.sql;
                insDispo.setVisible(true);
                this.dispose();
                break;
            case 3:
                InsertModelo insMod= new InsertModelo();
                insMod.sql = this.sql;
                insMod.setVisible(true);
                this.dispose();
                break;    
            case 4:
                InsertMarca insMarca = new InsertMarca();
                insMarca.sql = this.sql;
                insMarca.setVisible(true);
                this.dispose();
                break;
            case 5: 
                InsertAccesorio insAcc = new InsertAccesorio();
                insAcc.sql = this.sql;
                insAcc.setVisible(true);
                this.dispose();     
                break;
            case 6:
                InsertFactura insFactura = new InsertFactura();
                insFactura.sql = this.sql;
                insFactura.setVisible(true);
                this.dispose();
                break;
            case 7:
                InsertAccSuplidor insAccSup = new InsertAccSuplidor();
                insAccSup.sql = this.sql;
                insAccSup.setVisible(true);
                this.dispose();
                break;
            case 8:
                InsertDispSuplidor insDispSup = new InsertDispSuplidor();
                insDispSup.sql = this.sql;
                insDispSup.setVisible(true);
                this.dispose();
                break;
            case 9:
                InsertCliente insCliente = new InsertCliente();
                insCliente.sql = this.sql;
                insCliente.setVisible(true);
                this.dispose();
                break;
            default :
                System.out.println("Hubo un error en la seleccion de tablas.");
                break;    
        }
    }//GEN-LAST:event_connectButtonActionPerformed

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

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        this.setExtendedState(TableSelect.ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void minimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseEntered
        minimizeButton.setBackground(new Color(146,147,149));
    }//GEN-LAST:event_minimizeLabelMouseEntered

    private void minimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseExited
        minimizeButton.setBackground(new Color(194,200,203));
    }//GEN-LAST:event_minimizeLabelMouseExited

    private void catalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        catalog.setIcon(image);
    }//GEN-LAST:event_catalogMouseEntered

    private void catalogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        catalog.setIcon(image);
    }//GEN-LAST:event_catalogMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        edit.setIcon(image);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        edit.setIcon(image);
    }//GEN-LAST:event_editMouseExited

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_editActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MainMenu Mainmenu = new MainMenu();
        Mainmenu.setVisible(true);
        Mainmenu.sql = this.sql;
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        menu.setIcon(image);
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        menu.setIcon(image);
    }//GEN-LAST:event_menuMouseExited

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
            java.util.logging.Logger.getLogger(TableSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tabla;
    private javax.swing.JPanel blueStripe;
    private javax.swing.JButton catalog;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton edit;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton menu;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPanel redStripe;
    private javax.swing.JPanel windowActions;
    // End of variables declaration//GEN-END:variables
}
