/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import GUI.*;
import java.sql.*;
import ConnectionFactory.ConnectionFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class Main {
    
    private static String nome;
    private boolean check2;

    public boolean isCheck2() {
        return check2;
    }

    public void setCheck2(boolean check2) {
        this.check2 = check2;
    }
    private static Connection conn = null;
    private static ResultSet rs = null;
    private static PreparedStatement pstm = null;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void home() throws SQLException{
        try {
            Main.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = String.format("SELECT * from autologin WHERE id = '1'"); // and nome LIKE '%s'", name_Combo.getSelectedItem()
        pstm = conn.prepareStatement(sql);
        rs = pstm.executeQuery();
        
        if (rs.next()){
            boolean check = rs.getBoolean("checked");
            String user = rs.getString("usuario");
            String pass = rs.getString("senha");
            String name = rs.getString("nome");
            setNome(name);
            setCheck2(check);
            if (check){
                //new Form_CadastroProcesso().setVisible(true);
                new Form_Sistema().setVisible(true);
                //new Form_Processo().setVisible(true);
                //new Form_AlterarProcesso().setVisible(true);
                //new Form_AlterarTaxaBCB().setVisible(true);
            } else {
                new Form_Login().setVisible(true);
            }
        }
    }
    
    public void setSOInterface() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Main main = new Main();
        
        main.setSOInterface();
        main.home();

    }
}
