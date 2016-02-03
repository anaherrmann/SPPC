/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassModel;

/**
 *
 * @author Leticia
 */
public class TipoEncargoMovimento_Class {
    
    int id;
    int codigo;
    String nome_encargo;
    int codigo_cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_encargo() {
        return nome_encargo;
    }

    public void setNome_encargo(String nome_encargo) {
        this.nome_encargo = nome_encargo;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    } 
    
}
