use proyecto_final_BD;

/*OPERATIONS*/

drop table usuario cascade;
describe usuario;
select * from equipo;

/*CREATE*/

CREATE DATABASE proyecto_final_BD;

create table if not exists equipo (
	id_equipo int NOT NULL auto_increment,
    nombre_equipo varchar(50) NOT NULL unique,
    primary key (id_equipo)
);

create table if not exists categoria (
	id_categoria int NOT NULL auto_increment,
    nombre_categoria varchar(30) NOT NULL unique,
    primary key (id_categoria)
);

create table if not exists trabajador (
	id_trabajador int NOT NULL auto_increment,
	num_trabajador int NOT NULL unique,
	nombre varchar(50) NOT NULL,
	apellidos varchar(70) NOT NULL,
	telefono int NOT NULL,
    categoria int default 1,
    equipo int default null,
    primary key (id_trabajador),
    constraint fk_equipo_trabajador foreign key (equipo) references equipo(id_equipo) on delete set null,
    constraint fk_puesto_trabajador foreign key (categoria) references categoria(id_categoria) on delete set null
);

create table if not exists usuario (
	id_trabajador int NOT NULL,
    alias varchar(30) NOT NULL,
    contrasena varchar(30) NOT NULL,
    constraint fk_trabajador_coordinador foreign key (id_trabajador) references trabajador(id_trabajador) on delete cascade
);

create table if not exists operario (
	id_operario int NOT NULL,
    p1 boolean default false,
    p2 boolean default false,
    p3 boolean default false,
    p4 boolean default false,
    p5 boolean default false,
    constraint fk_trabajador_operario foreign key (id_operario) references trabajador(id_trabajador) on delete cascade
);

create table if not exists rotacion (
	id_rotacion int NOT NULL auto_increment,
    num_rotacion int NOT NULL,
    id_equipo int NOT NULL,
	fecha date NOT NULL,
    coordinador int NOT NULL,
    p1 int NOT NULL,
    p2 int NOT NULL,
    p3 int NOT NULL,
    p4 int NOT NULL,
    p5 int NOT NULL,
    primary key (id_rotacion),
    constraint fk_equipo_rotacion foreign key (id_equipo) references equipo(id_equipo) on delete cascade,
	constraint fk_coordinador_rotacion foreign key (coordinador) references trabajador(id_trabajador) on delete cascade
);

ALTER TABLE operario
ADD CONSTRAINT u_operario UNIQUE (id_operario);

ALTER TABLE usuario
ADD CONSTRAINT u_usuario UNIQUE (id_trabajador);

/*INSERTS*/

INSERT INTO equipo (nombre_equipo) VALUES
('A01'),
('A02');

INSERT INTO categoria (nombre_categoria) VALUES
('Operario'),
('Coordinador');

INSERT INTO trabajador (num_trabajador,nombre,apellidos,telefono,categoria,equipo) VALUES
(100,'Hector','Martinez San Jose',976424242,2,1),
(101,'Victor','Caceres Gimenez',976383838,1,1),
(102,'Violeta','Ramirez Ramos',976232323,1,1),
(103,'Cristina','Garcia Olivera',976414141,1,1),
(104,'Raul','Pasamar Mata',976121212,1,1),
(105,'Marcos','Gurria Mata',976131313,1,1),
(106,'Patricia','Sierra Anso',976676767,2,2);

INSERT INTO usuario (id_trabajador,alias,contrasena) VALUES
(1,'chechu','1234');

INSERT INTO operario (id_operario,p1,p2,p3,p4,p5) VALUES
(2,true,true,true,false,false),
(3,false,true,true,true,false),
(4,false,false,true,true,true),
(5,true,false,false,true,true),
(6,true,true,false,false,true);



