-- isso é um comentário

-- criar uma nova "Base de Dados"
create database bd_itau;

-- marcar o BD como padrãoptimize
use bd_itau;

-- criar uma nova tabela no BD
-- [nome da coluna] [tipo de dados] [qualificadores]
-- not null = esta colina não pode ser deixada em branco
-- auto_increment =  a numeração será gerada pelo prórpio DB (1, 2, 3, 4, ...)
-- varchar(x)  == campo de texto com tamanho máximo X
-- primary key = chave primária (identificador na tabela), não pode repetir

create table cliente (
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(20),
    constraint pk_cliente primary key(codigo)
);

-- CUIDAD111' aoaga a estrutura da tabela e TODOS os dados junto
-- descrever os detalhes da tabela 
desc cliente;

-- inserir dados na tabela
insert into cliente (codigo, nome, telefone) values (null, 'Carlos Augusto', '(11) 98765-4321'); 
insert into cliente (codigo, nome, telefone) values (null, 'Amanda Souza', '(11) 94444-4321'); 
insert into cliente (codigo, nome, telefone) values (null, 'Ricardo Santos', '(11) 91111-2222'); 
insert into cliente (codigo, nome, telefone) values (null, 'Felipe Prado', '(11) 97878-4446');

-- buscar informações no banco de dados
-- selecr [quais colunas] from [qual tabela] where [qual condição]

-- buscar todas as informações de todos os clintes 
select *
from cliente;

-- buscar o nome e o telefone do clinete com código 2
select nome, telefone -- bisque apenas nome e telefone
from cliente          -- na tabela cliente
where codigo = 2;     -- onde o código seja igual a 2


-- apagando código 
-- apagar o cliente que tem codigo 3
delete from cliente where codigo = 15;

-- atualizar dados
update cliente
set telefone = '(21) 12345-1234'
where codigo = 4;

-- SQL = Linguagem de Consulta Estruturada
-- criar tabela veiculo
-- foreign key = chave extrangeira, ligar coma outra tabela
-- references = indica com qual tabela e campo a ligação é feita

create table veiculo(
	codigo integer not null auto_increment,
    marca varchar(20),
    modelo varchar(40),
    proprietario integer,
	constraint pk_veiculo primary key(codigo),
    constraint fk_veiculo_cliente foreign key (proprietario) references cliente(codigo)
);

-- inserir dados de veiculos
insert into veiculo values (null, 'VW', 'Gol', 1);
insert into veiculo values (null, 'Chevrolet', 'Astra', 1);
insert into veiculo values (null, 'BMW', 'X1', 2);

-- buscar todos os dados de todos os veículos
select *
from veiculo;

-- quais os nomes dos proprietarios de cada veiculo?
-- inner join = junção das tabelas onde os caompos são iguais

select marca, modelo, nome
from veiculo inner join cliente on veiculo.proprietario = cliente.codigo;

