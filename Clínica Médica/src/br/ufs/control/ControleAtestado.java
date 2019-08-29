/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.AtestadoDAO;
import br.ufs.dao.ConsultaDAO;
import br.ufs.dao.ExameDAO;
import br.ufs.model.Atestado;
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
public class ControleAtestado {
    public Atestado atestado;
    public AtestadoDAO atestadodao;
    public ConsultaDAO consultadao;
    public Consulta consulta;
    public Exame exame;
    public ExameDAO examedao;

    
    public ControleAtestado(){
        atestado = new Atestado();
        atestadodao = new AtestadoDAO();
        consultadao = new ConsultaDAO();
        consulta = new Consulta();
        exame = new Exame();
        examedao = new ExameDAO();

    }
    
    public void cadastrarAtestado(){
        try{
            
            //System.out.println(rs.getInt("ID"));
            consulta.setAtestadoId(atestadodao.add(atestado));
            consultadao.inserirAtestado(consulta);
            JOptionPane.showMessageDialog(null, "Atestado criado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarItem()");
        }
        
        
    }
    

    public void cadastrarAtestadoExame(){
        try{
            
            //System.out.println(rs.getInt("ID"));
            exame.setAtestadoId(atestadodao.add(atestado));
            examedao.inserirAtestado(exame);
            JOptionPane.showMessageDialog(null, "Atestado criado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarItem()");
        }
     }
        
        
    public void setAtestado(int id){
        consulta = consultadao.getById(id);
        atestado = atestadodao.get(consulta.getAtestadoId());
    }
    
}


