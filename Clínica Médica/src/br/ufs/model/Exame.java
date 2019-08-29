
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
    private String hora;
    private boolean situacao;
    private String diagnostico;
    private String pacienteNome;
    private Tipo tipo;
    private String tipo_;
    private int id;
    private int atestado_id;
    private int consulta_id;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
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
        
        return tipo_;
    }
    
    public String getTipo_(){
        return tipo_;
    }
    
     public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String nome) {
        this.pacienteNome = nome;
    }
    
    public void setTipo(String tipo) {
        tipo_ = tipo;
        switch (tipo.toLowerCase()) {
            case "sangue":
                this.tipo = Tipo.SANGUE;
                break;
            case "ldl":
                this.tipo = Tipo.LDL;
                break;
            case "glicose":
                this.tipo = Tipo.GLICOSE;
                break;
            case "albumina":
                this.tipo = Tipo.ALBUMINA;
                break;
            case "urina":
                this.tipo = Tipo.URINA;
                break;
            case "fezes":
                this.tipo = Tipo.FEZES;
            case "t4livre":
                this.tipo = Tipo.T4LIVRE;
                break;

            default:
                tipo_ = tipo;
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
