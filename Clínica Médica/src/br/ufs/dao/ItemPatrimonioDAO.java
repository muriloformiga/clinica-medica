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
    private PreparedStatement stmt = null;

    public ItemPatrimonioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(ItemPatrimonio itempatrimonio){
       String sql = "INSERT INTO patrimonio(DESCRICAO, LOCALIZACAO, ANO_AQUISICAO, NUM_PATRIMONIO) VALUES (?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, itempatrimonio.getDescricao());           
           stmt.setString(2, itempatrimonio.getLocalizacao());                      
           stmt.setDate(3, new java.sql.Date(itempatrimonio.getAnoAquisicao().getTime()));
           stmt.setInt(4, itempatrimonio.getNumPatrimonio());

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ItemPatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
