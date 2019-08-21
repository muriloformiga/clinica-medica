
package br.ufs.model;

import java.util.Date;

public class Agenda {
    private Date data;
    private Date hora;
    private int id;
    private int medico_id;

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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getMedicoId() {
        return medico_id;
    }

    public void setMedicoId(int medico_id) {
        this.medico_id = medico_id;
    }
    
    
}
