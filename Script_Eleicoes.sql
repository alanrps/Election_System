CREATE DATABASE ELEICOES;
USE ELEICOES;

DROP TABLE IF EXISTS PESSOA;
DROP TABLE IF EXISTS ENDERECO;
DROP TABLE IF EXISTS PARTIDO;
DROP TABLE IF EXISTS SECAO;
DROP TABLE IF EXISTS ZONA;
DROP TABLE IF EXISTS URNA;
DROP TABLE IF EXISTS CANDIDATO;
DROP TABLE IF EXISTS FUNCIONARIO;
DROP TABLE IF EXISTS REGISTRAC;
DROP TABLE IF EXISTS REGISTRAP;

CREATE TABLE PESSOA(
	titEleitor INTEGER PRIMARY KEY, 
    nome VARCHAR(100),
    dataNasc DATE,
    nmrPartido INTEGER, #Tabela partidos
    nmrSecao INTEGER, #Tabela secao
    nmrEnd INTEGER, #Tabela endereco
	FOREIGN KEY (nmrPartido) references PARTIDO(num),
    FOREIGN KEY (nmrSecao) references SECAO(nmr)
    
);

CREATE TABLE ENDERECO(
	nmr INTEGER PRIMARY KEY,
    cep INTEGER,
	logradouro VARCHAR(100),
    titEleitor INTEGER,
    FOREIGN KEY (titEleitor) references PESSOA(titEleitor)
);

CREATE TABLE PARTIDO(
	nmr INTEGER PRIMARY KEY,
    nome VARCHAR(100),
    nmrVotos INTEGER,
    sigla VARCHAR(10)
);

CREATE TABLE SECAO(
	nmr INTEGER PRIMARY KEY,
    localizacao VARCHAR(100),
    qtdeEleitores INTEGER,                     ###AUTO_INCREMENT
    nmrZona INTEGER, #Tabela Zona
    estadoZona VARCHAR(100), #Tabela Zona
	FOREIGN KEY (nmrZona) REFERENCES ZONA(nmr),
    FOREIGN KEY (estadoZona) REFERENCES ZONA(estado)
);

CREATE TABLE ZONA(
	nmr INTEGER,
    estado VARCHAR(100),
    endZona VARCHAR(100),
    qtdeEleitoresZona INTEGER,   ##AUTO_INCREMENT
    PRIMARY KEY(nmr,estado)
);

CREATE TABLE URNA(
	nmr INTEGER,
    modelo VARCHAR(100),
    tipoUrna VARCHAR(100),
    nmrSecao INTEGER, #Tabela Secao
    FOREIGN KEY (nmrSecao) REFERENCES SECAO(nmr)
);

CREATE TABLE CANDIDATO(
	nomeFant VARCHAR(100),
    nmr INTEGER,
    cargo VARCHAR(100),
    titEleitor INTEGER,
    FOREIGN KEY (titEleitor) references PESSOA(titEleitor)
);

CREATE TABLE FUNCIONARIO( 
	cargo VARCHAR(100),
    nmrSecao INTEGER, #Tabela Secao
    titEleitor INTEGER NOT NULL, #Tabela Pessoa
    FOREIGN KEY (titEleitor) references PESSOA(titEleitor),
    FOREIGN KEY (nmrSecao) references SECAO(nmr)
);

CREATE TABLE REGISTRAC(
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
	titEleitor INTEGER, #Tabela Pessoa
    nmrUrna INTEGER, #Tabela Urna
	FOREIGN KEY (titEleitor) REFERENCES CANDIDATO(titEleitor),
    FOREIGN KEY (nmrUrna) REFERENCES URNA(nmr)
);

CREATE TABLE REGISTRAP(
	id INTEGER AUTO_INCREMENT PRIMARY KEY,
    nmrPartido INTEGER,
    nmrUrna INTEGER,
    FOREIGN KEY (nmrPartido) REFERENCES PARTIDO(nmr),
    FOREIGN KEY (nmrUrna) REFERENCES URNA(nmr)
);



