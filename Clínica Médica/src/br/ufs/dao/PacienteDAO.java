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
import javax.swing.JOptionPane;

public class PacienteDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    
    public PacienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Paciente paciente){
       String sql = "INSERT INTO clinica.paciente(NOME, CPF, TELEFONE, DT_NASC, ENDERECO_ID) VALUES (?,?,?,?,?)"; //, ENDERECO_ID
    //   PreparedStatement stmt = null;
       try{
           stmt = con.prepareStatement(sql);
           stmt.setString(1, paciente.getNomeModelPaciente());
           stmt.setString(2, paciente.getCpfModelPaciente());
           stmt.setString(3, paciente.getTelefoneModelPaciente());
           stmt.setString(4, paciente.getDataNascimentoModelPaciente());
           stmt.setInt(5, paciente.getIdFkModelPaciente());
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
           return true;
           
           
       } catch (SQLException e) {
           Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, e);
           JOptionPane.showMessageDialog(null, e+"PacienteDAO excp");
           return false;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
    }
    public Paciente getPAC(int id){
        Paciente pac = new Paciente();
        try{
           ResultSet rs = null;
           String sql = "SELECT * FROM clinica.paciente WHERE ID = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           while(rs.next()){
               pac.setNomeModelPaciente(rs.getString("NOME"));
               pac.setCpfModelPaciente(rs.getString("CPF"));
               pac.setDataNascimentoModelPaciente(rs.getString("DT_NASC"));
               pac.setTelefoneModelPaciente(rs.getString("TELEFONE"));
               pac.setIdFkModelPaciente(rs.getInt("ENDERECO_ID"));
              
           }
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       } finally {
            ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
       }
        return pac;
    }
}
