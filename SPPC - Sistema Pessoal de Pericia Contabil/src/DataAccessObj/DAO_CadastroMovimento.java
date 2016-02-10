/*
 * 
 * DAO do Cadastro do Movimento e do Encargo
 * 
 */
package DataAccessObj;

import ClassModel.Movimento_Class;
import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO_CadastroMovimento {
    private Connection conn = null;
    private Statement stm = null;   

    //Conexão com o banco de dados;
    public DAO_CadastroMovimento() 
    {
        try {
            this.conn = new ConnectionFactory().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Envia dados para o banco de dados;
    public void add(Movimento_Class p, boolean encargo) throws SQLException {
        
        //Se for clicado em encargo, então todos os dados do cadastro são enviados;
        if (encargo){
            try 
            {
                stm = conn.createStatement();
                String sql = String.format("INSERT INTO movimento(datal, saldo, processo, data_ref, tipo_encargo, valor_encargo) values ('%s', '%s', '%d', '%s', '%s', '%s')",
                        p.getData(), String.format("%.2f", p.getSaldo()).replace(",", "."), p.getProcesso(), p.getDataRef(), p.getTipoEncargo(),
                        String.format("%.2f", p.getValorEncargo()).replace(",", "."));
                stm.executeUpdate(sql);
                stm.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn.close();
        }
        
        //Se não, apenas o cadastro do movimento, sem encargo, é enviado;
        else{
            try 
            {
                stm = conn.createStatement();
                String sql = String.format("INSERT INTO movimento(datal, saldo, processo) values ('%s', '%s', '%d')",
                        p.getData(), String.format("%.2f", p.getSaldo()).replace(",", "."), p.getProcesso());
                stm.executeUpdate(sql);
                stm.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(DAO_CadastroMovimento.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn.close();
        }
        
    }
}
