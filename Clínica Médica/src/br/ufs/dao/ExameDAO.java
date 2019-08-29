package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Consulta;
import br.ufs.model.Exame;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExameDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public ExameDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Exame exame){
       String sql = "INSERT INTO exame(DT, HORA, SITUACAO, DIAGNOSTICO, TIPO, consulta_ID) VALUES (?,?::TIME,?,?,?::tipo_exame,?)";
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(exame.getData().getTime()));
           //DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
           stmt.setString(2, exame.getHora());
           stmt.setBoolean(3, true);
           stmt.setString(4, exame.getDiagnostico());
           stmt.setString(5, exame.getTipo());
           stmt.setInt(6, exame.getConsultaId());
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    
    public Exame get(int consulta_ID){
        Exame ex = new Exame();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM exame WHERE consulta_ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,consulta_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               ex.setData(rs.getDate("DT"));
               ex.setDiagnostico(rs.getString("DIAGNOSTICO"));
               ex.setHora(rs.getString("HORA"));
               ex.setSituacao(rs.getBoolean("SITUACAO"));
               ex.setTipo(rs.getString("TIPO"));
               ex.setId(rs.getInt("ID"));
               ex.setConsultaId(rs.getInt("consulta_ID"));
               ex.setAtestadoId(rs.getInt("atestado_ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return ex;
    }
    
    public List<Exame> getExamesMarcados(int paciente_ID){
        
        List<Exame> exames = new ArrayList();

        try{
           ResultSet rs = null;
           String sql = "SELECT a.DT,a.DIAGNOSTICO,a.HORA,a.SITUACAO,a.TIPO,a.ID,a.consulta_ID,a.atestado_ID FROM exame AS a JOIN consulta AS c ON(c.ID = a.consulta_ID) WHERE c.paciente_ID = ? AND a.SITUACAO = false ORDER BY DT DESC";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,paciente_ID);
         
           rs = stmt.executeQuery();
           while(rs.next()){
               Exame ex = new Exame();
               ex.setData(rs.getDate("DT"));
               ex.setDiagnostico(rs.getString("DIAGNOSTICO"));
               ex.setHora(rs.getString("HORA"));
               ex.setSituacao(rs.getBoolean("SITUACAO"));
               ex.setTipo(rs.getString("TIPO"));
               ex.setId(rs.getInt("ID"));
               ex.setConsultaId(rs.getInt("consulta_ID"));
               ex.setAtestadoId(rs.getInt("atestado_ID"));
               exames.add(ex);
           }
       } catch (SQLException e) {
           Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return exames;
    }
    
     public void inserirAtestado(Exame exame){
       String sql = "UPDATE exame SET atestado_id= ? WHERE id = ?";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, exame.getAtestadoId());
           stmt.setInt(2,exame.getId());

           int i = stmt.executeUpdate();
           if(i == 1){System.out.println("Okay");}
           //return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ProntuarioDAO.class.getName()).log(Level.SEVERE, null, e);
           //return false;
       } 
    }
     
     public List<Exame> getExamesMarcadosMedico(int id) {
        List<Exame> exames = new ArrayList();
        Exame exame = new Exame();


        try{
           ResultSet rs = null;
           String sql = "SELECT e.TIPO, e.DT,e.HORA,p.nome FROM consulta AS c JOIN paciente AS p ON(c.paciente_ID = p.id) JOIN exame AS e ON(c.ID = e.consulta_ID) WHERE medico_ID = ? AND e.SITUACAO = ? ORDER BY DT DESC";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,id);
           stmt.setBoolean(2, true);
           rs = stmt.executeQuery();
           while(rs.next()){
               exame.setData(rs.getDate("DT"));
               exame.setTipo(rs.getString("TIPO"));
               exame.setHora(rs.getString("HORA"));
               exame.setPacienteNome(rs.getString("NOME"));
               
             
               exames.add(exame);
           }
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return exames;
    }
    
    public List<Exame> getExamesRealizadosMedico(int id) {
        this.con = new ConnectionFactory().getConnection();

        List<Exame> exames = new ArrayList();
        Exame exame = new Exame();

        try{
           ResultSet rs = null;
           String sql = "SELECT e.TIPO, e.DT,e.HORA,p.nome FROM consulta AS c JOIN paciente AS p ON(c.paciente_ID = p.id) JOIN exame AS e ON(c.ID = e.consulta_ID) WHERE medico_ID = ? AND e.SITUACAO = ? ORDER BY DT DESC";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,id);
           stmt.setBoolean(2, false);
           rs = stmt.executeQuery();
           while(rs.next()){
               exame.setData(rs.getDate("DT"));
               exame.setTipo(rs.getString("TIPO"));
               exame.setHora(rs.getString("HORA"));
               exame.setPacienteNome(rs.getString("NOME"));
               
             
               exames.add(exame);
           }
       } catch (SQLException e) {
           Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return exames;
    }
}
