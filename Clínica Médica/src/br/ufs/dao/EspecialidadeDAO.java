package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Especialidade;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EspecialidadeDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public EspecialidadeDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Especialidade especialidade){
       String sql = "INSERT INTO especialidade(NOME, medico_ID) VALUES (?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, especialidade.getNome());
           //stmt.setInt(2, especialidade.getMedico().getId()); //Chave estrangeira de Medico

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EspecialidadeDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
