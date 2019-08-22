
package br.ufs.model;

import br.ufs.dao.EnderecoDAO;
import br.ufs.dao.PacienteDAO;
import javax.swing.JOptionPane;


public class Paciente {
    private String nomeModelPaciente;
    private String cpfModelPaciente;
    private String telefoneModelPaciente;
    private String dataNascimentoModelPaciente;
    private int idFkModelPaciente;
    private String cpfBanco;

    public Paciente() {
    }
    
    public String getNomeModelPaciente() {
        return nomeModelPaciente;
    }

    public void setNomeModelPaciente(String nomeModelPaciente) {
        this.nomeModelPaciente = nomeModelPaciente;
    }

    public String getCpfModelPaciente() {
        return cpfModelPaciente;
    }

    public void setCpfModelPaciente(String cpfModelPaciente) {
        this.cpfModelPaciente = cpfModelPaciente;
    }

    public int getIdFkModelPaciente() {
        return idFkModelPaciente;
    }

    public void setIdFkModelPaciente(int idFkModelPaciente) {
        this.idFkModelPaciente = idFkModelPaciente;
    }
    public String getTelefoneModelPaciente() {
        return telefoneModelPaciente;
    }

    public void setTelefoneModelPaciente(String telefoneModelPaciente) {
        this.telefoneModelPaciente = telefoneModelPaciente;
    }

    public String getDataNascimentoModelPaciente() {
        return dataNascimentoModelPaciente;
    }

    public void setDataNascimentoModelPaciente(String dataNascimentoModelPaciente) {
        this.dataNascimentoModelPaciente = dataNascimentoModelPaciente;
    }

    public String getCpfBanco() {
        return cpfBanco;
    }

    public void setCpfBanco(String cpfBanco) {
        this.cpfBanco = cpfBanco;
    }
    

    public int saidaId (){
        int i = 1;
        EnderecoDAO endDao = new EnderecoDAO();
        i = endDao.getLastID();
        return i;
    }
//    metodo aguardando metodos classe pacienteDAO
    public String compareBusca(){
        PacienteDAO pDAO = new PacienteDAO();
        String sPAC = pDAO.getPAC().getCpfBanco();
        JOptionPane.showMessageDialog(null, sPAC+" oo1");
        String cpfSolcitado = this.getCpfModelPaciente();
        JOptionPane.showMessageDialog(null, cpfSolcitado+" oo2");
        String cpfBancoEntra = this.getCpfBanco();
        JOptionPane.showMessageDialog(null, cpfBancoEntra+" oo3");
        
        if(cpfSolcitado.equals(cpfBancoEntra)){
            JOptionPane.showMessageDialog(null, "sao iguais");
        }else{
            JOptionPane.showMessageDialog(null, "nao existe cpf");
            
        }
        return cpfSolcitado;
    }
    
    public void salvar(Paciente paciente){
        try {
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.add(paciente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
