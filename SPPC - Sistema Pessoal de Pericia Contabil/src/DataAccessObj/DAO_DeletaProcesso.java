/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leticia
 */
public class DAO_DeletaProcesso {
    
    private Connection conn;
    private Statement stm;
    
    public DAO_DeletaProcesso(){
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_DeletaProcesso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_DeletaProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id){
        
        try {
            stm = conn.createStatement();
            String sql = String.format("DELETE from processo WHERE id = '%d'", id);
            stm.executeUpdate(sql);
            stm.close();
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO_DeletaProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
