
package br.ufs.model;


public class Gerente extends Funcionario {
    private int funcionario_id;
    private int id;
    
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
