package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Agenda;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public AgendaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Agenda agenda){
       String sql = "INSERT INTO agenda(DT, HORA, medico_ID) VALUES (?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(agenda.getData().getTime()));
           stmt.setDate(2, new java.sql.Date(agenda.getHora().getTime())); //OBS: Horario do tipo Time ou Date?
           //stmt.setInt(3, especialidade.getMedico().getId()); //Chave estrangeira de Medico

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
