
package br.ufs.model;

import java.util.Date;


public class EscalaTrabalho {
    private String diasTrabalhar;
    private Date hora;
    private String cargaHoraria;

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
