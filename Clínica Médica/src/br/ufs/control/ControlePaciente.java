package br.ufs.control;

import br.ufs.dao.EnderecoDAO;
import br.ufs.dao.PacienteDAO;
import br.ufs.model.Endereco;
import br.ufs.model.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlePaciente implements ActionListener{
    public Paciente paciente;
    public Endereco endereco;
    private EnderecoDAO enderecoDAO;
    private PacienteDAO pacienteDAO;
    
    //Construtor
    public ControlePaciente()
    {
        paciente = new Paciente();
        endereco = new Endereco();
        enderecoDAO = new EnderecoDAO();
        pacienteDAO = new PacienteDAO();
        
    }
    
    public void cadastrarPaciente(){
        System.out.println(endereco.getBairro());
        //enderecoDAO.add(endereco);
        //enderecoDAO.getLastID();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
