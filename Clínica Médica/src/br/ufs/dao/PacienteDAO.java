package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Paciente;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public PacienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Paciente paciente){
       String sql = "INSERT INTO paciente(NOME, CPF, TELEFONE, DT_NASC, endereco_ID, prontuario_ID) VALUES (?,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, paciente.getNome());
           stmt.setString(2, paciente.getCpf());
           stmt.setString(3, paciente.getFone());
           stmt.setDate(4, new java.sql.Date(paciente.getDt_nasc().getTime()));
           stmt.setInt(5, paciente.getEnderecoId());
           stmt.setInt(6, paciente.getProntuarioId());
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } 
    }
    
    public Paciente get(String CPF){
        Paciente pac = new Paciente();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM paciente WHERE CPF = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, CPF);
           rs = stmt.executeQuery();
           while(rs.next()){
               pac.setCpf(rs.getString("CPF"));
               pac.setDt_nasc(rs.getDate("DT_NASC"));
               pac.setFone(rs.getString("TELEFONE"));
               pac.setNome(rs.getString("NOME"));
               pac.setId(rs.getInt("ID"));
               pac.setEnderecoId(rs.getInt("endereco_ID"));
               pac.setProntuarioId(rs.getInt("prontuario_ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } 
    return pac;
    }
    
    public void closeConnection(){
        ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
    }
}
