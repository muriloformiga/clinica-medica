package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Exame;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExameDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public ExameDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Exame exame, int consulta_ID){
       String sql = "INSERT INTO exame(DT, HORA, SITUACAO, DIAGNOSTICO, TIPO, consulta_ID) VALUES (?,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(exame.getData().getTime()));
           stmt.setDate(2, new java.sql.Date(exame.getHora().getTime())); //Este tipo deverá ser Date
           stmt.setBoolean(3, exame.isSituacao());
           stmt.setString(4, exame.getDiagnostico());
           stmt.setString(5, exame.getTipo());
           stmt.setInt(6, consulta_ID);
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public List<Exame> get(int consulta_ID){
        List<Exame> exame = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM exame WHERE consulta_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,consulta_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               Exame ex = new Exame();
               ex.setData(rs.getDate("DT"));
               ex.setDiagnostico(rs.getString("DIAGNOSTICO"));
               ex.setHora(rs.getDate("HORA"));
               ex.setSituacao(rs.getBoolean("SITUACAO"));
               ex.setTipo(rs.getString("TIPO"));
               
               exame.add(ex);
           }
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return exame;
    }
}
