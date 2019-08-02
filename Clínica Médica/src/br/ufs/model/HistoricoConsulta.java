package br.ufs.model;


public class HistoricoConsulta {
    private int idHistoricoConsulta;
    private String protocolo;
    private String nomePaciente;

    public HistoricoConsulta(){
    }    

    public int getIdHistoricoConsulta() {
        return idHistoricoConsulta;
    }

    public void setIdHistoricoConsulta(int idHistoricoConsulta) {
        this.idHistoricoConsulta = idHistoricoConsulta;
    }        
    
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
        
}
