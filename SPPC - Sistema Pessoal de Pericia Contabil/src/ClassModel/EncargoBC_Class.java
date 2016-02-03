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
public class EncargoBC_Class {
    
    int id;
    String nome_encargo;
    String mes;
    double taxa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_encargo() {
        return nome_encargo;
    }

    public void setNome_encargo(String nome_encargo) {
        this.nome_encargo = nome_encargo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
}
