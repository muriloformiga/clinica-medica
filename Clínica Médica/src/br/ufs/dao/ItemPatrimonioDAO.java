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
    
    public boolean add(ItemPatrimonio itempatrimonio){
       //String sql = "INSERT INTO item_patrimonio(DESCRICAO, LOCALIZACAO, ANO_AQUISICAO, NUM_PATRIMONIO, TIPO, STATUS, patrimonio_ID) VALUES (?,?,?,?,?,?,?)";
       String sql = "INSERT INTO item_patrimonio(descricao, localizacao, ano_aquisicao, num_patrimonio, tipo, status, patrimonio_id) VALUES (?, ?, ?, ?, ?::tipo_patrimonio, ?::status_item, ?)";
       System.out.println(itempatrimonio.getTipo());
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, itempatrimonio.getDescricao());           
           stmt.setString(2, itempatrimonio.getLocalizacao());                      
           stmt.setDate(3, new java.sql.Date(itempatrimonio.getAnoAquisicao().getTime()));
           stmt.setInt(4, itempatrimonio.getNumPatrimonio());
           stmt.setString(5, itempatrimonio.getTipo());
           stmt.setString(6, itempatrimonio.getStatus());
           stmt.setInt(7, itempatrimonio.getPatrimonioId());

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
               item.setId(rs.getInt("ID"));
               item.setPatrimonioId(rs.getInt("patrimonio_ID"));
               
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
    
    public ItemPatrimonio getItem(int num){
        ItemPatrimonio itempatrimonio = new ItemPatrimonio();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM item_patrimonio WHERE num_patrimonio = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,num);
           rs = stmt.executeQuery();
           System.out.println("Testado aqui");
           while(rs.next()){
               itempatrimonio.setAnoAquisicao(rs.getDate("ANO_AQUISICAO"));
               itempatrimonio.setDescricao(rs.getString("DESCRICAO"));
               itempatrimonio.setLocalizacao(rs.getString("LOCALIZACAO"));
               itempatrimonio.setNumPatrimonio(rs.getInt("NUM_PATRIMONIO"));
               itempatrimonio.setStatus(rs.getString("status"));
               itempatrimonio.setTipo(rs.getString("tipo"));
               itempatrimonio.setId(rs.getInt("ID"));
               itempatrimonio.setPatrimonioId(rs.getInt("patrimonio_ID"));
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
