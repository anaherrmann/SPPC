/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassModel;
//import java.util.Date;

/**
 *
 * @author Leticia
 */
public class Movimento_Class {
   
    int id;
    int processo;
    String data;
    double saldo;
    String dataRef;
    double valorEncargo;
    String tipoEncargo;
    
    public String getDataRef() {
        return dataRef;
    }
    
    public void setDataRef(String dataRef) {
        this.dataRef = dataRef;
    }

    public double getValorEncargo() {
        return valorEncargo;
    }
    
    public void setValorEncargo(double valorEncargo) {
        this.valorEncargo = valorEncargo;
    }

    public String getTipoEncargo() {
        return tipoEncargo;
    }
    
    public void setTipoEncargo(String tipoEncargo) {
        this.tipoEncargo = tipoEncargo;
    }

    public int getProcesso() {
        return processo;
    }

    public void setProcesso(int processo) {
        this.processo = processo;
    }
    
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   /* public char getTipo_movimento() {
        return tipo_movimento;
    }

    public void setTipo_movimento(char tipo_movimento) {
        this.tipo_movimento = tipo_movimento;
    }*/
 
}
