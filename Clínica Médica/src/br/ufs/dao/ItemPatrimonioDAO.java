package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.ItemPatrimonio;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemPatrimonioDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public ItemPatrimonioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(ItemPatrimonio itempatrimonio, int patrimonio_ID){
       String sql = "INSERT INTO patrimonio(DESCRICAO, LOCALIZACAO, ANO_AQUISICAO, NUM_PATRIMONIO, TIPO, STATUS, patrimonio_ID) VALUES (?,?,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, itempatrimonio.getDescricao());           
           stmt.setString(2, itempatrimonio.getLocalizacao());                      
           stmt.setDate(3, new java.sql.Date(itempatrimonio.getAnoAquisicao().getTime()));
           stmt.setInt(4, itempatrimonio.getNumPatrimonio());
           stmt.setString(5, itempatrimonio.getTipo());
           stmt.setString(6, itempatrimonio.getStatus());
           stmt.setInt(7, patrimonio_ID);

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ItemPatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public List<ItemPatrimonio> get(int patrimonio_ID){
        List<ItemPatrimonio> itempatrimonio = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM item_patrimonio WHERE patrimonio_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,patrimonio_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               ItemPatrimonio item = new ItemPatrimonio();
               item.setAnoAquisicao(rs.getDate("ANO_AQUISICAO"));
               item.setDescricao(rs.getString("DESCRICAO"));
               item.setLocalizacao(rs.getString("LOCALIZACAO"));
               item.setNumPatrimonio(rs.getInt("NUM_PATRIMONIO"));
               item.setStatus(rs.getString("status_item"));
               item.setTipo(rs.getString("tipo_patrimonio"));
               
               itempatrimonio.add(item);
           }
       } catch (SQLException e) {
           Logger.getLogger(ItemPatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return itempatrimonio;
    }
}
