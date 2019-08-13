package br.ufs.model;


public class Frequencia {
    private int idFrequencia;
    private boolean presente;
    private String list_presencaFunc;

    public Frequencia(){
    }   

    public int getIdFrequencia() {
        return idFrequencia;
    }

    public void setIdFrequencia(int idFrequencia) {
        this.idFrequencia = idFrequencia;
    }
       
    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getList_presencaFunc() {
        return list_presencaFunc;
    }

    public void setList_presencaFunc(String list_presencaFunc) {
        this.list_presencaFunc = list_presencaFunc;
    }
       
}
