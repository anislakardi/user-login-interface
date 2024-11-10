/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface.de.connexion.avec.base.de.données;

/**
 *
 * @author PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class InterfaceDeConnexionAvecBaseDeDonnées {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");  // Charger le driver JDBC
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(InterfaceDeConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
