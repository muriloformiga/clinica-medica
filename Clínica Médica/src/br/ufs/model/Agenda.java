
package br.ufs.model;

import java.util.Date;

public class Agenda {
    private Date data;
    private Date hora;
    
    public Agenda(){
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
