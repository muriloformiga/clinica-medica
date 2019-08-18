
package br.ufs.model;

import java.util.Date;

public class ItemPatrimonio {
    private String descricao;
    private String localizacao;
    private Date anoAquisicao;
    private int numPatrimonio;
    private String tipo;
    private String status;

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
}
