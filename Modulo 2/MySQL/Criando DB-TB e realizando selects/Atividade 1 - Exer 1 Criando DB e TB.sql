/*Crie um banco de dados para um serviço de RH de uma empresa, 
onde o sistema trabalhará com as informações dos funcionaries 
desta empresa.*/

create database db_rh

/*Crie uma tabela de funcionaries e utilizando a habilidade de 
abstração e determine 5 atributos relevantes dos funcionaries 
para se trabalhar com o serviço deste RH.*/

use db_rh;
Create table tb_funcionares
(
	id bigint (5) auto_increment,
	nome varchar (50) not null,
	idade bigint(2),
	telefone varchar (14) not null,
	cargo varchar (30),
	salario decimal(10,2),
    
	primary key (id)
);

/*Popule esta tabela com até 5 dados;*/

insert into tb_funcionares(nome,idade,telefone,cargo,salario)
values ("Igor",22,"(11)92233-6577","Dev",7550.49),
	("Day",22,"(11)92233-6577","Dev",7550.49),
	("Vini",22,"(11)92233-6577","Dev",7550.49),
	("Wendew",22,"(11)92233-6577","Dev",7550.49),
	("Michele",22,"(11)92233-6577","Dev",7550.49)

/*Faça um select que retorne os funcionaries com o salário maior 
do que 2000.*/

select*from tb_funcionares where set salario>2000

/*Faça um select que retorne os funcionaries com o salário menor 
do que 2000.*/

select*from tb_funcionares where set salario<2000

/*Ao término atualize um dado desta tabela através de uma query 
de atualização.*/

update tb_funcionares set salario = 7799.99
where id = 1