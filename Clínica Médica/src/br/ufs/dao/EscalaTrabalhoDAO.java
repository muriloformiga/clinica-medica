package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.EscalaTrabalho;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscalaTrabalhoDAO {
    private Connection con = null;
    
    public EscalaTrabalhoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(EscalaTrabalho escala){
       String sql = "INSERT INTO funcionario(DIAS_TRABALHO, HORA, CARGA_HORARIA) VALUES (?,?,?)";
       
       try{
           PreparedStatement stat = con.prepareStatement(sql);
           stat.setString(1, escala.getDiasTrabalhar());
           stat.setDate(2, new java.sql.Date(escala.getHora().getTime())); //OBS: Horario do tipo Time ou Date?
           stat.setString(3, escala.getCargaHoraria());
           
           stat.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(EscalaTrabalhoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
}
