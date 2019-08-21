
package br.ufs.model;


public class Medico extends Funcionario{
    private String crm;
    private int id;
    private int funcionario_id;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    @Override
    public int getId(){
        return id;
    }
    
    @Override
    public void setId(int id){
        this.id = id;
    }
    
    public int getFuncionarioId(){
        return funcionario_id;
    }
    
    public void setFuncionarioId(int funcionario_id){
        this.funcionario_id = funcionario_id;
    }
    
}
