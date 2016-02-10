/*
 * 
 * Classe do Movimento e do Encargo
 *
 */
package ClassModel;

public class Movimento_Class {

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
}
