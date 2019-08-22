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
    
    public boolean add(Gerente gerente){
       String sql = "INSERT INTO gerente(funcionario_ID) VALUES (?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, gerente.getFuncionarioId()); //Chave estrangeira de Funcionario

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(GerenteDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    //ID AMBIGUOS
    public Gerente get(String CPF){
        Gerente gerente = new Gerente();
        try{
           ResultSet rs = null;
           String sql = "SELECT g.ID, g.funcionario_ID, f.NOME, f.CPF, f.MATRICULA, f.TELEFONE, f.DT_NASC, f.endereco_ID FROM funcionario AS f JOIN gerente AS g ON(f.ID = g.funcionario_ID) WHERE CPF = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, CPF);
           rs = stmt.executeQuery();
           while(rs.next()){
               gerente.setId(rs.getInt("ID"));
               gerente.setCpf(rs.getString("CPF"));
               gerente.setDt_nasc(rs.getDate("DT_NASC"));
               gerente.setEnderecoId(rs.getInt("endereco_ID"));
               gerente.setNome(rs.getString("NOME"));
               gerente.setMatricula(rs.getString("MATRICULA"));
               gerente.setFuncionarioId(rs.getInt("funcionario_ID"));
               gerente.setTelefone(rs.getString("TELEFONE"));
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    return gerente;
    }
}
