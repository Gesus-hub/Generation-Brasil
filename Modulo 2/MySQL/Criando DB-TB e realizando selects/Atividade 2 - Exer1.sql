CREATE DATABASE	db_generation_game_online;

USE db_generation_game_online;	

CREATE TABLE tb_classe
(
	id_class INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    classes VARCHAR(50) NOT NULL,
    forca INT(50) NULL,
    agilidade INT(50) NULL,
    inteligencia INT(50) NULL
);

CREATE TABLE tb_personagem
(
	id_personagem INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    classe VARCHAR(100) NOT NULL,
    cla VARCHAR(100) NOT NULL,
    poder INT(100) NOT NULL,
    id_class INT NOT NULL,
    FOREIGN KEY	(id_class) REFERENCES tb_classe(id_class)
);

INSERT INTO tb_classe (nome,classes,forca,agilidade,inteligencia) VALUES 
("Bellato", "Atirador",1000,500,300),
("Acretia", "Lancador",300,500, 1400),
("Cora","Mago",300,200,2000),
("Bellato", "Guerreiro", 2000,800,1000),
("Bellato","Defensor", 2000,500,1200);

INSERT INTO tb_personagem (nome,classe,cla,poder,id_class) VALUES
("Igor","Atirador","Familia24",5000,1),
("Wendew", "Lancador", "Familia24", 5000,2),
("Day","Mago","Familia24",4000,3),
("Jesus","Guerreiro","Familia24",5000,4),
("Bia","Defensor","Familia24",4000,5);

SELECT * FROM tb_personagem
WHERE poder_ataque <= 2000
and poder_ataque >= 1000;

SELECT * FROM tb_personagem WHERE nome LIKE "%D%";

SELECT * FROM tb_classe WHERE classes = "mago";
	 