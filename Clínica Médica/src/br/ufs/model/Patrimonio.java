package br.ufs.model;

import java.util.Date;


public class Patrimonio {
    private int idPatrimonio;
    private Date dataUltimoLevantamento;
    private int quantItem;

    public Patrimonio(){
    }    

    public int getIdPatrimonio() {
        return idPatrimonio;
    }

    public void setIdPatrimonio(int idPatrimonio) {
        this.idPatrimonio = idPatrimonio;
    }    
    
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
