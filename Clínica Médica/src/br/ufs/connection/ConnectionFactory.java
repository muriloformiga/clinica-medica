package br.ufs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe para conexão com o Banco de dados
public class ConnectionFactory {
    
    public Connection getConnection(){
        String usuario = ""; //Inserir usuario do banco de dados
        String senha = ""; //Inserir senha de acesso ao banco de dados
        String nomeBanco = ""; //Inserir nome do banco de dados
        String EnderecoServer = ""; //Inserir endereco do servidor
        try {
            return DriverManager.getConnection("jdbc:postgresql://"+EnderecoServer+
                    "/"+nomeBanco, usuario, senha);        
        }catch(SQLException e) {
            System.out.println("Conexão não estabelecida");
            throw new RuntimeException(e);
        }
    }
}