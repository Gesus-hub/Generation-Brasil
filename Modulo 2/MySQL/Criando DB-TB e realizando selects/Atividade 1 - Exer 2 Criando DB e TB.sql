/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos 
deste ecommerce.*/

create database db_ecommerce

/*Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes 
dos produtos para se trabalhar com o serviço deste ecommerce.*/

use db_ecommerce;
create table tb_produtos
(
	id bigint(5) auto_increment,
    produto varchar(20) not null,
    marca varchar(20) not null,
    preco decimal(10,2),
    garantia boolean,
    cor varchar(20) not null,
    
    primary key (id)
);

/*Popule esta tabela com até 8 dados;*/

insert into tb_produtos (produto,marca,preco,garantia,cor)
values ("Celular","Iphone",5499.49,true,"Preto"),
("Celular","Samsung",3000.00,true,"Preto"),
("Celular","Xiaomi",1999.99,true,"Preto"), 
("Celular","Nokia",5499.49,true,"Preto"),
("Celular","Motorola",5499.49,true,"Preto"),
("Celular","Sony",5499.49,true,"Preto"),
("Celular","LG",370.49,true,"Preto"),
("Celular","Huawei",5499.49,true,"Preto");

select*from tb_protutos

/*Faça um select que retorne os produtos com o valor maior do que 500.*/

select*from tb_produtos set preco>500 

/*Faça um select que retorne os produtos com o valor menor do que 500.*/

select*from tb_produtos set preco<500

/*Ao término atualize um dado desta tabela através de uma query de atualização.*/

update tb_produtos set preco = 500.86 where id = 5