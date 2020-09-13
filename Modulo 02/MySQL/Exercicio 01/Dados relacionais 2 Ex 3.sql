use db_diversos;
create table tb_loja(
id_produto int auto_increment,
produto varchar (30)not null,
preco float(10.2)not null,
categoria varchar(20)not null,
marca varchar(20)not null,
codigo float(10.3)not null,
fabricação varchar(20) not null,

primary key(id_produto)
);*/

insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Televisão", 2990.00, "Sala", "LG", 4567.987, "Coreia do Sul, Suel");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Geladeira", 3550.99, "Cozinha", "Eletrolux", 5678.987, "Brasil, Curitiba");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Fogão", 1150.00, "Cozinha", "Brastemp", 3424.876, "Brasil, São Paulo");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Maquina de Lavar", 2249.90, "Lavanderia", "Consul", 3654.875, "Brasil, Joinville");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Aquecedor", 3359.00, "Lavanderia", "Lorenzetti", 3546.456, "Brasil, São Paulo");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Panela Eletrica", 120.00, "Cozinha", "Mondial", 5645.098, "Brasil, Barueri");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Sofa", 2445.99, "Sala", "Estofado CIA", 4356.567, "Brasil, Brasilia");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Micro System", 1990.00, "Sala", "Sony", 2343.878, "Japão, Toquio");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("televisão", 3250.00, "Sala", "Sony", 5463.786, "Japão,Toquio");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Cama Box", 2100.00, "Quarto", "King Star", 5342.980, "Brasil, São Paulo");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Guarda Roupa", 1990.00, "Quarto", "Madeira Madeira", 7686.465, "Brasil, Curutiba");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Ganinete, + Cuba", 1055.00, "Banheiro", "Deca", 8675.098, "Brasil, São Paulo");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Mesa de Jantar", 1345.90, "Sala", "Madeira Madeira", 9876.090, "Brasil, Curitiba");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Microondas", 750.00, "Cozinha", "Eletrolux", 1232.786, "BRasil, Curitiba");
insert into tb_loja(produto, preco, categoria, marca, codigo, fabricação) values ("Ventilador", 190.00, "Quarto", "Arno", 6547.987, "Brasil,São Paulo");

select * from tb_loja where produto like "A%";
select * from tb_loja where categoria like "%Sala%";
select * from tb_loja where  preco >= 1000.00 and preco <= 1500.00;
select * from tb_loja where categoria like "%Cozinha%";
