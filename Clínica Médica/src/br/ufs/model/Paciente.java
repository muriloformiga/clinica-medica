
package br.ufs.model;

import java.util.Date;


public class Paciente {
    private static String nome;
    private static String cpf;
    private static int cod_pac;
    private static String fone;
    private static Date dt_nasc;

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static int getCod_pac() {
        return cod_pac;
    }

    public void setCod_pac(int cod_pac) {
        this.cod_pac = cod_pac;
    }

    public static String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public static Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }
    
    
}
