 use  db_generation_game_online;
create table tb_classe(
id bigint auto_increment,
classe_personagem varchar(10)not null,
ataque bigint(10),
defesa bigint(10),

primary key(id)

);

create table tb_personagem(
id bigint auto_increment,
nome_jogador varchar(35) not null,
cla varchar(30) not null,
nome_personagem varchar (30)not null,
nivel int ,
poder varchar(30)not null,
id_classe bigint,

primary key(id),
foreign key (id_classe) references tb_classe(id)
);

insert into tb_classe(Classe_personagem, Ataque, Defesa) values ("Bardo", 3200, 2100);
insert into tb_classe(classe_personagem, Ataque, Defesa) values ("Nobre", 3050, 2200);
insert into tb_classe(classe_personagem, Ataque, Defesa) values ("Ranger", 2995,1950 );
insert into tb_classe(classe_personagem, Ataque, Defesa) values ("Samurai", 2899, 1960);
insert into tb_classe(classe_personagem, Ataque, Defesa) values ("Guerreiro", 2897, 1955);

insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Evilson ", "Abutres", "Evils", 11, "Super Raio", 1);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Angela", "Forum Fadas", "Angel", 7, "Voar", 2);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Lurdes", "Topzera", "Jack", 9, "telepatia", 3);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Bruno ", "Toys", "Billy", 13, "Super Velocidade", 4);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("João", "BadBoy", "Jackal", 10, "Mutação", 4);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Maria", "Os Nobe", "Frida", 19, "Chamas nas mãos", 3);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Jose", "Os Cangaço", "Brad", 17, "Gelo", 5);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Joana", "Os Bomba", "Patty", 11, "Invisibilidade", 2);
insert into tb_personagem(nome_jogador, cla, nome_personagem, nivel, poder, id_classe) values ("Patricia", "As Poderosas", "Lince", 11, "Controla a Água", 3);


select tb_personagem.nome_personagem,tb_classe.classe_personagem, tb_classe.ataque from tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.id_classe 
		where tb_classe.ataque >	2000;

select * from tb_personagem
	inner join tb_classe on tb_classe.id = tb_personagem.id_classe
		where tb_classe.defesa between 1000 and 2000;
        
select * from tb_personagem where nome_personagem like "e%" or "E%"; 
   
 select * from tb_personagem 
	inner join tb_classe on tb_classe.id = tb_personagem.id_classe
		where tb_classe.classe_personagem like "%Ranger%"