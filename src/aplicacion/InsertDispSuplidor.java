/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InsertDispSuplidor extends javax.swing.JFrame {

    /**
     * Creates new form InsertDispSuply
     */
    
    public Statement sql;
    int xMouse, yMouse;
    
    public InsertDispSuplidor() {
        initComponents();
        setLocationRelativeTo(null);
        
        Aplicacion appLogo = new Aplicacion();
        this.setIconImage(appLogo.logo.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dispoSupFormBG = new javax.swing.JPanel();
        confirmButton = new javax.swing.JButton();
        accSupLabel = new javax.swing.JLabel();
        dispoIDLabel = new javax.swing.JLabel();
        dispoIDTextField = new javax.swing.JTextField();
        supIDLabel = new javax.swing.JLabel();
        supIDTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        dispoSupFormBG.setBackground(new java.awt.Color(247, 247, 247));
        dispoSupFormBG.setPreferredSize(new java.awt.Dimension(740, 500));
        dispoSupFormBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        dispoSupFormBG.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 110, 40));

        accSupLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        accSupLabel.setForeground(new java.awt.Color(27, 47, 59));
        accSupLabel.setText("Device Supplier");
        dispoSupFormBG.add(accSupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        dispoIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dispoIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        dispoIDLabel.setText("Device ID");
        dispoSupFormBG.add(dispoIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        dispoIDTextField.setBackground(new java.awt.Color(194, 200, 203));
        dispoIDTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dispoIDTextField.setForeground(new java.awt.Color(27, 47, 59));
        dispoIDTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        dispoSupFormBG.add(dispoIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 130, 25));

        supIDLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        supIDLabel.setForeground(new java.awt.Color(27, 47, 59));
        supIDLabel.setText("Supplier ID");
        dispoSupFormBG.add(supIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        supIDTextField.setBackground(new java.awt.Color(194, 200, 203));
        supIDTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        supIDTextField.setForeground(new java.awt.Color(27, 47, 59));
        supIDTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        dispoSupFormBG.add(supIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, 25));

        quantityLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(27, 47, 59));
        quantityLabel.setText("Qt.");
        dispoSupFormBG.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        priceTextField.setBackground(new java.awt.Color(194, 200, 203));
        priceTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(27, 47, 59));
        priceTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        dispoSupFormBG.add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, 25));

        priceLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(27, 47, 59));
        priceLabel.setText("Price");
        dispoSupFormBG.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, -1));

        quantityTextField.setBackground(new java.awt.Color(194, 200, 203));
        quantityTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quantityTextField.setForeground(new java.awt.Color(27, 47, 59));
        quantityTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        dispoSupFormBG.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 130, 25));

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
        dispoSupFormBG.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 110, 40));

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

        dispoSupFormBG.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

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
        catalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogActionPerformed(evt);
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
                .addGap(52, 52, 52))
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

        dispoSupFormBG.add(blueStripe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dispoSupFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dispoSupFormBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        if(dispoIDTextField.getText() != "" && priceTextField.getText() != "" && quantityTextField.getText() != "" 
                && supIDTextField.getText() != ""){
            String Query = "insert into DispoSuplidor (DispID,SupID,Precio,Cantidad) values ('" + dispoIDTextField.getText() + "','"
                    + supIDTextField.getText() + "','" + priceTextField.getText() + "','" + quantityTextField.getText() + "')";
            try {
                sql.executeQuery(Query);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            dispoIDTextField.setText("");
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

    private void catalogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        catalog.setIcon(image);
    }//GEN-LAST:event_catalogMouseEntered

    private void catalogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        catalog.setIcon(image);
    }//GEN-LAST:event_catalogMouseExited

    private void catalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogActionPerformed
        Catalog cat = new Catalog(sql);
        cat.sql = this.sql;
        cat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_catalogActionPerformed

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        menu.setIcon(image);
    }//GEN-LAST:event_menuMouseEntered

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        menu.setIcon(image);
    }//GEN-LAST:event_menuMouseExited

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        mainMenu.sql = this.sql;
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        edit.setIcon(image);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        edit.setIcon(image);
    }//GEN-LAST:event_editMouseExited

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        DBDevice dbView = new DBDevice(sql);
        dbView.sql = this.sql;
        dbView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(InsertDispSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDispSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDispSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDispSuplidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertDispSuplidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accSupLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel blueStripe;
    private javax.swing.JButton catalog;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel dispoIDLabel;
    private javax.swing.JTextField dispoIDTextField;
    private javax.swing.JPanel dispoSupFormBG;
    private javax.swing.JButton edit;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menu;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JPanel redStripe;
    private javax.swing.JLabel supIDLabel;
    private javax.swing.JTextField supIDTextField;
    private javax.swing.JPanel windowActions;
    // End of variables declaration//GEN-END:variables
}
