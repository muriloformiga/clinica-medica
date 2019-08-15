package br.ufs.control;

import br.ufs.model.Agenda;
import br.ufs.model.Consulta;
import br.ufs.model.Paciente;
import br.ufs.model.Medico;
import br.ufs.model.Especialidade;
import javax.swing.JOptionPane;


public class ControleConsulta {
    private String controleDataAgenda;
    private String controleHoraAgenda;
    private String controleDataConsulta;
    private String controleHoraConsulta;
    private boolean controleSituacaoConsulta;
    private String controleDescricaoConsulta;
    private String controleDiagnosticoConsulta;
    private String controleNomePaciente;
    private String controleCpfPaciente;
    private String controleDataNascimentoPaciente;
    private int controleCrmMedico;
    private String controleNomeEspecialidade;

    public ControleConsulta() {
    }

    public String getControleDataAgenda() {
        return controleDataAgenda;
    }

    public void setControleDataAgenda(String controleDataAgenda) {
        this.controleDataAgenda = controleDataAgenda;
    }

    public String getControleHoraAgenda() {
        return controleHoraAgenda;
    }

    public void setControleHoraAgenda(String controleHoraAgenda) {
        this.controleHoraAgenda = controleHoraAgenda;
    }

    public String getControleDataConsulta() {
        return controleDataConsulta;
    }

    public void setControleDataConsulta(String controleDataConsulta) {
        this.controleDataConsulta = controleDataConsulta;
    }

    public String getControleHoraConsulta() {
        return controleHoraConsulta;
    }

    public void setControleHoraConsulta(String controleHoraConsulta) {
        this.controleHoraConsulta = controleHoraConsulta;
    }

    public boolean isControleSituacaoConsulta() {
        return controleSituacaoConsulta;
    }

    public void setControleSituacaoConsulta(boolean controleSituacaoConsulta) {
        this.controleSituacaoConsulta = controleSituacaoConsulta;
    }

    public String getControleDescricaoConsulta() {
        return controleDescricaoConsulta;
    }

    public void setControleDescricaoConsulta(String controleDescricaoConsulta) {
        this.controleDescricaoConsulta = controleDescricaoConsulta;
    }

    public String getControleDiagnosticoConsulta() {
        return controleDiagnosticoConsulta;
    }

    public void setControleDiagnosticoConsulta(String controleDiagnosticoConsulta) {
        this.controleDiagnosticoConsulta = controleDiagnosticoConsulta;
    }

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

    public String getControleDataNascimentoPaciente() {
        return controleDataNascimentoPaciente;
    }

    public void setControleDataNascimentoPaciente(String controleDataNascimentoPaciente) {
        this.controleDataNascimentoPaciente = controleDataNascimentoPaciente;
    }

    public int getControleCrmMedico() {
        return controleCrmMedico;
    }

    public void setControleCrmMedico(int controleCrmMedico) {
        this.controleCrmMedico = controleCrmMedico;
    }
    
    public String getControleNomeEspecialidade() {
        return controleNomeEspecialidade;
    }

    public void setControleNomeEspecialidade(String controleNomeEspecialidade) {
        this.controleNomeEspecialidade = controleNomeEspecialidade;
    }
    
    public void cadastrarCon(){
        Paciente modelPaciente = new Paciente();
        Agenda modelAgenda = new Agenda();
        Consulta modelConsulta = new Consulta();
        Medico modelMedico = new Medico();
        Especialidade modelEspecialidade = new Especialidade();
        
        try{
            modelPaciente.setCpfModelPaciente(getControleCpfPaciente());
            modelPaciente.setNomeModelPaciente(getControleNomePaciente());
            modelPaciente.salvar(modelPaciente);
            
            modelEspecialidade.setNomeModelEspecialidade(getControleNomeEspecialidade());
            modelEspecialidade.salvar(modelEspecialidade);
            
            modelAgenda.setDataModelAgenda(getControleDataAgenda());
            modelAgenda.setHoraModelAgenda(getControleHoraAgenda());
            modelAgenda.salvar(modelAgenda);
            
            modelMedico.setCrmModelMedico(getControleCrmMedico());
            modelMedico.salvar(modelMedico);
            
            modelConsulta.setDataModelConsulta(getControleDataConsulta());
            modelConsulta.setHoraModelConsulta(getControleHoraConsulta());
            modelConsulta.setDiagnosticoModelConsulta(getControleDiagnosticoConsulta());
            modelConsulta.setDescricaoModelConsulta(getControleDescricaoConsulta());
            modelConsulta.setSituacaoModelConsulta(isControleSituacaoConsulta());
            modelConsulta.salvar(modelConsulta);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"Erro no controle de consulta");
        }
    }
    
    public void visualizarCon(){
        
    }
    
    public void apagarCon(){
        
    }
    
    public void atualizarCon(){
        
    }
    
    public void verifSituacaoCon(){
        
    }
    
    
    
    
    
}
