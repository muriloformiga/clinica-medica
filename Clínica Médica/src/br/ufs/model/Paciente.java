
package br.ufs.model;

import br.ufs.dao.PacienteDAO;
import javax.swing.JOptionPane;


public class Paciente {
    private String nomeModelPaciente;
    private String cpfModelPaciente;
    private int idEnderecoModelPaciente;
    private String telefoneModelPaciente;
    private String dataNascimentoModelPaciente;
    private int prontuarioIdModelPaciente;

    public int getProntuarioIdModelPaciente() {
        return prontuarioIdModelPaciente;
    }

    public void setProntuarioIdModelPaciente(int prontuarioIdModelPaciente) {
        this.prontuarioIdModelPaciente = prontuarioIdModelPaciente;
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

    public int getIdEnderecoModelPaciente() {
        return idEnderecoModelPaciente;
    }

    public void setIdEnderecoModelPaciente(int idEnderecoModelPaciente) {
        this.idEnderecoModelPaciente = idEnderecoModelPaciente;
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

    public void salvar(Paciente paciente){
        try {
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.add(paciente);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
