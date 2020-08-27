use db_diversos;
create table tb_petshop(
id_animal bigint auto_increment,
nome varchar(30) not null,
peso decimal(10.2) not null,
idade decimal(10.2),
sexo varchar(10),
especie varchar(30)not null,
nome_dono varchar(30)not null,

primary key (id_animal)
);


insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Pit", 11, 4.0, "Fêmea", "Cachorro", "Marcos Bala");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Brabo", 17.3, 3.0, "Macho", "Cachorro", "Adilson Batista");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Donatelo", 1.5, 2.2, "Macho", "Gato", "Tuany Fernanda");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Filomena", 8.6, 3.1, "Fêmea", "Cachorro", "Carla Monteiro");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Frajola", 1.8, 2.1, "Macho", "Gato", "Juliona Brandão");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Luna", 7.9, 3.1, "Fêmea", "Tartaruga", "Kayke Morelo");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Ralf", 18.5, 11.2, "Macho", "Cachorro", "Fran Donato");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Pink", 3.5, 1.1, "Fêmea", "Porco", "Carla Suianny");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Boris", 120.12, 12.3, "Macho", "Cachorro", "Carlos Andrade");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Lupi", 0.210, 1.1, "Fêmea", "Calopcita", "Brendo Anik");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Bluer", 1.55, 2.1, "Macho", "Arara-Azul", "Brandão Souza");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Mickey", 0.850, 1.0, "Macho", "Ramister", "Daniela Cicareli");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Pirata", 1.2, 3.1, "Macho", "Arara-Vermelha", "Daniel Menezes");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Yoshi", 0.255, 1.8, "Macho", "Lagarto", "Fred Mercury");
insert into tb_petshop(nome, peso, idade, sexo, especie, nome_dono) values ("Ballu", 1.1, 1.5, "Fêmea", "Cobra", "Anderson Viana");

select * from tb_petshop where peso > 10;
select * from tb_petshop where peso < 10;
select * from tb_petshop where peso >=10 and peso <=30;