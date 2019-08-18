package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Atestado;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//inserção incompleta
public class AtestadoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public AtestadoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Atestado atestado){
       String sql = "INSERT INTO atestado(DT_INICIO, QTD_DIAS, CID) VALUES (?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(atestado.getDt_Inicio().getTime()));
           stmt.setInt(2, atestado.getQt_Dias());
           stmt.setString(3, atestado.getCid());

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(AtestadoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public Atestado get(int id){
        Atestado atestado = new Atestado();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM atestado WHERE ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           while(rs.next()){
               atestado.setCid(rs.getString("CID"));
               atestado.setDt_Inicio(rs.getDate("DT_INICIO"));
               atestado.setQt_Dias(rs.getInt("QTD_DIAS"));
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return atestado;
    }
}
