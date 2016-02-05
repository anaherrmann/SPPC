/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

import ClassModel.Processo_Class;
import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leticia
 */
public class DAO_AlterarProcesso {

    private Connection conn;
    private Statement stm;

    public DAO_AlterarProcesso() {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_AlterarProcesso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_AlterarProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Processo_Class p) throws SQLException {

        try {
            String sql = String.format("UPDATE processo SET processo = '%d', nome = '%s', banco = '%s', conta = '%d', agencia = '%d' WHERE id = '%d'",
                     p.getProcesso(), p.getNome(), p.getBanco(), p.getConta(), p.getAgencia(), p.getId());
            stm = conn.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_AlterarProcesso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
}
