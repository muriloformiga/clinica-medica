
package br.ufs.model;

import java.util.Date;

public class Agenda {
    private static Date data;
    private static Date hora;
    
    public Agenda(){
    }

    public static Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    
    

    
}
