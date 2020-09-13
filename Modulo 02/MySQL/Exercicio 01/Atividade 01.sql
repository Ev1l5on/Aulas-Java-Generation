create database bd_RH;

use bd_RH;
create table tb_Funcionarios(
	id bigint auto_increment,
    nome varchar(30) not null,
    idade decimal(10),
    sexo varchar(20) not null,
    tempoDeEmpresa decimal(10),
    salario float (10,2),
    
    
    primary key (id)
    );
    
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Cesar Augusto", 28, "Mascolino", 5.0, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Bruno Stelzaneder", 29, "Masculino", 8.0, 10000.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Danilo Alves", 28, "Masculino", 6.0, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Evilson souza", 26, "Mascolino", 1.0, 1575.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Jessica Lorena", 20, "Feminino", 2.5, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Carolina Mira", 18, "Feminino", 4.4, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Brendo Aniki", 18, "Mascolino", 1.0, 2980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Sofia Fernandes", 22, "Feminino", 3.5, 3480.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Adriano Rocha", 27, "Mascolino", 6.0, 4780.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Isabelly Danni", 18, "Feminino", 1.0, 2980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Alex Cesar", 25, "Mascolino", 5.0, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Mauricio Coutinho", 24, "Mascolino", 3.0, 3480.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Geovanna Renata", 23, "Feminino", 3.0, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Tales Andrade", 25, "Mascolino", 5.0, 3980.00);
    insert into tb_funcionarios (nome, idade, sexo, tempoDeEmpresa, salario) values ("Caio Cesar", 22, "Mascolino", 4.0, 4180.00);
    
    select * from tb_funcionarios where salario > 2000.00 ;
    select * from tb_funcionarios where salario < 2000.00;
    
    update `bd_RH`.`tb_funcionarios` set `salario` = '3180.00' where (`id` = '7');
    
    
    

    