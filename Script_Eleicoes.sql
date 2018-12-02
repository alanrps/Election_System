CREATE DATABASE ELEICAO;
USE ELEICAO;

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
    codSecao VARCHAR(100), #Tabela secao
    idEnd INTEGER, #Tabela endereco
	FOREIGN KEY (nmrPartido) references PARTIDO(num),
    FOREIGN KEY (codSecao) references SECAO(codigo),
    FOREIGN KEY (idEnd) references ENDERECO(id)
);

CREATE TABLE ENDERECO(
	id INTEGER PRIMARY KEY auto_increment,
	nmr INTEGER,
    cep INTEGER,
	logradouro VARCHAR(100)
);

CREATE TABLE SECAO(
	codigo VARCHAR(100) primary key, 
    qtdeEleitores INTEGER,              
    nmrZona INTEGER, #Tabela Zona
    estadoZona VARCHAR(100), #Tabela Zona
	idEnd INTEGER, #Tabela endereco
	FOREIGN KEY (nmrZona) REFERENCES ZONA(nmr),
    FOREIGN KEY (estadoZona) REFERENCES ZONA(estado),
    FOREIGN KEY (idEnd) references ENDERECO(id)
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

DELETE FROM partido;

use eleicao;
select *
from partido;

select *
from PESSOA P,ENDERECO E
WHERE P.idEnd = E.id;

SELECT *
FROM ENDERECO;

INSERT INTO ENDERECO values(10,1110121,'Avenida São Joao',10101);

CREATE USER 'teste'@'localhost:3306' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON * . * TO 'root'@'localhost';
GRANT ALL ON *.* TO 'root'@'localhost' WITH GRANT OPTION; 
FLUSH PRIVILEGES;

ALTER TABLE `PESSOA` AUTO_INCREMENT = 0

select *
from mysql.user;

DELETE FROM pessoa
WHERE idEnd != 1;



SELECT P.titEleitor as tituloeleitor,P.nome,E.nmr as numero, E.cep, E.logradouro,PAR.nome as partido FROM Endereco E,Pessoa P,Partido PAR where P.idEnd = E.id AND PAR.nmr = P.nmrPartido
;

SELECT PAR.nmr as numero,PAR.nome,PAR.sigla,count(nmr)
FROM PARTIDO PAR,PESSOA P
WHERE PAR.nmr = P.nmrPartido
group by nmr

SELECT *
FROM PESSOA,PARTIDO P
WHERE nmrPartido = nmr

INSERT INTO PESSOA(titEleitor,nome,nmrPartido) VALUES (12345,'Lula Preso',13);
INSERT INTO PARTIDO(nmr,nome,sigla) VALUES (13,'Lula Preso','PT');

SELECT  FROM PARTIDO

SELECT nmr
FROM PARTIDO;

SELECT PAR.nmr as numero,PAR.nome,PAR.sigla FROM PARTIDO PAR;

select *
from PARTIDO;

use aluno;