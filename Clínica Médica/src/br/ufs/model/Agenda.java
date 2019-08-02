package br.ufs.model;

import java.util.Date;


public class Agenda {
    private int idAgenda;
    private Date data;
    private Date hora;
    
    public Agenda(){
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
  
}
