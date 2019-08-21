
package br.ufs.model;


public class Especialidade {
    private String nome;
    private int id;
    private int medico_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
}
