package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Endereco;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public EnderecoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Endereco endereco){
       String sql = "INSERT INTO endereco(LOGRADOURO, NUMERO, BAIRRO, CIDADE, ESTADO, CEP) VALUES (?,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, endereco.getLogradouro());
           stmt.setInt(2, endereco.getNumero());
           stmt.setString(3, endereco.getBairro());
           stmt.setString(4, endereco.getCidade());
           stmt.setString(5, endereco.getEstado());
           stmt.setString(6, endereco.getCep());

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    public int getLastID(){
        int id = 0;
        try{
           ResultSet rs = null;
           String sql = "SELECT ID FROM endereco ORDER BY ID DESC LIMIT 1";
           PreparedStatement stmt = con.prepareStatement(sql);
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
    
    public Endereco get(int id){
        Endereco end = new Endereco();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM endereco WHERE ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           while(rs.next()){
               end.setBairro(rs.getString("BAIRRO"));
               end.setCep(rs.getString("CEP"));
               end.setCidade(rs.getString("CIDADE"));
               end.setEstado(rs.getString("ESTADO"));
               end.setLogradouro(rs.getString("LOGRADOURO"));
               end.setNumero(rs.getInt("NUMERO"));
               end.setId(rs.getInt("ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return end;
    }
    
}
