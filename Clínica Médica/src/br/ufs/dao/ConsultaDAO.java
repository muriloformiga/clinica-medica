package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Consulta;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public ConsultaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Consulta consulta){
       String sql = "INSERT INTO consulta(DT, HORA, SITUACAO, DESCRICAO, DIAGNOSTICO, medico_ID, paciente_ID, consulta_ID) VALUES (?,?,?,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(consulta.getData().getTime()));
           stmt.setDate(2, new java.sql.Date(consulta.getHora().getTime())); //OBS: Horario do tipo Time ou Date?
           stmt.setBoolean(3, consulta.isSituacao());
           stmt.setString(4, consulta.getDescricao());
           stmt.setString(5, consulta.getDiagnostico());
           //stmt.setInt(6, consulta.getMedico().getId()); //Chave estrangeira de Medico
           //stmt.setInt(7, consulta.getPaciente().getId()); //Chave estrangeira de Paciente
           //stmt.setInt(8, consulta.getConsulta().getId()); //Chave estrangeira de Consulta(?)
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
