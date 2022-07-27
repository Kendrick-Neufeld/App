/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


/**
 *
 * @author Usuario
 */
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public ImageIcon logo = new ImageIcon("src/aplicacion/Imagenes/AppIcon.png");
    public static void main(String[] args) {
        // TODO code application logic here
        LoginWindow windowLogin = new LoginWindow();
        windowLogin.setVisible(true);
    }
    
    
}
