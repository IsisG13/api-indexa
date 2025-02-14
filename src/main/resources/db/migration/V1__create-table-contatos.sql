create table contatos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    telefone varchar(100) not null unique,
    email varchar(100) not null unique,
    aniversario varchar(100),
    redes varchar(100),
    observacoes varchar(255),

    primary key(id)
);