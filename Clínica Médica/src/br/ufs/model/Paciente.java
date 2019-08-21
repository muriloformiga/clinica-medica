
package br.ufs.model;

import java.util.Date;


public class Paciente {
    private String nome;
    private String cpf;
    private String fone;
    private Date dt_nasc;
    private int id;
    private int endereco_id;
    private int prontuario_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getEnderecoId(){
        return endereco_id;
    }
    
    public void setEnderecoId(int endereco_id){
        this.endereco_id = endereco_id;
    }
    
    public int getProntuarioId(){
        return prontuario_id;
    }
    
    public void setProntuarioId(int prontuario_id){
        this.prontuario_id = prontuario_id;
    }
    
}
