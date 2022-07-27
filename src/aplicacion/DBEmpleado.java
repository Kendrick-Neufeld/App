/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.awt.Color;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Usuario
 */
public class DBEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form Database
     */
    public Statement sql;
    int xMouse, yMouse;
    private DefaultTableCellRenderer cellRenderer;
    
    public DBEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public DBEmpleado(Statement sql) {
        initComponents();
        setLocationRelativeTo(null);
        Tablas.getColumnModel().getColumn(0).setPreferredWidth(40);
        Tablas.getColumnModel().getColumn(0).setMaxWidth(40);
        
        for (int i = 1; i < 5; i++){
            Tablas.getColumnModel().getColumn(i).setPreferredWidth(80);
            Tablas.getColumnModel().getColumn(i).setMaxWidth(80);
        }
        
        for(int i = 5; i <= 8; i++){
            Tablas.getColumnModel().getColumn(i).setPreferredWidth(120);
            Tablas.getColumnModel().getColumn(i).setMaxWidth(120);
        }
        
        Tablas.getColumnModel().getColumn(9).setPreferredWidth(100);
        Tablas.getColumnModel().getColumn(9).setMaxWidth(100);
        
        Aplicacion appLogo = new Aplicacion();
        this.setIconImage(appLogo.logo.getImage());
        
        this.sql = sql;
        CargarArticulo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        blueStripe = new javax.swing.JPanel();
        redStripe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        catalog = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        dbase = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        windowActions = new javax.swing.JPanel();
        minimizeButton = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablas = new javax.swing.JTable();
        empLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        selectTableCombobox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel1.setText("Database");

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
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor7.png"))); // NOI18N
        insert.setText("Insert");
        insert.setBorder(null);
        insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        dbase.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        dbase.setForeground(new java.awt.Color(247, 247, 247));
        dbase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/Imagenes/buttonColor6.png"))); // NOI18N
        dbase.setText("Database");
        dbase.setBorder(null);
        dbase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blueStripeLayout = new javax.swing.GroupLayout(blueStripe);
        blueStripe.setLayout(blueStripeLayout);
        blueStripeLayout.setHorizontalGroup(
            blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueStripeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(blueStripeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(dbase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jPanel1.add(blueStripe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 570));

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
                .addGap(0, 1320, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(windowActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, -1));

        Tablas.setBackground(new java.awt.Color(194, 200, 203));
        Tablas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Tablas.setForeground(new java.awt.Color(27, 47, 59));
        Tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null, null, null, null, null, null},
                {"", "", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Sexo", "Salario", "Calle", "Sector", "Ciudad", "Telefono", "Departamento"
            }
        ));
        Tablas.setRowHeight(30);
        jScrollPane1.setViewportView(Tablas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 930, 340));

        empLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        empLabel.setForeground(new java.awt.Color(27, 47, 59));
        empLabel.setText("Empleado");
        jPanel1.add(empLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 230, 40));

        selectLabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(27, 47, 59));
        selectLabel.setText("Select Table");
        jPanel1.add(selectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, 100, 30));

        selectTableCombobox.setBackground(new java.awt.Color(194, 200, 203));
        selectTableCombobox.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        selectTableCombobox.setForeground(new java.awt.Color(27, 47, 59));
        selectTableCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Device", "Employee", "Supplier", "Model", "Brand", "Accessory", "Receipt", "Accessory Supply", "Device Supply", "Client" }));
        selectTableCombobox.setSelectedIndex(1);
        selectTableCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTableComboboxActionPerformed(evt);
            }
        });
        jPanel1.add(selectTableCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 150, 180, 40));

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
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 410, 110, 40));

        searchBar.setBackground(new java.awt.Color(194, 200, 203));
        searchBar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        searchBar.setForeground(new java.awt.Color(27, 47, 59));
        searchBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBarKeyPressed(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 240, 180, 40));

        searchLabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(27, 47, 59));
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setText("Search");
        jPanel1.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 210, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor6.png");
        insert.setIcon(image);
    }//GEN-LAST:event_insertMouseEntered

    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor7.png");
        insert.setIcon(image);
    }//GEN-LAST:event_insertMouseExited

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try{
            TableSelect selectTable = new TableSelect();
            selectTable.sql = this.sql;
            selectTable.setVisible(true);
            this.dispose();
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void dbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbaseActionPerformed
        DBEmpleado dbView = new DBEmpleado();
        dbView.sql = this.sql;
        dbView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dbaseActionPerformed

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

    private void selectTableComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTableComboboxActionPerformed
        // TODO add your handling code here:
        switch(selectTableCombobox.getSelectedIndex()){
            case 0:
            DBDevice dbdevice = new DBDevice(sql);
            dbdevice.sql = this.sql;
            dbdevice.setVisible(true);
            this.dispose();
            break;
            case 1:
                DBEmpleado dbempleado = new DBEmpleado(sql);
                dbempleado.sql = this.sql;
            break;
            case 2:
            DBSuplidor dbsuplidor = new DBSuplidor(sql);
            dbsuplidor.sql = this.sql;
            dbsuplidor.setVisible(true);
            this.dispose();
            break;
            case 3:
            DBModelo dbmodelo = new DBModelo(sql);
            dbmodelo.sql = this.sql;
            dbmodelo.setVisible(true);
            this.dispose();
            break;
            case 4:
            DBBrand dbbrand = new DBBrand(sql);
            dbbrand.sql = this.sql;
            dbbrand.setVisible(true);
            this.dispose();
            break;
            case 5:
            DBAccesorio dbaccesorio = new DBAccesorio(sql);
            dbaccesorio.sql = this.sql;
            dbaccesorio.setVisible(true);
            this.dispose();
            break;
            case 6:
            DBFactura dbfactura = new DBFactura(sql);
            dbfactura.sql = this.sql;
            dbfactura.setVisible(true);
            this.dispose();
            break;
            case 7:
            DBAccesorioSuplidor dbaccesoriosuplidor = new DBAccesorioSuplidor(sql);
            dbaccesoriosuplidor.sql = this.sql;
            dbaccesoriosuplidor.setVisible(true);
            this.dispose();
            break;
            case 8:
            DBDispositivoSuplidor dbdispositivossuplidor = new DBDispositivoSuplidor(sql);
            dbdispositivossuplidor.sql = this.sql;
            dbdispositivossuplidor.setVisible(true);
            this.dispose();
            break;
            case 9:
            DBCliente dbcliente = new DBCliente(sql);
            dbcliente.sql = this.sql;
            dbcliente.setVisible(true);
            this.dispose();
            break;
            default :
            System.out.println("Hubo un error en la seleccion de tablas.");
            break;
        }
    }//GEN-LAST:event_selectTableComboboxActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor2.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        ImageIcon image = new ImageIcon("src/aplicacion/Imagenes/buttonColor1.png");
        backButton.setIcon(image);
    }//GEN-LAST:event_backButtonMousePressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        db.sql = this.sql;
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed
        DefaultTableModel table = (DefaultTableModel)Tablas.getModel();
        String search = searchBar.getText();
        TableRowSorter<DefaultTableModel> rows = new TableRowSorter<DefaultTableModel>(table);
        Tablas.setRowSorter(rows);
        rows.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchBarKeyPressed

    public void CargarArticulo(){
        ResultSet res = null;
        DefaultTableModel modelo = (DefaultTableModel) Tablas.getModel();
        modelo.setRowCount(0);
        String query = "select * from Empleado";
        try{
        res = sql.executeQuery(query);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        try{
           
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getInt(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                v.add(res.getString(8));
                v.add(res.getString(9));
                v.add(res.getString(10));
                modelo.addRow(v);
                Tablas.setModel(modelo);
            }  
            
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(DBEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablas;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel blueStripe;
    private javax.swing.JButton catalog;
    private javax.swing.JButton dbase;
    private javax.swing.JLabel empLabel;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPanel redStripe;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JComboBox<String> selectTableCombobox;
    private javax.swing.JPanel windowActions;
    // End of variables declaration//GEN-END:variables
}
