-- Darbuotojo lentelė
create table darbuotojai (
	id int unsigned not null auto_increment,
    darbuotojo_nr varchar(7) not null unique,
    vardas_pavarde varchar(100) not null,
    primary key(id)
) engine = innodb;

-- Darbuotojų lentelės duomenys
INSERT INTO darbuotojai(id, darbuotojo_nr, vardas_pavarde) 
VALUES 
(null, 'S1011', 'Tony Smith'),
(null, 'S1032', 'Robin Plevin'),
(null, 'S1024', 'Helen Pearson');

-- Operacijų lentelę
create table operacijos (
	id int unsigned not null auto_increment,
    operacijos_nr varchar(5) not null,
    pavadinimas varchar(100) not null,
    primary key(id)
) engine = innodb;

-- Operacijų duomenys


-- Adresų lentelė
create table adresai (
	id int unsigned not null auto_increment,
    pasto_kodas varchar(10) not null,
    miestas varchar(100) not null,
    gatve varchar(100) not null,
    namo_nr int not null,
    buto_nr int,
    primary key(id)
) engine = innodb;

-- ADresų duomenys
insert into adresai(id, pasto_kodas, miestas, gatve, namo_nr, buto_nr)
values
(null, 'LT-70535', 'Kaunas', 'A. Juozapavičiaus pr.', 147, 6),
(null, 'LT-73528', 'Kaunas', 'Savanorių pr.', 132, 11);

-- Paciento lentelę
create table pacientai (
	id int unsigned not null auto_increment,
    paciento_nr varchar(10) not null unique,
    vardas_pavarde varchar(100) not null,
    adreso_id int unsigned not null,
    primary key(id),
    foreign key(adreso_id) references adresai(id)
) engine = innodb;


-- Paciento duomenys
insert into pacientai (id, paciento_nr, vardas_pavarde, adreso_id)
VALUES
(null, 'P105', 'Jill Bell', 2)



-- Operacijų rezervacijų lentelė
create table operaciju_rezervacijos (
    id int unsigned not null auto_increment,
    darbuotojo_id int unsigned not null,
    paciento_id int unsigned not null,
    operacijos_id int unsigned not null,
    data datetime not null,
    primary key(id),
    foreign key(darbuotojo_id) references darbuotojai(id),
    foreign key(paciento_id) references pacientai(id),
    foreign key(operacijos_id) references operacijos(id)
) engine = innodb;