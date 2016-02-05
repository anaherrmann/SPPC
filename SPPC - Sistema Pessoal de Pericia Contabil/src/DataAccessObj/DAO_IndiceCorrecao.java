/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

import ClassModel.IndiceCorrecao_Class;
import ConnectionFactory.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leticia
 */
public class DAO_IndiceCorrecao {

    private Connection conn;
    private Statement stm;

    public DAO_IndiceCorrecao() {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_IndiceCorrecao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_IndiceCorrecao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(IndiceCorrecao_Class indice) {

        try {
            stm = conn.createStatement();
            //String sql = String.format(null, args);

        } catch (SQLException ex) {
            Logger.getLogger(DAO_IndiceCorrecao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
