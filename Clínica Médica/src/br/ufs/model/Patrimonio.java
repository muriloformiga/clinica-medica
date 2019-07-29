
package br.ufs.model;

import java.util.Date;


public class Patrimonio {
    private Date dataUltimoLevantamento;
    private int quantItem;

    public Date getDataUltimoLevantamento() {
        return dataUltimoLevantamento;
    }

    public void setDataUltimoLevantamento(Date dataUltimoLevantamento) {
        this.dataUltimoLevantamento = dataUltimoLevantamento;
    }

    public int getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }
    
    
}
