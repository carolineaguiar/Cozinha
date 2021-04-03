use restaurante;

create table Cozinha (idCozinha int primary key auto_increment, tipo varchar (45), pratoPrincipal varchar (45), horaAbertura int, horaFechamento int);
create table Funcionario (idFuncionario int primary key auto_increment, nome varchar (30), atividade varchar(45));
create table Ingrediente (idIngrediente int primary key auto_increment, nome varchar (30), dataValidade date);

/*/ Criação Cozinhas /--*/ 

insert into Cozinha 
(tipo,pratoPrincipal, horaAbertura, horaFechamento) 
values ('Mineira', 'Feijoada', 13 ,20);

insert into Cozinha 
(tipo,pratoPrincipal, horaAbertura, horaFechamento) 
values ('Chinesa', 'Yakisoba', 10,22);

insert into Cozinha 
(tipo,pratoPrincipal, horaAbertura, horaFechamento) 
values ('Italiana', 'Pizza', 12 ,21);

insert into Cozinha 
(tipo,pratoPrincipal, horaAbertura, horaFechamento) 
values ('Árabe', 'Tabule', 10 ,22);

insert into Cozinha 
(tipo,pratoPrincipal, horaAbertura, horaFechamento) 
values ('Fast Food', 'Hamburguer', 12, 00);

/*/ Inserção Funcionários /--*/ 

insert into funcionario 
(nome, atividade)
values ('Andreia Leite', 'Chef');

insert into funcionario 
(nome, atividade)
values ('Aparecida Ananias', 'Chef');

insert into funcionario 
(nome, atividade)
values ('Jack Chan', 'Chef');

insert into funcionario 
(nome, atividade)
values ('Paola Carosella', 'Chef');

insert into funcionario 
(nome, atividade)
values ('Ana Clara', 'Sous-chef');

insert into funcionario 
(nome, atividade)
values ('Andreia Leite', 'Sous-chef');

insert into funcionario 
(nome, atividade)
values ('Bruna Franciele', 'Ajudante');

insert into funcionario 
(nome, atividade)
values ('Livia Leite', 'Ajudante');

insert into funcionario 
(nome, atividade)
values ('Silvia Daphne', 'Ajudante');

insert into funcionario 
(nome, atividade)
values ('Roberval Venicio', 'Ajudante');

/*/ Inserção Ingredientes /--*/ 

insert into ingrediente
(nome, dataValidade)
values ('Farinha', '2022-02-06');

insert into ingrediente
(nome, dataValidade)
values ('Ovo', '2021-04-25');

insert into ingrediente
(nome, dataValidade)
values ('Macarrão', '2022-04-25');

insert into ingrediente
(nome, dataValidade)
values ('Leite', '2021-03-29');

insert into ingrediente
(nome, dataValidade)
values ('Feijão', '2022-08-07');

insert into ingrediente
(nome, dataValidade)
values ('Carne', '2021-10-25');

insert into ingrediente
(nome, dataValidade)
values ('Molho de Tomate', '2021-11-30');

insert into ingrediente
(nome, dataValidade)
values ('Bacon', '2023-02-25');


select count(*) from cozinha;

select * from cozinha 
where horaFechamento = 22;

select * from ingrediente
where dataValidade < now();

alter table funcionario add column Cozinha int;  
alter table ingrediente add column Cozinha int;  

alter table funcionario add foreign key(Cozinha) references cozinha(idCozinha);
alter table ingrediente add foreign key(Cozinha) references cozinha(idCozinha);

update funcionario set Cozinha = 1
where idFuncionario in (1, 5, 6, 9, 10);

update funcionario set Cozinha = 2
where idFuncionario in (3); 

update funcionario set Cozinha = 3
where idFuncionario in (7);

update funcionario set Cozinha = 4
where idFuncionario in (2,8); 

update funcionario set Cozinha = 5
where idFuncionario in (4); 



update ingrediente set Cozinha = 1
where idIngrediente in (5, 8); 

update ingrediente set Cozinha = 2
where idIngrediente in (4); 

update ingrediente set Cozinha = 3
where idIngrediente in (1, 3, 7); 

update ingrediente set Cozinha = 5
where idIngrediente in (2, 6); 

select * from cozinha A
left join ingrediente B
	on A.idCozinha = B.Cozinha
left join funcionario C
	on A.idCozinha = C.Cozinha
where B.idIngrediente IS NULL;

select * from cozinha A
left join ingrediente B
	on A.idCozinha = B.Cozinha
left join funcionario C
	on A.idCozinha = C.Cozinha
group by A.idCozinha
having count(A.idCozinha) > 4; 

select * from ingrediente;
select * from Cozinha;

