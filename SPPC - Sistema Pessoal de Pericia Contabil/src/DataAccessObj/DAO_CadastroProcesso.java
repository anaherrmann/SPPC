/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

import ClassModel.Processo_Class;
import ConnectionFactory.ConnectionFactory;
import GUI.Form_Sistema;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leticia
 */
public class DAO_CadastroProcesso {
    
    private Connection conn = null;
    private Statement stm = null;   

    public DAO_CadastroProcesso() {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(Processo_Class p) throws SQLException {
        
        //Form_Sistema tabela = new Form_Sistema();
        
        try {
            stm = conn.createStatement();
            String sql = String.format("INSERT INTO processo(processo, nome, banco, conta, agencia) values ('%d', '%s', '%s', '%d', '%d')",
                    p.getProcesso(), p.getNome(), p.getBanco(), p.getConta(), p.getAgencia());
            stm.executeUpdate(sql);
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conn.close();
    }
}
