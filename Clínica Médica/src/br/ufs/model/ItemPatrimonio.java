
package br.ufs.model;

import java.util.Date;

public class ItemPatrimonio {
    private String descricao;
    private String localizacao;
    private Date anoAquisicao;
    private int numPatrimonio;
    private String tipo;
    private String status;
    private int id;
    private int patrimonio_id;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getAnoAquisicao() {
        return anoAquisicao;
    }

    public void setAnoAquisicao(Date anoAquisicao) {
        this.anoAquisicao = anoAquisicao;
    }

    public int getNumPatrimonio() {
        return numPatrimonio;
    }

    public void setNumPatrimonio(int numPatrimonio) {
        this.numPatrimonio = numPatrimonio;
    }
 
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getPatrimonioId(){
        return patrimonio_id;
    }
    
    public void setPatrimonioId(int patrimonio_id){
        this.patrimonio_id = patrimonio_id;
    }
}
