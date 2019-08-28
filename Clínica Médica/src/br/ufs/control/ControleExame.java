/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.ConsultaDAO;
import br.ufs.dao.ExameDAO;
import br.ufs.model.Consulta;
import br.ufs.model.Exame;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class ControleExame {
    public Exame exame;
    public ExameDAO examedao;
    
    public ControleExame(){
        exame = new Exame();
        examedao = new ExameDAO();
    }
    
    public void cadastrarExame(){
        try{
            examedao.add(exame);
            JOptionPane.showMessageDialog(null, "Exame marcado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarItem()");
        }
        
        
    }
    public List<Exame> exameMarcados(){
         List<Exame> exames = new ArrayList();
        
        exames = this.examedao.getExamesMarcados(1,1);
        
        return exames;
       
       
    }
}


