package br.ufs.model;

import java.util.Date;


public class EscalaTrabalho {
    private int idEscalaTrabalho;
    private String diasTrabalhar;
    private Date hora;
    private String cargaHoraria;

    public EscalaTrabalho(){
    }    

    public int getIdEscalaTrabalho() {
        return idEscalaTrabalho;
    }

    public void setIdEscalaTrabalho(int idEscalaTrabalho) {
        this.idEscalaTrabalho = idEscalaTrabalho;
    }
        
    public String getDiasTrabalhar() {
        return diasTrabalhar;
    }

    public void setDiasTrabalhar(String diasTrabalhar) {
        this.diasTrabalhar = diasTrabalhar;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
        
}
