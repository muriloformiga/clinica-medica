<<<<<<< HEAD

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
=======
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
>>>>>>> e6fe9801df0255486e5aed7edef02153cc5d9da8
