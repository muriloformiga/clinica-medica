/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.EscalaTrabalhoDAO;
import br.ufs.dao.FuncionarioDAO;
import br.ufs.model.EscalaTrabalho;
import br.ufs.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author linforlicriton
 */
public class ControleEscalaTrabalho {
    
    public EscalaTrabalho escalatrabalho;
    public EscalaTrabalhoDAO escalatrabalhodao;
    public Funcionario funcionario;
    public FuncionarioDAO funcionariodao;
    public List<EscalaTrabalho> escala_list;
    
    public ControleEscalaTrabalho(){
        escalatrabalho = new EscalaTrabalho();
        escalatrabalhodao = new EscalaTrabalhoDAO();
        funcionario = new Funcionario();
        funcionariodao = new FuncionarioDAO();
        escala_list = new ArrayList();
    }
    
    public void setFuncionario(String matricula){
        funcionario = funcionariodao.get(matricula);
    }
    
    public void cadastrarEscalaTrabalho(){
        escalatrabalhodao.add(escalatrabalho);
    }
    
    public void setEscalaTrabalho(String matricula){
        escala_list = escalatrabalhodao.get(matricula);
    }
}
