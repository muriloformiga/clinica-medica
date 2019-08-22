package br.ufs.control;

import br.ufs.dao.PacienteDAO;
import br.ufs.dao.ProntuarioDAO;
import br.ufs.model.Paciente;
import br.ufs.model.Prontuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleProntuario implements ActionListener{
    public Paciente paciente;
    public Prontuario prontuario;
    public PacienteDAO pacientedao;
    public ProntuarioDAO prontuariodao;
    
    //Construtor
    public ControleProntuario()
    {        
        paciente = new Paciente();
        prontuario = new Prontuario();
        prontuariodao = new ProntuarioDAO();
        pacientedao = new PacienteDAO();
    }
    //get e set
    
    public Prontuario buscarProntuario(Integer prontuario_id){
        
        this.prontuario = this.prontuariodao.get(prontuario_id);
        return prontuario;
    }
   
    
    
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       
    }
    
    public void cadastrarPro()
    {        
        try
            {
                paciente = pacientedao.get(paciente.getCpf());
                prontuariodao.up(paciente.getProntuarioId(),prontuario);
            }
        catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex+" controlecadastrarPac()");
            } 
    }

    public void visualizarPro(){        
        Paciente modelPaciente = new Paciente();        
        try {
            //modelPaciente.setCpfModelPaciente(getControleCpfPaciente());
//            System.out.println(modelPaciente.getCpfModelPaciente()); 
            JOptionPane.showMessageDialog(null, "voce chegou ate o visual paciente obr");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controleVisualizaPac()");
        }
        

    }

    public void apagarPac(){
    }

    public void atualizarPac(){

    }


}
