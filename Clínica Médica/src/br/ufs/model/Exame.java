
package br.ufs.model;

import java.util.Date;


public class Exame {
    private static Date data;
    private static String hora;
    private boolean situacao;
    private static String diagnostico;

    public static Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static String getHora() {
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

    public static String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
    
}
