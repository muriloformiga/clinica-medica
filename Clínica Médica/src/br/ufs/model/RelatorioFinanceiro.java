package br.ufs.model;


public class RelatorioFinanceiro {
    private int idRelatorioFinanceiro;
    private String descricao;

    public RelatorioFinanceiro(){
    }    

    public int getIdRelatorioFinanceiro() {
        return idRelatorioFinanceiro;
    }

    public void setIdRelatorioFinanceiro(int idRelatorioFinanceiro) {
        this.idRelatorioFinanceiro = idRelatorioFinanceiro;
    }    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
