package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Paciente;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    private Connection con = null;
    
    public PacienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Paciente paciente){
       String sql = "INSERT INTO pessoa(NOME, CPF, TELEFONE, DT_NASC) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, paciente.getNome());
           stat.setString(2, paciente.getCpf());
           stat.setString(3, paciente.getFone());
           stat.setDate(4, new java.sql.Date(paciente.getDt_nasc().getTime()));
           //ps.setDate(2, new java.sql.Date(endDate.getTime());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
