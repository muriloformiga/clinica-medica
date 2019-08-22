package br.ufs.control;

import br.ufs.dao.EnderecoDAO;
import br.ufs.model.Endereco;
import br.ufs.model.Paciente;
import br.ufs.dao.PacienteDAO;
import br.ufs.dao.ProntuarioDAO;
import br.ufs.model.Prontuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlePaciente implements ActionListener{
    public Paciente paciente;
    public Endereco endereco;
    public Prontuario prontuario;
    private final PacienteDAO pacientedao;
    private final ProntuarioDAO prontuariodao;
    private EnderecoDAO enderecodao;
    private String identificadorFonte;
    
    //Construtor
    public ControlePaciente()
    {        
        paciente = new Paciente();
        endereco = new Endereco();
        prontuario = new Prontuario();
        pacientedao = new PacienteDAO();
        prontuariodao = new ProntuarioDAO();
        enderecodao = new EnderecoDAO();
    }
   
    public String getIdentificadorFonte() {
        return identificadorFonte;
    }

    public void setIdentificadorFonte(String identificadorFonte) {
        this.identificadorFonte = identificadorFonte;
    }
    
    public Paciente buscarPaciente(String cpf){
        
        this.paciente = this.pacientedao.get(cpf);
        return this.paciente;
    }
    
    
   

    
    
    public void cadastrarPac()
    {        
        try{
            int id = 0;
            enderecodao.add(endereco);
            id = enderecodao.getLastID();
            paciente.setEnderecoId(id);
            prontuariodao.add(prontuario);
            id = prontuariodao.getLastID();
            paciente.setProntuarioId(id);
            pacientedao.add(paciente);
            enderecodao.closeConnection();
            prontuariodao.closeConnection();
            pacientedao.closeConnection();
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" controleVisualizaPac()");
        }
    }

    public void visualizarPac(){        
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {            
            if(getIdentificadorFonte().equals(("CadastrarPacienteView"))) 
            { 
                cadastrarPac();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


}
