/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.GerenteDAO;
import br.ufs.dao.ItemPatrimonioDAO;
import br.ufs.dao.PatrimonioDAO;
import br.ufs.model.Gerente;
import br.ufs.model.ItemPatrimonio;
import br.ufs.model.Patrimonio;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author linforlicriton
 */
public class ControleItemPatrimonio {
    public Gerente gerente;
    public Patrimonio patrimonio;
    public ItemPatrimonio itempatrimonio;
    private GerenteDAO gerentedao;
    private PatrimonioDAO patrimoniodao;
    private ItemPatrimonioDAO itempatrimoniodao;
    private String identificadorFonte;
    
    public ControleItemPatrimonio(){
        gerente = new Gerente();
        patrimonio = new Patrimonio();
        itempatrimonio = new ItemPatrimonio();
        gerentedao = new GerenteDAO();
        patrimoniodao = new PatrimonioDAO();
        itempatrimoniodao = new ItemPatrimonioDAO();
    }
    
    public void setGerente(String CPF){
        gerente = gerentedao.get(CPF);
    }
    
    public void setPatrimonio(){
        patrimonio = patrimoniodao.get(gerente.getId());
    }
    
    public String getIdentificadorFonte() {
        return identificadorFonte;
    }

    public void setIdentificadorFonte(String identificadorFonte) {
        this.identificadorFonte = identificadorFonte;
    }
    
    public void cadastrarItem()
    {        
        try{
            itempatrimoniodao.add(itempatrimonio);
            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarItem()");
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {            
            if(getIdentificadorFonte().equals(("CadastrarItemPatrimonioView"))) 
            { 
                cadastrarItem();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void setItemPatrimonio(int num){
        itempatrimonio = itempatrimoniodao.getItem(num);
    }
    
    public void setPatrimonio_(int id){
        patrimonio = patrimoniodao.get_(id);
    }

}
