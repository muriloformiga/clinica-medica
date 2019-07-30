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
    
    public EnderecoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Endereco endereco){
       String sql = "INSERT INTO endereco(LOGRADOURO, NUMERO, BAIRRO, CIDADE, ESTADO, CEP) VALUES (?,?,?,?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, endereco.getLogradouro());
           stat.setInt(2, endereco.getNumero());
           stat.setString(3, endereco.getBairro());
           stat.setString(4, endereco.getCidade());
           stat.setString(5, endereco.getEstado());
           stat.setString(6, endereco.getCep());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
