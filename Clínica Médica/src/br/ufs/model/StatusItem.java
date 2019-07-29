
package br.ufs.model;

public class StatusItem {
    private boolean emUso;
    private boolean ocioso;
    private boolean recolhido;
    private boolean emManutencao;
    private boolean irrecuperavel;
    private boolean indisponivel;

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }

    public boolean isOcioso() {
        return ocioso;
    }

    public void setOcioso(boolean ocioso) {
        this.ocioso = ocioso;
    }

    public boolean isRecolhido() {
        return recolhido;
    }

    public void setRecolhido(boolean recolhido) {
        this.recolhido = recolhido;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public boolean isIrrecuperavel() {
        return irrecuperavel;
    }

    public void setIrrecuperavel(boolean irrecuperavel) {
        this.irrecuperavel = irrecuperavel;
    }

    public boolean isIndisponivel() {
        return indisponivel;
    }

    public void setIndisponivel(boolean indisponivel) {
        this.indisponivel = indisponivel;
    }

    
}
