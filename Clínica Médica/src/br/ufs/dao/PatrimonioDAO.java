package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Patrimonio;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatrimonioDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public PatrimonioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Patrimonio patrimonio, int gerente_ID){
       String sql = "INSERT INTO patrimonio(DT_ULTIMO_LEVANTAMENTO, QTD_ITEM, gerente_ID) VALUES (?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(patrimonio.getDataUltimoLevantamento().getTime()));
           stmt.setInt(2, patrimonio.getQuantItem());
           stmt.setInt(3, gerente_ID);

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(PatrimonioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public List<Patrimonio> get(int gerente_ID){
        List<Patrimonio> patrimonio = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM patrimonio WHERE gerente_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,gerente_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               Patrimonio patri = new Patrimonio();
               patri.setDataUltimoLevantamento(rs.getDate("DT_ULTIMO_LEVANTAMENTO"));
               patri.setQuantItem(rs.getInt("QTD_ITEM"));
               
               patrimonio.add(patri);
           }
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return patrimonio;
    }
}
