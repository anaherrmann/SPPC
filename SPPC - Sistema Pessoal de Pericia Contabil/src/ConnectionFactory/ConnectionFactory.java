/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionFactory;

/**
 *
 * @author Leticia
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    static String url = "jdbc:postgresql://localhost:5432/SPPC";
    static String username = "postgres";
    static String password = "123";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
         
        Connection conn = null;
         
         try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, password);
            //JOptionPane.showMessageDialog(null, "Connection Succeded!"); 
         } catch (SQLException error){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar acessar o Banco de Dados.");
         }
         
         return conn;         
    }
}
