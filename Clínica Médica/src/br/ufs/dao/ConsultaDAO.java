package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Consulta;
import br.ufs.model.Prontuario;
import java.sql.Array;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public ConsultaDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Consulta consulta){
       String sql = "INSERT INTO consulta(DT, HORA, SITUACAO, DESCRICAO, DIAGNOSTICO, medico_ID, paciente_ID) VALUES (?,?::TIME,?,?,?,?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setDate(1, new java.sql.Date(consulta.getData().getTime()));
           stmt.setString(2, consulta.getHora()); //OBS: Horario do tipo Time ou Date?
           stmt.setBoolean(3, consulta.isSituacao());
           stmt.setString(4, consulta.getDescricao());
           stmt.setString(5, consulta.getDiagnostico());
           stmt.setInt(6, consulta.getMedicoId()); //Chave estrangeira de Medico
           stmt.setInt(7, consulta.getPacienteId()); //Chave estrangeira de Paciente
           
           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    public void inserirAtestado(Consulta consulta){
       String sql = "UPDATE consulta SET atestado_id= ? WHERE id = ?";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, consulta.getAtestadoId());
           stmt.setInt(2,consulta.getId());

           int i = stmt.executeUpdate();
           if(i == 1){System.out.println("Okay");}
           //return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ProntuarioDAO.class.getName()).log(Level.SEVERE, null, e);
           //return false;
       } 
    }
    
    public Consulta get(int paciente_ID, int medico_ID){
        Consulta consulta = new Consulta();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM consulta WHERE paciente_ID = ? AND medico_ID = ? ORDER BY DT DESC LIMIT 1";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,paciente_ID);
           stmt.setInt(2, medico_ID);
           rs = stmt.executeQuery();
           while(rs.next()){
               consulta.setData(rs.getDate("DT"));
               consulta.setDescricao(rs.getString("DESCRICAO"));
               consulta.setDiagnostico(rs.getString("DIAGNOSTICO"));
               consulta.setHora(rs.getString("HORA"));
               consulta.setSituacao(rs.getBoolean("SITUACAO"));
               consulta.setMedicoId(rs.getInt("medico_ID"));
               consulta.setPacienteId(rs.getInt("paciente_ID"));
               consulta.setId(rs.getInt("ID"));
               consulta.setAtestadoId(rs.getInt("atestado_ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return consulta;
    }
    
    public List<Consulta> getConsultasMarcadas(int paciente_ID){
        
        List<Consulta> consultas = new ArrayList();
        Consulta consulta = new Consulta();

        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM consulta WHERE paciente_ID = ? AND SITUACAO = ? ORDER BY DT DESC";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1,paciente_ID);
           stmt.setBoolean(2, false);
           rs = stmt.executeQuery();
           while(rs.next()){
               consulta.setData(rs.getDate("DT"));
               consulta.setDescricao(rs.getString("DESCRICAO"));
               consulta.setDiagnostico(rs.getString("DIAGNOSTICO"));
               consulta.setHora(rs.getString("HORA"));
               consulta.setSituacao(rs.getBoolean("SITUACAO"));
               consulta.setMedicoId(rs.getInt("medico_ID"));
               consulta.setPacienteId(rs.getInt("paciente_ID"));
               consulta.setId(rs.getInt("ID"));
               consulta.setAtestadoId(rs.getInt("atestado_ID"));;
               consultas.add(consulta);
           }
       } catch (SQLException e) {
           Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return consultas;
    }

   
    
}
