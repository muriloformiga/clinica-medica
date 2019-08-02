package br.ufs.model;


public class RelatorioAtendimento {
    private int idRelatorioAtendimento;
    private String descricao;

    public RelatorioAtendimento(){
    }    

    public int getIdRelatorioAtendimento() {
        return idRelatorioAtendimento;
    }

    public void setIdRelatorioAtendimento(int idRelatorioAtendimento) {
        this.idRelatorioAtendimento = idRelatorioAtendimento;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        
}
