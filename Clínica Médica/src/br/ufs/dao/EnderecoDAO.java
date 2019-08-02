package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Endereco;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
