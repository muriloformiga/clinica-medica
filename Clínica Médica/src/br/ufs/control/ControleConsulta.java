/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.control;

import br.ufs.dao.ConsultaDAO;
import br.ufs.dao.EscalaTrabalhoDAO;
import br.ufs.dao.EspecialidadeDAO;
import br.ufs.dao.MedicoDAO;
import br.ufs.dao.PacienteDAO;
import br.ufs.model.Consulta;
import br.ufs.model.EscalaTrabalho;
import br.ufs.model.Medico;
import br.ufs.model.Paciente;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Devil
 */
public class ControleConsulta {
    public Consulta consulta;
    public ConsultaDAO consultadao;
    public List<Medico> medico_list;
    public List<EscalaTrabalho> medico_escala;
    public Medico medico;
    public EscalaTrabalho escala;
    public Paciente paciente;
    private MedicoDAO medicodao;
    private PacienteDAO pacientedao;
    private EscalaTrabalhoDAO escalatrabalhodao;
    private EspecialidadeDAO especialidadedao;
    
    public ControleConsulta(){
        consulta = new Consulta();
        consultadao = new ConsultaDAO();
        medico_list = new ArrayList<>();
        medico_escala = new ArrayList<>();
        medico = new Medico();
        escala = new EscalaTrabalho();
        paciente = new Paciente();
        pacientedao = new PacienteDAO();
        medicodao = new MedicoDAO();
        escalatrabalhodao = new EscalaTrabalhoDAO();
        especialidadedao = new EspecialidadeDAO();
    }
    
    public List<Consulta> consultasMarcadas(){
         List<Consulta> consultas = new ArrayList();
        consultas = this.consultadao.getConsultasMarcadas(paciente.getId());
        
        return consultas;
       
    }
    
    public void setConsultaPorEspecialidae(String especialidade){
        List<Integer> temp = new ArrayList<>();
        temp = especialidadedao.get(especialidade);
        for(Integer x : temp){
            System.out.println(x);
            Medico med = new Medico();
            med = medicodao.getMed(x);
            medico_list.add(med);
        }
    }
    
    public void setEscala(String matricula){
        medico_escala = escalatrabalhodao.get(matricula);
    }
    
    public void setPaciente(String cpf){
        paciente = pacientedao.get(cpf);
    }
    
    public void cadastrarConsulta(){
        try{
            consultadao.add(consulta);
            JOptionPane.showMessageDialog(null, "Consulta cadastrado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controlecadastrarconsulta()");
        }
    }
}


