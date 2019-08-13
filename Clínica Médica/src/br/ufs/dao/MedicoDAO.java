package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Medico;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public MedicoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Medico medico){
       String sql = "INSERT INTO medico(CRM, funcionario_ID) VALUES (?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, medico.getCrm());
           //stmt.setInt(2, medico.getFuncionario().getId()); //Chave estrangeira de Funcionario

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
