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
public class EncargoMovimento_Class {
    
    int id;
    String data;
    String data_referencia;
    String codigo_encargo;
    double valor_debitado;
    int codigo_cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData_referencia() {
        return data_referencia;
    }

    public void setData_referencia(String data_referencia) {
        this.data_referencia = data_referencia;
    }

    public String getCodigo_encargo() {
        return codigo_encargo;
    }

    public void setCodigo_encargo(String codigo_encargo) {
        this.codigo_encargo = codigo_encargo;
    }

    public double getValor_debitado() {
        return valor_debitado;
    }

    public void setValor_debitado(double valor_debitado) {
        this.valor_debitado = valor_debitado;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
        
    
}
