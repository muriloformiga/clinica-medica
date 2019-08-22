/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.EnderecoDAO;
import br.ufs.dao.FuncionarioDAO;
import br.ufs.model.Endereco;
import br.ufs.model.Funcionario;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author linforlicriton
 */
public class ControleFuncionario {
    public Funcionario funcionario;
    public Endereco endereco;
    private FuncionarioDAO funcionariodao;
    private EnderecoDAO enderecodao;
    private String identificadorFonte;
    
    public ControleFuncionario(){
        funcionario = new Funcionario();
        endereco = new Endereco();
        funcionariodao = new FuncionarioDAO();
        enderecodao = new EnderecoDAO();
    }
    
    public String getIdentificadorFonte() {
        return identificadorFonte;
    }

    public void setIdentificadorFonte(String identificadorFonte) {
        this.identificadorFonte = identificadorFonte;
    }
    
    public void cadastrarFun()
    {        
        try{
            int id = 0;
            enderecodao.add(endereco);
            id = enderecodao.getLastID();
            funcionario.setEnderecoId(id);
            funcionariodao.add(funcionario);
            enderecodao.closeConnection();
            funcionariodao.closeConnection();
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarPac()");
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {            
            if(getIdentificadorFonte().equals(("CadastrarFuncionarioView"))) 
            { 
                cadastrarFun();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
