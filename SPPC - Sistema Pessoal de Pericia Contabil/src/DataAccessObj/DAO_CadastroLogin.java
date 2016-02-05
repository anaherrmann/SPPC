/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObj;

/**
 *
 * @author Leticia
 */
import java.sql.*;
import ClassModel.Usuario_Class;
import ConnectionFactory.ConnectionFactory;
import ClassModel.Usuario_Class;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO_CadastroLogin {

    private Connection conn = null;
    private Statement stm = null;

    public DAO_CadastroLogin() {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void add(Usuario_Class login) throws SQLException {

        try {
            stm = conn.createStatement();
            String sql = String.format("INSERT INTO login(usuario, senha, email, nome) values('%s', '%s', '%s', '%s')", login.getUsuario(), login.getSenha(), login.getEmail(), login.getNome());
            stm.executeUpdate(sql);
            stm.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
