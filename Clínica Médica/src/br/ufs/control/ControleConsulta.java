/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.ConsultaDAO;
import br.ufs.model.Consulta;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devil
 */
public class ControleConsulta {
    public Consulta consulta;
    public ConsultaDAO consultadao;
    
    public ControleConsulta(){
        consulta = new Consulta();
        consultadao = new ConsultaDAO();
    }
    
    public List<Consulta> consultasMarcadas(){
         List<Consulta> consultas = new ArrayList();
        
        consultas = this.consultadao.getConsultasMarcadas(1,1);
        
        return consultas;
       
       
    }
}


