create database db_diversos;

use db_diversos;
create table tb_alunos(
id_aluno bigint auto_increment,
nome varchar(30)not null,
idade decimal(10),
sexo varchar(30) not null,
turma bigint not null,
sala varchar(30) not null,
nota decimal(10,1) not null,

primary key(id_aluno)
);
alter table tb_alunos
modify column turma varchar(10);

insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Cesar Augusto", 28, "Mascolino", "Turma A", "C7", 8.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Bruno Stelzaneder", 29, "Masculino", "Turma A", "c7", 10.0);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Danilo Alves", 28, "Masculino", "Turma A", "C7", 3980.00);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Evilson souza", 26, "Mascolino", "Turma A", "C5", 7.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Jessica Lorena", 20, "Feminino", "Turma A", "C5", 10.0);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Carolina Mira", 16, "Feminino", "Turma A", "C5", 9.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Brendo Aniki", 18, "Mascolino", "Turma A", "C5", 9.3);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Sofia Fernandes", 22, "Feminino", "Turma A", "C5", 9.3);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Adriano Rocha", 27, "Mascolino", "Turma A", "C5", 8.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Isabelly Danni", 18, "Feminino", "Turma A", "C5", 8.9);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Alex Cesar", 25, "Mascolino", "Turma A", "C5", 9.1);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Mauricio Coutinho", 24, "Mascolino", "Turma A", "C5", 8.1);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Geovanna Renata", 23, "Feminino", "Turma A", "C5", 9.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Tales Andrade", 25, "Mascolino", "Turma A", "C5", 8.5);
insert into tb_alunos(nome, idade, sexo, turma, sala, nota) values ("Caio Cesar", 22, "Mascolino", "Turma A", "C5", 8.5);

select * from tb_alunos where idade > 18;
select * from tb_alunos where idade < 18;
select * from tb_alunos where idade >= 20 and idade <=25;
select * from tb_alunos 
