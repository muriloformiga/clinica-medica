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
    
    public ExameDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Exame exame){
       String sql = "INSERT INTO exame(DT, HORA, SITUACAO, DIAGNOSTICO) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setDate(1, new java.sql.Date(exame.getData().getTime()));
           stat.setString(2, exame.getHora()); //Este tipo deverá ser Date
           stat.setBoolean(3, exame.isSituacao());
           stat.setString(4, exame.getDiagnostico());
           
           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
