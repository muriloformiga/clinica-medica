package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Prontuario;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//inserção incompleta
public class ProntuarioDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public ProntuarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Prontuario prontuario){
       String sql = "INSERT INTO prontuario(PRESCRICAO_MEDICA, OBSERVACOES_MEDICAS) VALUES (?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, prontuario.getPrescricaoRemedios());
           stmt.setString(2, prontuario.getObservacoesMedicas());

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ProntuarioDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       } 
    }
    
      public void up(int id,Prontuario prontuario){
       String sql = "UPDATE prontuario SET prescricao_medica= ?, observacoes_medicas=? WHERE id = ?";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, prontuario.getPrescricaoRemedios());
           stmt.setString(2, prontuario.getObservacoesMedicas());
           stmt.setInt(3,id);

           int i = stmt.executeUpdate();
           if(i == 1){System.out.println("Okay");}
           //return true;
           
       } catch (SQLException e) {
           Logger.getLogger(ProntuarioDAO.class.getName()).log(Level.SEVERE, null, e);
           //return false;
       } 
    }
    
    public int getLastID(){
        int id = 0;
        try{
           ResultSet rs = null;
           String sql = "SELECT ID FROM prontuario ORDER BY ID DESC LIMIT 1";
           PreparedStatement stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           while(rs.next()){
               id = rs.getInt("ID");
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return -1;
       } 
        return id;
    }
    
    public Prontuario get(int id){
        Prontuario pront = new Prontuario();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM prontuario WHERE ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           while(rs.next()){
               pront.setObservacoesMedicas(rs.getString("OBSERVACOES_MEDICAS"));
               pront.setPrescricaoRemedios(rs.getString("PRESCRICAO_MEDICA"));
               pront.setId(rs.getInt("ID"));
           }
       } catch (SQLException e) {
           Logger.getLogger(ProntuarioDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } 
        return pront;
    }
    
    public void closeConnection(){
        ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
    }
}
