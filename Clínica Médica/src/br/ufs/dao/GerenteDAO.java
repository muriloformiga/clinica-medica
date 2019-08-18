package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Gerente;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//inserção incompleta
public class GerenteDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public GerenteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Gerente gerente, int funcionario_ID){
       String sql = "INSERT INTO gerente(funcionario_ID) VALUES (?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, funcionario_ID); //Chave estrangeira de Funcionario

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(GerenteDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public int getID(int funcionario_ID){
        int id = 0;
        try{
           ResultSet rs = null;
           String sql = "SELECT ID FROM gerente WHERE funcionario_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, funcionario_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               id = rs.getInt("ID");
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return -1;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    return id;
    }
}
