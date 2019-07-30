package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Patrimonio;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatrimonioDAO {
    private Connection con = null;
    
    public PatrimonioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Patrimonio patrimonio){
       String sql = "INSERT INTO patrimonio(DT_ULTIMO_LEVANTAMENTO, QTD_ITEM) VALUES (?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setDate(1, new java.sql.Date(patrimonio.getDataUltimoLevantamento().getTime()));
           stat.setInt(2, patrimonio.getQuantItem());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(PatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
