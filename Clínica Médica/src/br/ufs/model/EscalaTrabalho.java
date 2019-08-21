
package br.ufs.model;

import java.util.Date;


public class EscalaTrabalho {
    private String diasTrabalhar;
    private Date hora;
    private String cargaHoraria;
    private int id;
    private int funcionario_id;

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
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getFuncionarioId(){
        return funcionario_id;
    }
    
    public void setFuncionarioId(int funcionario_id){
        this.funcionario_id = funcionario_id;
    }
    
}
