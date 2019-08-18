package br.ufs.control;

import br.ufs.model.Endereco;
import br.ufs.model.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlePaciente implements ActionListener{
    private String controleNomePaciente;
    private String controleCpfPaciente;
    private String controleTelefonePaciente;
    private String controleDataNascimentoPaciente;
    private String controleLogradouroPaciente;
    private int controleNumPaciente;
    private String controleBairroPaciente;
    private String controleCidadePaciente;
    private String controleEstadoPaciente;
    private String controleCepPaciente;
    private String controleEndereco_Id;
    private String identificadorFonte;
    
    //Construtor
    public ControlePaciente()
    {        
    }
    //get e set
    public String getControleNomePaciente() {
        return controleNomePaciente;
    }

    public void setControleNomePaciente(String controleNomePaciente) {
        this.controleNomePaciente = controleNomePaciente;
    }

    public String getControleCpfPaciente() {
        return controleCpfPaciente;
    }

    public void setControleCpfPaciente(String controleCpfPaciente) {
        this.controleCpfPaciente = controleCpfPaciente;
    }

    public String getControleTelefonePaciente() {
        return controleTelefonePaciente;
    }

    public void setControleTelefonePaciente(String controleTelefonePaciente) {
        this.controleTelefonePaciente = controleTelefonePaciente;
    }

    public String getControleDataNascimentoPaciente() {
        return controleDataNascimentoPaciente;
    }

    public void setControleDataNascimentoPaciente(String controleDataNascimentoPaciente) {
        this.controleDataNascimentoPaciente = controleDataNascimentoPaciente;
    }

    public String getControleLogradouroPaciente() {
        return controleLogradouroPaciente;
    }

    public void setControleLogradouroPaciente(String controleLogradouroPaciente) {
        this.controleLogradouroPaciente = controleLogradouroPaciente;
    }

    public int getControleNumPaciente() {
        return controleNumPaciente;
    }

    public void setControleNumPaciente(int ControleNumPaciente) {
        this.controleNumPaciente = ControleNumPaciente;
    }

    public String getControleBairroPaciente() {
        return controleBairroPaciente;
    }

    public void setControleBairroPaciente(String controleBairroPaciente) {
        this.controleBairroPaciente = controleBairroPaciente;
    }

    public String getControleCidadePaciente() {
        return controleCidadePaciente;
    }

    public void setControleCidadePaciente(String controleCidadePaciente) {
        this.controleCidadePaciente = controleCidadePaciente;
    }

    public String getControleEstadoPaciente() {
        return controleEstadoPaciente;
    }

    public void setControleEstadoPaciente(String controleEstadoPaciente) {
        this.controleEstadoPaciente = controleEstadoPaciente;
    }

    public String getControleCepPaciente() {
        return controleCepPaciente;
    }

    public void setControleCepPaciente(String controleCepPaciente) {
        this.controleCepPaciente = controleCepPaciente;
    }
    
    public String getControleEndereco_Id() {
        return controleEndereco_Id;
    }

    public void setControleEndereco_Id(String ControleEndereco_Id) {
        this.controleEndereco_Id = ControleEndereco_Id;
    }

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
        Paciente modelPaciente = new Paciente();
        Endereco modelEndereco = new Endereco();
        try
            {
                modelEndereco.setLogradouroModelEndereco(getControleLogradouroPaciente());
                modelEndereco.setNumeroModelEndereco(getControleNumPaciente());
                modelEndereco.setBairroModelEndereco(getControleBairroPaciente());
                modelEndereco.setCidadeModelEndereco(getControleCidadePaciente());
                modelEndereco.setEstadoModelEndereco(getControleEstadoPaciente());
                modelEndereco.setCepModelEndereco(getControleCepPaciente());
                modelEndereco.salvar(modelEndereco);
                
                modelPaciente.setNomeModelPaciente(getControleNomePaciente());
                modelPaciente.setCpfModelPaciente(getControleCpfPaciente());
                modelPaciente.setTelefoneModelPaciente(getControleTelefonePaciente());
                modelPaciente.setDataNascimentoModelPaciente(getControleDataNascimentoPaciente());
                modelPaciente.setIdEnderecoModelPaciente(4);//esta incompleto
                modelPaciente.salvar(modelPaciente);
            }
        catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex+" controlecadastrarPac()");
            } 
    }

    public void visualizarPac(){        
        Paciente modelPaciente = new Paciente();
        
        
        try {

               modelPaciente.setCpfModelPaciente(getControleCpfPaciente());
               System.out.println(modelPaciente.getCpfModelPaciente()); 
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
