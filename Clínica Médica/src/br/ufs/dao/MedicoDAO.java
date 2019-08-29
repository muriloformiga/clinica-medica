package br.ufs.dao;
//classes
import br.ufs.connection.ConnectionFactory;
import br.ufs.model.Medico;
//pacotes
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicoDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;

    public MedicoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean add(Medico medico){
       String sql = "INSERT INTO medico(CRM, funcionario_ID) VALUES (?,?)";
       
       try{
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, medico.getCrm());
           stmt.setInt(2, medico.getFuncionarioId()); //Chave estrangeira de Funcionario

           stmt.execute();
           return true;
           
       } catch (SQLException e) {
           Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, e);
           return false;
       }
    }
    public List<Medico> getALL(String especialidade){
        List<Medico> medico = new ArrayList<>();
        String sql = "SELECT f.NOME, f.CPF, f.MATRICULA, f.TELEFONE, f.DT_NASC, f.endereco_ID, m.ID, m.CRM, m.funcionario_ID FROM (medico AS m JOIN especialidade AS e ON(m.ID = e.medico_ID) AS me JOIN funcionario AS f ON(me.funcionario_ID = f.ID) AS mef JOIN escala_trabalho AS e_t ON(mef.funcionario_ID = e_t.funcionario_ID) WHERE e.NOME = ?)";
        try{
           ResultSet rs = null;
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, especialidade);
           rs = stmt.executeQuery();
           while(rs.next()){
               Medico med = new Medico();
               med.setCrm(rs.getString("CRM"));
               med.setNome(rs.getString("NOME"));
               med.setCpf(rs.getString("CPF"));
               med.setDt_nasc(rs.getDate("DT_NASC"));
               med.setMatricula(rs.getString("MATRICULA"));
               med.setTelefone(rs.getString("TELEFONE"));
               med.setFuncionarioId(rs.getInt("funcionario_ID"));
               med.setId(rs.getInt("ID"));
               med.setEnderecoId(rs.getInt("endereco_ID"));
               medico.add(med);
           }
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
        return medico; 
    }
    public Medico get(Integer crm){
        Medico medico = new Medico();
        String sql = "SELECT f.NOME, f.CPF,f.TELEFONE, f.DT_NASC, f.endereco_ID, m.ID, m.CRM, m.funcionario_ID FROM medico AS m JOIN funcionario AS f ON(m.funcionario_ID = f.ID) WHERE m.CRM = ?";
        try{
           ResultSet rs = null;
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, crm);
           rs = stmt.executeQuery();
           while(rs.next()){
               medico.setCrm(rs.getString("CRM"));
               medico.setNome(rs.getString("NOME"));
               medico.setCpf(rs.getString("CPF"));
               medico.setDt_nasc(rs.getDate("DT_NASC"));
//               medico.setMatricula(rs.getString("MATRICULA"));
               medico.setTelefone(rs.getString("TELEFONE"));
               medico.setFuncionarioId(rs.getInt("funcionario_ID"));
               medico.setId(rs.getInt("ID"));
               medico.setEnderecoId(rs.getInt("endereco_ID"));
           }
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
        return medico; 
    }
    
    public Medico getMed(int id){
        Medico medico = new Medico();
        String sql = "SELECT f.NOME, f.CPF, f.MATRICULA, f.TELEFONE, f.DT_NASC, f.endereco_ID, m.ID, m.CRM, m.funcionario_ID FROM medico AS m JOIN funcionario AS f ON(m.funcionario_ID = f.ID) WHERE m.ID = ?";
        try{
           ResultSet rs = null;
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           while(rs.next()){
               medico.setCrm(rs.getString("CRM"));
               medico.setNome(rs.getString("NOME"));
               medico.setCpf(rs.getString("CPF"));
               medico.setDt_nasc(rs.getDate("DT_NASC"));
               medico.setMatricula(rs.getString("MATRICULA"));
               medico.setTelefone(rs.getString("TELEFONE"));
               medico.setFuncionarioId(rs.getInt("funcionario_ID"));
               medico.setId(rs.getInt("ID"));
               medico.setEnderecoId(rs.getInt("endereco_ID"));
           }
           
       } catch (SQLException e) {
           Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, e);
           return null;
       }
        return medico; 
    }
    
    public void closeConnection(){
        ConnectionFactory.closeConnection(con,stmt);//fecha a conexao
    }
}
