	< < - - - EXERCÍCIO 1 - - - > >
 

drop database if exists dbaluno;
create database dbaluno;
use dbaluno;

create table aluno(
    IDaluno int not null primary key auto_increment,
    nome varchar(45),
    sexo enum("m", "f"),
    idade int,
    cidade varchar(30)
);

insert into aluno(nome, sexo, idade, cidade) values('Santiago','m',17,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Jubileu','m',65,'Marte');
insert into aluno(nome, sexo, idade, cidade) values('Joan','m',16,'São José');
insert into aluno(nome, sexo, idade, cidade) values('Astolfo','m',71,'Porto Alegre');
insert into aluno(nome, sexo, idade, cidade) values('Cida','f',78,'Caxias');
insert into aluno(nome, sexo, idade, cidade) values('Juliana','f',21,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Rogerinho','m',38,'Brasilia');
insert into aluno(nome, sexo, idade, cidade) values('Raimundinho','m',00,'Recife');
insert into aluno(nome, sexo, idade, cidade) values('Chorão','m',42,'São Paulo');
insert into aluno(nome, sexo, idade, cidade) values('Elair','f',77,'Pelotas');
insert into aluno(nome, sexo, idade, cidade) values('Leofildo','m',87,'Pelotas');
insert into aluno(nome, sexo, idade, cidade) values('Claudio','m',27,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Marina','f',18,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Felipe','m',24,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Fernanda','f',26,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Caique','m',12,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Valentina','f',17,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Sabrina','f',19,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Adriano','m',17,'Florianópolis');
insert into aluno(nome, sexo, idade, cidade) values('Mago Paulo','m',45,'Florianópolis');




	< < - - - EXERCÍCIO 2 - - - > >


DROP DATABASE IF EXISTS DBDELEGACIA;
CREATE DATABASE DBDELEGACIA;
USE DBDELEGACIA;

CREATE TABLE CRIME (
	IDCRIME INT NOT NULL,
	DESCRICAO VARCHAR(255),
	RUA VARCHAR(100),
	NUMERO INT,
	COMPLEMENTO VARCHAR(255),
	BAIRRO VARCHAR(100),
	CEP VARCHAR(8),
	CIDADE VARCHAR(100),
	ESTADO CHAR(2)
);
ALTER TABLE CRIME
DROP COLUMN RUA,
DROP COLUMN NUMERO,
DROP COLUMN BAIRRO,
DROP COLUMN CEP,
DROP COLUMN CIDADE,
DROP COLUMN ESTADO;

ALTER TABLE CRIME
ADD COLUMN TDCRIME DATETIME;

ALTER TABLE CRIME
DROP COLUMN COMPLEMENTO,
DROP COLUMN DESCRICAO;

ALTER TABLE CRIME
ADD COLUMN DESCRICAO VARCHAR(200);

describe CRIME;



CREATE TABLE CRIMINOSO(
  RUA VARCHAR(100),
  NUMERO INT,
  COMPLEMENTO VARCHAR(255),
  BAIRRO VARCHAR(100),
  CEP CHAR(8),
  CIDADE VARCHAR(100),
  ESTADO CHAR(2),
  DTNASCIMENTO DATE,
  TELEFONE VARCHAR(15)
);
ALTER TABLE CRIMINOSO
DROP COLUMN RUA;

ALTER TABLE CRIMINOSO
DROP COLUMN NUMERO;

ALTER TABLE CRIMINOSO
DROP COLUMN COMPLEMENTO,
DROP COLUMN BAIRRO,
DROP COLUMN CEP;

ALTER TABLE CRIMINOSO
DROP COLUMN CIDADE,
DROP COLUMN ESTADO,
DROP COLUMN TELEFONE;

ALTER TABLE CRIMINOSO
ADD COLUMN NOME VARCHAR(45);

ALTER TABLE CRIMINOSO
ADD COLUMN IDCRIMINOSO INT NOT NULL PRIMARY KEY AUTO_INCREMENT;

describe CRIMINOSO;



CREATE TABLE OCORRENCIA (
	IDOCORRENCIA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	DT_OCORRENCIA DATE
);

DROP TABLE OCORRENCIA;


CREATE TABLE ITEM_OCORRENCIA (
	IDITEM INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	IDOCORRENCIA INT NOT NULL,
	DESCRICAO VARCHAR (100),
	CONSTRAINT FK_ITEM_OCORRENCIA_OCORRENCIA FOREIGN KEY (IDOCORRENCIA) REFERENCES OCORRENCIA(IDOCORRENCIA)
);
DROP TABLE ITEM_OCORRENCIA;



CREATE TABLE VITIMA (
  RUA VARCHAR(100),
  NUMERO INT,
  COMPLEMENTO VARCHAR(255),
  BAIRRO VARCHAR(100),
  CEP VARCHAR(8),
  CIDADE VARCHAR(100),
  ESTADO CHAR(2),
  DTNASCIMENTO DATE
);
ALTER TABLE VITIMA
DROP COLUMN RUA,
DROP COLUMN NUMERO,
DROP COLUMN COMPLEMENTO,
DROP COLUMN BAIRRO,
DROP COLUMN CEP,
DROP COLUMN CIDADE,
DROP COLUMN ESTADO;

ALTER TABLE VITIMA
ADD COLUMN IDVITIMA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
ADD COLUMN NOME VARCHAR(45);

describe VITIMA;



CREATE TABLE COMETE(
	IDCRIME INT NOT NULL,
	IDCRIMINOSO INT NOT NULL
);

CREATE TABLE ATACA (
	OBSERVACAO CHAR(1)
);
ALTER TABLE ATACA
ADD COLUMN IDCRIMINOSO INT NOT NULL,
ADD COLUMN IDVITIMA INT NOT NULL;

ALTER TABLE ATACA
DROP COLUMN OBSERVACAO;



CREATE TABLE SOFRE (
	IDCRIME INT NOT NULL,
	IDVITIMA INT NOT NULL
);



CREATE TABLE ARMA (
	IDARMA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	MARCA VARCHAR(110)
);
ALTER TABLE ARMA
ADD COLUMN DESCRICAO VARCHAR(45),
ADD COLUMN TIPO ENUM('Tipo1','Tipo2','Tipo3'),
ADD COLUMN IDENTIFICACAO VARCHAR(15);

ALTER TABLE ARMA
DROP COLUMN MARCA;



CREATE TABLE USADA (
	IDARMA INT NOT NULL,
	IDCRIME INT NOT NULL
);