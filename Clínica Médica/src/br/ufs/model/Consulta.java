
package br.ufs.model;

import java.util.Date;


public class Consulta {
    private Date data;
    private String hora;
    private boolean situacao;
    private String descricao;
    private String diagnostico;
    private int id;
    private int medico_id;
    private int paciente_id;
    private int atestado_id;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getMedicoId(){
        return medico_id;
    }
    
    public void setMedicoId(int medico_id){
        this.medico_id = medico_id;
    }
    
    public int getPacienteId(){
        return paciente_id;
    }
    
    public void setPacienteId(int paciente_id){
        this.paciente_id = paciente_id;
    }
    
    public int getAtestadoId(){
        return atestado_id;
    }
    
    public void setAtestadoId(int atestado_id){
        this.atestado_id = atestado_id;
    }
    
    
}
