package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.EscalaTrabalho;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscalaTrabalhoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public EscalaTrabalhoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(EscalaTrabalho escala){
       String sql = "INSERT INTO escala_trabalho(DIAS_TRABALHO, HORA, CARGA_HORARIA, funcionario_ID) VALUES (?,?::Time,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, escala.getDiasTrabalhar());
           stmt.setString(2, escala.getHora()); //OBS: Horario do tipo Time ou Date?
           stmt.setInt(3, Integer.parseInt(escala.getCargaHoraria()));
           stmt.setInt(4, escala.getFuncionarioId());
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EscalaTrabalhoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
    
    public List<EscalaTrabalho> get(String matricula){
        List<EscalaTrabalho> escala = new ArrayList<>();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM escala_trabalho AS e_t JOIN funcionario AS f ON(e_t.funcionario_ID = f.ID) WHERE MATRICULA = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, matricula);
           rs = stmt.executeQuery();
           while(rs.next()){
               EscalaTrabalho esc = new EscalaTrabalho();
               esc.setCargaHoraria(rs.getString("CARGA_HORARIA"));
               esc.setDiasTrabalhar(rs.getString("DIAS_TRABALHO"));  
               esc.setHora(rs.getString("HORA"));
               esc.setId(rs.getInt("ID"));
               esc.setFuncionarioId(rs.getInt("funcionario_ID"));
               escala.add(esc);
           }   
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
       return escala;
    }
    
    public void closeConnection(){
        ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
    }
}
