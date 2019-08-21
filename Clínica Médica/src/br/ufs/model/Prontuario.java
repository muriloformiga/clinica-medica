
package br.ufs.model;


public class Prontuario {
    private String prescricaoRemedios;
    private String observacoesMedicas;
    private int id;

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
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
}
