package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Especialidade;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EspecialidadeDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public EspecialidadeDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Especialidade especialidade){
       String sql = "INSERT INTO especialidade(NOME, medico_ID) VALUES (?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, especialidade.getNome());
           stmt.setInt(2, especialidade.getMedicoId()); //Chave estrangeira de Medico

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EspecialidadeDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
    
    public List<Especialidade> get(int medico_ID){
        List<Especialidade> especialidade = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM especialidade WHERE medico_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, medico_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               Especialidade esp = new Especialidade();
               esp.setNome(rs.getString("NOME"));
               esp.setId(rs.getInt("ID"));
               esp.setMedicoId(rs.getInt("medico_ID"));
               especialidade.add(esp);
           }
       } catch (SQLException e) {
           Logger.getLogger(EspecialidadeDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
        return especialidade;
    }
    
    public List<Integer> get(String especialidade){
        List<Integer> lista = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT medico_ID FROM especialidade WHERE NOME = ? group by(medico_ID)";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, especialidade);
           rs = stmt.executeQuery();
           while(rs.next()){
               lista.add(rs.getInt("medico_ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(EspecialidadeDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
        return lista;
    }
    
    public void closeConnection(){
        ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
    }
}
