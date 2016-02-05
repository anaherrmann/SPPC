/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassModel;

import java.util.Date;

/**
 *
 * @author Leticia
 */
public class IndiceCorrecao_Class {
    
    Date data_ref;
    String nome_indice;
    float percentual;

    public Date getData_ref() {
        return data_ref;
    }

    public void setData_ref(Date data_ref) {
        this.data_ref = data_ref;
    }

    public String getNome_indice() {
        return nome_indice;
    }

    public void setNome_indice(String nome_indice) {
        this.nome_indice = nome_indice;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }
}
