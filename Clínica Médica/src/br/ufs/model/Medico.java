package br.ufs.model;


public class Medico extends Funcionario {
    private int idMedico;
    private int crm;

    public Medico(){
    }    

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }    
    
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
   
}
