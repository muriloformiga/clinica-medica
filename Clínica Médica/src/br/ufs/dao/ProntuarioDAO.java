package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Prontuario;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
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
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
}
