
package br.ufs.model;

import java.util.Date;


public class Prontuario {
    private String nome;
    private String cpf;
    private String telefone;
    private int cod_pac;
    private Date dt_nasc;
    private String listExamesFeitos;
    private String prescricaoRemedios;
    private String observacoesMedicas;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getListExamesFeitos() {
        return listExamesFeitos;
    }

    public void setListExamesFeitos(String listExamesFeitos) {
        this.listExamesFeitos = listExamesFeitos;
    }

    public String getPrescricaoRemedios() {
        return prescricaoRemedios;
    }

    public void setPrescricaoRemedios(String prescricaoRemedios) {
        this.prescricaoRemedios = prescricaoRemedios;
    }

    public String getObservacoesMedicas() {
        return observacoesMedicas;
    }

    public void setObservacoesMedicas(String observacoesMedicas) {
        this.observacoesMedicas = observacoesMedicas;
    }
    
    
}
