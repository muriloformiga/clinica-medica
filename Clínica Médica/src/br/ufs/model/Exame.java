
package br.ufs.model;

import java.util.Date;


public class Exame {
      enum Tipo{
        SANGUE,
        LDL,
        VLDL,
        HDL,
        GLICOSE,
        ALBUMINA,
        URINA,
        FEZES,
        T4LIVRE,
        TSH
    }
      
    private Date data;
    private Date hora;
    private boolean situacao;
    private String diagnostico;
    private Tipo tipo;
    private int id;
    private int atestado_id;
    private int consulta_id;

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

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public String getTipo() {
        return tipo.toString();
    }
    
    public void setTipo(String tipo) {
        switch (tipo) {
            case "Sangue":
                this.tipo = Tipo.SANGUE;
                break;
            case "LDL":
                this.tipo = Tipo.LDL;
                break;
            case "Glicose":
                this.tipo = Tipo.GLICOSE;
                break;
            case "Albumina":
                this.tipo = Tipo.ALBUMINA;
                break;
            case "Urina":
                this.tipo = Tipo.URINA;
                break;
            case "Fezes":
                this.tipo = Tipo.FEZES;
            case "T4Livre":
                this.tipo = Tipo.T4LIVRE;
                break;

            default:
                break;
        }
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getAtestadoId(){
        return atestado_id;
    }
    
    public void setAtestadoId(int atestado_id){
        this.atestado_id = atestado_id;
    }
    
    public int getConsultaId(){
        return consulta_id;
    }
    
    public void setConsultaId(int consulta_id){
        this.consulta_id = consulta_id;
    }
    
}
