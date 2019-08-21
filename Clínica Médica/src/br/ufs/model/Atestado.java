
package br.ufs.model;

import java.util.Date;


public class Atestado {
    private Date dt_Inicio;
    private int qt_Dias;
    private String cid;
    private int id;

    public Date getDt_Inicio() {
        return dt_Inicio;
    }

    public void setDt_Inicio(Date dt_Inicio) {
        this.dt_Inicio = dt_Inicio;
    }

    public int getQt_Dias() {
        return qt_Dias;
    }

    public void setQt_Dias(int qt_Dias) {
        this.qt_Dias = qt_Dias;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
}
