/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações 
dos estudantes deste registro dessa escola.*/

create database db_escola;

/*Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes 
dos estudantes para se trabalhar com o serviço dessa escola.*/

use db_escola;
create table tb_estudantes
(
	id bigint(5) auto_increment,
    turma varchar(20),
    sala varchar(10),
    nome varchar(20),
    numero bigint(30),
	carteira bigint(5),
    nota decimal(10,2),
    
    primary key(id)
);

/*Popule esta tabela com até 8 dados;*/

insert into tb_estudantes (turma,sala,nome,numero,carteira)
values ("Manha","3D","Vinicius",29,29,6),
		("Manha","3C","Bruna",4,4,7),
        ("Manha","3D","Day",10,10,9.6),
        ("Manha","3D","Vinicius",27,27,10),
        ("Manha","3D","Guilherme",16,16,8.4),
        ("Manha","3D","Igor",20,20,5),
        ("Manha","3D","Joel",24,24,4.3),
        ("Manha","3D","Matheus",26,26,8);
        
        select*from tb_estudantes

/*Faça um select que retorne o/as estudantes  com a nota maior do que 7.*/

select*from tb_estudantes set nota>7

/*Faça um select que retorne o/as estudantes  com a nota menor do que 7.*/

select*from tb_estudantes set nota<7

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/

update tb_estudantes set nota = 10
where id = 1