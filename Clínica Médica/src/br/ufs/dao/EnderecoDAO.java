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
import javax.swing.JOptionPane;

public class EnderecoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public EnderecoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Endereco endereco){
       String sql = "INSERT INTO clinica.endereco (LOGRADOURO, NUMERO, BAIRRO, CIDADE, ESTADO, CEP) VALUES (?,?,?,?,?,?)";
       try{
           stmt = con.prepareStatement(sql);
           stmt.setString(1, endereco.getLogradouroModelEndereco());
           stmt.setInt(2, endereco.getNumeroModelEndereco());
           stmt.setString(3, endereco.getBairroModelEndereco());
           stmt.setString(4, endereco.getCidadeModelEndereco());
           stmt.setString(5, endereco.getEstadoModelEndereco());
           stmt.setString(6, endereco.getCepModelEndereco());
        //   stmt.setInt(7, endereco.getEndereco_Ide());

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           JOptionPane.showMessageDialog(null, e+"EnderecoDAO excp");
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
