package br.ufs.model;


public class Prontuario {
    private int idProntuario;
    private String prescricaoRemedios;
    private String observacoesMedicas;

    public Prontuario(){
    }    
    
    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }
    
    public String getPrescricaoRemedios() {
        return prescricaoRemedios;
    }

    public void setPrescricaoRemedios(String prescricaoRemedios) {
        this.prescricaoRemedios = prescricaoRemedios;
    }

    public String getObservacoesMedicas() {
        return observacoesMedicas;
    }

    public void setObservacoesMedicas(String observacoesMedicas) {
        this.observacoesMedicas = observacoesMedicas;
    }
        
}
