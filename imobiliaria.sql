create database imobiliaria;
use imobiliaria;

create table cliente(
idCliente int not null auto_increment,
nome varchar(50) not null,
dataNasc date,
rg varchar(12),
cpf varchar(15) not null unique,
sexo varchar(10),
telefone varchar(15) not null,
celular varchar(15),
email varchar(50),
cep int(8) not null,
logradouro varchar(50) not null,
numero varchar(8) not null,
complemento varchar(20),
bairro varchar(20) not null,
cidade varchar(20) not null,
estado varchar(2),
enabled boolean,
codigoEmpresa int not null,
primary key(idCliente)
);

create table login(
idLogin int not null auto_increment,
nomeFuncionario varchar(50),
login varchar(20) not null unique,
senha varchar(30) not null,
tipoLogin varchar(20) not null,
idFilial int,
enabled boolean,
primary key(idLogin)
);

create table filial(
idFilial int not null auto_increment,
razaoSocial varchar(50) not null,
CNPJ varchar(25) not null,
CEP int(8) not null,
logradouro varchar(50) not null,
numero varchar(8) not null,
complemento varchar(20),
bairro varchar(20) not null,
cidade varchar(20) not null,
estado varchar(2),
idLogin int not null,
primary key(idFilial),
foreign key(idLogin) references login(idLogin)
);

create table funcionario(
idFuncionario int not null auto_increment,
nome varchar(50) not null,
dataNasc date,
rg varchar(12),
cpf varchar(15) not null unique,
sexo varchar(10),
telefone varchar(15) not null,
celular varchar(15),
email varchar(50),
cep int(8) not null,
logradouro varchar(50) not null,
numero varchar(8) not null,
complemento varchar(20),
bairro varchar(20) not null,
cidade varchar(20) not null,
estado varchar(2),
idFilial int not null,
primary key(idFuncionario),
foreign key(idFilial) references filial(idFilial)
);

create table imovel(
idImovel int not null auto_increment,
nome varchar(50),
CEP int(8) not null,
logradouro varchar(50) not null,
numero varchar(8) not null,
complemento varchar(20),
bairro varchar(20) not null,
cidade varchar(20) not null,
estado varchar(2),
descricao varchar(50) not null,
numDormitorios int (4) not null,
tamanho double not null,
vagas int(2) not null,
andar int,
mobiliado boolean,
pet boolean,
tipoImovel varchar(20) not null,
valor double  not null,
condominio double,
IPTU double,
seguro double,
parcela boolean,
valorEntrada double,
codigoEmpresa int not null,
enabled boolean,
primary key(idImovel)
);

create table venda(
idVenda int not null auto_increment,
idImovel int not null,
idCliente int not null,
idFuncionario int not null,
parcelado boolean,
valorEntrada double,
numeroParcela int,
valorParcela double,
primary key(idVenda),
foreign key(idImovel) references imovel(idImovel),
foreign key(idCliente) references cliente(idCliente),
foreign key(idFuncionario) references funcionario(idFuncionario)
);	

create table itemVenda(
idVenda int not null, 
idImovel int not null,
quantidade int not null,
primary key(idVenda, idImovel),
foreign key(idVenda) references venda(idVenda),
foreign key(idImovel) references imovel(idImovel)
);

insert into cliente(nome, dataNasc, rg, cpf, sexo, telefone, celular, 
email, cep, logradouro, numero, complemento, bairro, cidade, estado) values (
'Ana', '1996-05-25', '50.376.417-6','470.106.898-57','feminino','5931-4463',
'9-6140-3459','anacarolynaac25@gmail.com',04849508,'rua maria moassab',12,'A',
'Cantinho do céu','São Paulo','SP');

update cliente set nome='Ana Carolina', dataNasc='1996-05-25', rg='50.376.417-6',
cpf='470.106.898-57',sexo='feminino',telefone='5931-4463',celular='9-6140-3459',
email='anacarolynaac25@gmail.com',cep=04849508,logradouro='rua maria moassab',
numero=12,complemento='A',bairro='Cantinho do céu',cidade='São Paulo',
estado='SP' where idCliente =1;

select * from cliente;

insert into login(nomeFuncionario, login,senha,tipoLogin) values (
'Ana','ana.costa','123456','gerente');

update login set nomeFuncionario='Ana',login='ana.costa',senha='123456',tipoLogin='gerente' 
where idLogin = 1;

select * from login;

insert into filial(razaoSocial, CNPJ,CEP,logradouro,numero,complemento,bairro,
cidade,estado,idLogin) values ('NSX','1019.83793.0820/0001',0484903,'AV Berrini',
1078,'','Berrini','São Paulo','SP',1);

update filial set razaoSocial='NSX',CNPJ='1019.83793.0820/0001',CEP=0484903,
logradouro='AV Berrini',numero=1078,complemento='',bairro='Berrini',cidade='São Paulo',
estado='SP',idLogin=1 where idFilial = 1;

select * from filial;

insert into funcionario(nome, dataNasc, rg, cpf, sexo, telefone, celular, 
email, cep, logradouro, numero, complemento, bairro, cidade, estado,idFilial) values (
'Ana', '1996-05-25 00:00:00', '50.376.417-6','470.106.898-57','feminino','5931-4463',
'9-6140-3459','anacarolynaac25@gmail.com',04849508,'rua maria moassab',12,'A',
'Cantinho do céu','São Paulo','SP',1);

update funcionario set nome='Ana', dataNasc='1996-05-25 00:00:00', rg='50.376.417-6',
cpf='470.106.898-57',sexo='feminino',telefone='5931-4463',celular='9-6140-3459',
email='anacarolynaac25@gmail.com',cep=04849508,logradouro='rua maria moassab',
numero=12,complemento='A',bairro='Cantinho do céu',cidade='São Paulo',
estado='SP',idFilial=1 where idFuncionario = 1;

select * from funcionario;