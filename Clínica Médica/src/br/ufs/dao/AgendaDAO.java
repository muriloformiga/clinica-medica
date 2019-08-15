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
       String sql = "INSERT INTO agenda(DT, HORA, medico_ID) VALUES (?,?,?)"; //Esse medico_ID q foi colocado, eu tô meio por fora, imagino q seja a matricula do médico, de Funcionario ñ?
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, agenda.getDataModelAgenda());
           stmt.setString(2, agenda.getHoraModelAgenda());
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
