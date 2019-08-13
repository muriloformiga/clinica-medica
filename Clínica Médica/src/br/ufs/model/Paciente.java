package br.ufs.model;

import java.util.Date;


public class Paciente {
    private int idPaciente;
    private String nome;
    private String cpf;
    private int cod_pac;
    private String fone;
    private Date dt_nasc;

    public Paciente(){
    }    

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }    
    
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

    public int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
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
     
}
