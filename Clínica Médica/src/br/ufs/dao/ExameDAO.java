package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Exame;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExameDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public ExameDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Exame exame){
       String sql = "INSERT INTO exame(DT, HORA, SITUACAO, DIAGNOSTICO) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(exame.getData().getTime()));
           stmt.setString(2, exame.getHora()); //Este tipo deverá ser Date
           stmt.setBoolean(3, exame.isSituacao());
           stmt.setString(4, exame.getDiagnostico());
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
