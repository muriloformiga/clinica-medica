
package br.ufs.model;

import java.util.Date;

public class ItemPatrimonio {
    enum Status{
        EM_USO,
        OCIOSO,
        RECOLHIDO,
        EM_MANUTENCAO,
        IRRECUPERAVEL,
        INDISPONIVEL
    }
    enum Tipo{
        TANGIVEL,
        INTANGIVEL,
        MOVEL,
        IMOVEL
    }
    private String descricao;
    private String localizacao;
    private Date anoAquisicao;
    private int numPatrimonio;
    private Tipo tipo;
    private Status status;
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
        return tipo.toString();
    }
    
    public void setTipo(String tipo) {
        switch (tipo) {
            case "Tangível":
                this.tipo = Tipo.TANGIVEL;
                break;
            case "Intangível":
                this.tipo = Tipo.INTANGIVEL;
                break;
            case "Móvel":
                this.tipo = Tipo.MOVEL;
                break;
            case "Imóvel":
                this.tipo = Tipo.IMOVEL;
                break;
            default:
                break;
        }
    }
    
    public String getStatus() {
        return status.toString();
    }
    
    public void setStatus(String status) {
        switch (status) {
            case "Em uso":
                this.status = Status.EM_USO;
                break;
            case "Ocioso":
                this.status = Status.OCIOSO;
                break;
            case "Recolhido":
                this.status = Status.RECOLHIDO;
                break;
            case "Em Manutenção":
                this.status = Status.EM_MANUTENCAO;
                break;
            case "Irrecuperável":
                this.status = Status.IRRECUPERAVEL;
                break;
            case "Indisponível":
                this.status = Status.INDISPONIVEL;
                break;
            default:
                break;
        }
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
