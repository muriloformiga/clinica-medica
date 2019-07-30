package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Funcionario;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO {
    private Connection con = null;
    
    public FuncionarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Funcionario funcionario){
       String sql = "INSERT INTO funcionario(NOME, CPF, MATRICULA, TELEFONE, DT_NASC) VALUES (?,?,?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, funcionario.getNome());
           stat.setString(2, funcionario.getCpf());
           stat.setInt(3, funcionario.getMatricula());
           stat.setString(4, funcionario.getTelefone());
           stat.setDate(5, new java.sql.Date(funcionario.getDt_nasc().getTime()));
           //stat.setString(6, funcionario.getEndereco());

           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
