/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

import ClassModel.Movimento_Class;
import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lyssa
 */
public class DAO_CadastroMovimento {
    private Connection conn = null;
    private Statement stm = null;   

    public DAO_CadastroMovimento() {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(Movimento_Class p) throws SQLException {
        
        //Form_Sistema tabela = new Form_Sistema();
        
        try {
            stm = conn.createStatement();
            String sql = String.format("INSERT INTO movimento(datal, saldo, processo) values ('%s', '%s', '%d')",
                    p.getData(), String.format("%.2f", p.getSaldo()).replace(",", "."), p.getProcesso());
            stm.executeUpdate(sql);
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conn.close();
    }
}
