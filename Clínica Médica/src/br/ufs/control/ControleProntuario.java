package br.ufs.control;

import br.ufs.model.Paciente;
import br.ufs.model.Prontuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleProntuario implements ActionListener{
    public Paciente paciente;
    public Prontuario prontuario;
    private String identificadorFonte;
    
    //Construtor
    public ControleProntuario()
    {        
        paciente = new Paciente();
        prontuario = new Prontuario();
    }
    //get e set
   
    public String getIdentificadorFonte() {
        return identificadorFonte;
    }

    public void setIdentificadorFonte(String identificadorFonte) {
        this.identificadorFonte = identificadorFonte;
    }
    
    
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(getIdentificadorFonte());
        try {            
            if(getIdentificadorFonte().equals(("CadastrarProntuarioView"))) 
            { 
                cadastrarPro();
            }
            if(getIdentificadorFonte().equals(("BuscarPacienteVisualizarView"))) 
            {
                visualizarPro();
            }
            if(getIdentificadorFonte().equals(("BuscarPacienteCadastroView"))) 
            {
               // atualizarPac()
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }
    
    public void cadastrarPro()
    {        
//        Paciente modelPaciente = new Paciente();
//        Endereco modelEndereco = new Endereco();;
        System.out.println(prontuario.getPrescricaoRemedios());
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
