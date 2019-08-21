
package br.ufs.model;

import java.util.Date;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected String matricula;
    protected String telefone;
    protected Date dt_nasc;
    protected int id;
    protected int endereco_id;

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    
}
