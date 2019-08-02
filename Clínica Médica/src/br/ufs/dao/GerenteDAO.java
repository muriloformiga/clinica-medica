package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Gerente;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    public boolean add(Gerente gerente){
       String sql = "INSERT INTO gerente(funcionario_ID) VALUES (?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           //stmt.setInt(1, funcionario.getFuncionario().getId()); //Chave estrangeira de Funcionario

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(AtestadoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
