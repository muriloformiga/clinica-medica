package br.ufs.control;

import br.ufs.model.Endereco;
import br.ufs.model.Paciente;
import br.ufs.dao.PacienteDAO;
import br.ufs.model.Prontuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlePaciente implements ActionListener{
    public Paciente paciente;
    public Endereco endereco;
    public Prontuario prontuario;
    private String identificadorFonte;
    
    public PacienteDAO pacientedao;
    //Construtor
    public ControlePaciente()
    {        
        paciente = new Paciente();
        endereco = new Endereco();
        prontuario = new Prontuario();
        pacientedao = new PacienteDAO();
    }
    //get e set
   
    public String getIdentificadorFonte() {
        return identificadorFonte;
    }

    public void setIdentificadorFonte(String identificadorFonte) {
        this.identificadorFonte = identificadorFonte;
    }
    
    public Paciente buscarPaciente(String cpf){
        
        this.paciente = this.pacientedao.get(cpf);
        return paciente;
    }
    
    
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(getIdentificadorFonte());
        try {            
            if(getIdentificadorFonte().equals(("CadastrarPacienteView"))) 
            { 
                cadastrarPac();
            }
            if(getIdentificadorFonte().equals(("BuscarPacienteVisualizarView"))) 
            {
                visualizarPac();
            }
            if(getIdentificadorFonte().equals(("BuscarPacienteCadastroView"))) 
            {
               // atualizarPac()
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }
    
    public void cadastrarPac()
    {        
//        Paciente modelPaciente = new Paciente();
//        Endereco modelEndereco = new Endereco();;
        System.out.println(paciente.getDt_nasc());
        try
            {
//                modelEndereco.setLogradouroModelEndereco(getControleLogradouroPaciente());
//                modelEndereco.setNumeroModelEndereco(getControleNumPaciente());
//                modelEndereco.setBairroModelEndereco(getControleBairroPaciente());
//                modelEndereco.setCidadeModelEndereco(getControleCidadePaciente());
//                modelEndereco.setEstadoModelEndereco(getControleEstadoPaciente());
//                modelEndereco.setCepModelEndereco(getControleCepPaciente());
//                modelEndereco.salvar(modelEndereco);
//                
//                modelPaciente.setNomeModelPaciente(getControleNomePaciente());
//                modelPaciente.setCpfModelPaciente(getControleCpfPaciente());
//                modelPaciente.setTelefoneModelPaciente(getControleTelefonePaciente());
//                modelPaciente.setDataNascimentoModelPaciente(getControleDataNascimentoPaciente());
//                modelPaciente.setIdFkModelPaciente(modelPaciente.saidaId());
//                modelPaciente.salvar(modelPaciente);
            }
        catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex+" controlecadastrarPac()");
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


}
