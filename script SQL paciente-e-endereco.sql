--*leia-me este é o nome do database = BCM, a senha é = 123, 
--o schema esta com o nome de = clinica,
--faça o comando SET antes de inserir as tabelas
--CREATE SCHEMA Clinica;
--SET SEARCH_PATH TO clinica;
--insira o script das tabelas 
--os comandos abaixo voces ja sabem né ;-)
--SELECT * FROM clinica.paciente;
--SELECT * FROM clinica.endereco;
--TRUNCATE TABLE clinica.paciente;
--TRUNCATE TABLE clinica.endereco CASCADE;
--DROP SCHEMA clinica CASCADE;


--script das tabelas:
CREATE TABLE clinica.endereco(
    ENDERECO_ID SERIAL PRIMARY KEY NOT NULL,
    LOGRADOURO CHAR(100) ,
    NUMERO INTEGER ,
    BAIRRO CHAR(100) ,
    CIDADE CHAR(100),
    ESTADO CHAR(100),
    CEP CHAR(8)
	
);
CREATE TABLE clinica.paciente(
    ID SERIAL PRIMARY KEY NOT NULL,
    NOME CHAR(150),
    CPF CHAR(11),
    TELEFONE CHAR(20),
    DT_NASC CHAR(10),
	ENDERECO_ID INTEGER NOT NULL REFERENCES clinica.Endereco(ENDERECO_ID) ON UPDATE CASCADE
    
);
