package br.ufs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//classe para conexão com o Banco de dados
public class ConnectionFactory {
        private static final String DRIVER = "org.postgresql.Driver";
        private static final String URL = "jdbc:postgresql://127.0.0.1:5432/clinica_medica"; //jdbc:postgresql://hostname:porta/nomeDoBanco","usuario", "senha
        private static final String USER = "postgres";//normalmente é esse
        private static final String PASS = "postress";//normalmente é esse
    
        public Connection getConnection(){
//        String usuario = ""; //Inserir usuario do banco de dados
//        String senha = ""; //Inserir senha de acesso ao banco de dados
//        String nomeBanco = ""; //Inserir nome do banco de dados
//        String EnderecoServer = ""; //Inserir endereco do servidor
//        try {
//            return DriverManager.getConnection("jdbc:postgresql://"+EnderecoServer+
//                    "/"+nomeBanco, usuario, senha);        
//        }catch(SQLException e) {
//            System.out.println("Conexão não estabelecida");
//            throw new RuntimeException(e);
//        }
            try {
                    Class.forName(DRIVER);            
                    return DriverManager.getConnection(URL, USER, PASS);            
                } catch (ClassNotFoundException | SQLException ex) {
                    throw new RuntimeException("Erro", ex);
                }
        }
        public static void closeConnection(Connection con){
            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public static void closeConnection(Connection con, PreparedStatement stmt){
            closeConnection(con);
            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
            closeConnection(con,stmt);
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}