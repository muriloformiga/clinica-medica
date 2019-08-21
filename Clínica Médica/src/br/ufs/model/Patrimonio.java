
package br.ufs.model;

import java.util.Date;


public class Patrimonio {
    private Date dataUltimoLevantamento;
    private int quantItem;
    private int id;
    private int gerente_id;

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
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getGerenteId(){
        return gerente_id;
    }
    
    public void setGerenteId(int gerente_id){
        this.gerente_id = gerente_id;
    }
    
}
