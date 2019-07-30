package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Atestado;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//inserção incompleta
public class AtestadoDAO {
    private Connection con = null;
    
    public AtestadoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Atestado atestado){
       String sql = "INSERT INTO atestado(DT_INICIO, QTD_DIAS, CID) VALUES (?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setDate(1, new java.sql.Date(atestado.getDt_Inicio().getTime()));
           stat.setInt(2, atestado.getQt_Dias());
           stat.setString(3, atestado.getCid());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(AtestadoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
