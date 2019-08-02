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
    private PreparedStatement stmt = null;
    
    public PacienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Paciente paciente){
       String sql = "INSERT INTO pessoa(NOME, CPF, TELEFONE, DT_NASC) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, paciente.getNome());
           stmt.setString(2, paciente.getCpf());
           stmt.setString(3, paciente.getFone());
           stmt.setDate(4, new java.sql.Date(paciente.getDt_nasc().getTime()));

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
