
package br.ufs.model;

import br.ufs.dao.FuncionarioDAO;
import javax.swing.JOptionPane;

public class Funcionario {
    protected String nomeModelFuncionario;
    protected String cpfModelFuncionario;
    protected int matriculaModelFuncionario;
    protected String telefoneModelFuncionario;
    protected String dt_nascModelFuncionario;

    public String getNomeModelFuncionario() {
        return nomeModelFuncionario;
    }

    public void setNomeModelFuncionario(String nomeModelFuncionario) {
        this.nomeModelFuncionario = nomeModelFuncionario;
    }

    public String getCpfModelFuncionario() {
        return cpfModelFuncionario;
    }

    public void setCpfModelFuncionario(String cpfModelFuncionario) {
        this.cpfModelFuncionario = cpfModelFuncionario;
    }

    public int getMatriculaModelFuncionario() {
        return matriculaModelFuncionario;
    }

    public void setMatriculaModelFuncionario(int matriculaModelFuncionario) {
        this.matriculaModelFuncionario = matriculaModelFuncionario;
    }

    public String getTelefoneModelFuncionario() {
        return telefoneModelFuncionario;
    }

    public void setTelefoneModelFuncionario(String telefoneModelFuncionario) {
        this.telefoneModelFuncionario = telefoneModelFuncionario;
    }

    public String getDt_nascModelFuncionario() {
        return dt_nascModelFuncionario;
    }

    public void setDt_nascModelFuncionario(String dt_nascModelFuncionario) {
        this.dt_nascModelFuncionario = dt_nascModelFuncionario;
    }
    
   
    public void salvar(Funcionario funcionario){
        try{
            FuncionarioDAO funcDAO = new FuncionarioDAO();
            funcDAO.add(funcionario);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
}
