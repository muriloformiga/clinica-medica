package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.ItemPatrimonio;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemPatrimonioDAO {
    private Connection con = null;
    
    public ItemPatrimonioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(ItemPatrimonio itempatrimonio){
       String sql = "INSERT INTO patrimonio(DESCRICAO, LOCALIZACAO, ANO_AQUISICAO, NUM_PATRIMONIO) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, itempatrimonio.getDescricao());           
           stat.setString(2, itempatrimonio.getLocalizacao());                      
           stat.setDate(3, new java.sql.Date(itempatrimonio.getAnoAquisicao().getTime()));
           stat.setInt(4, itempatrimonio.getNumPatrimonio());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ItemPatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
