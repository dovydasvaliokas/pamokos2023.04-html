-- studentai lentele
create table studentai (
    id int unsigned not null auto_increment,
    vardas varchar(50) not null,
    primary key(id)
) engine = innodb;


-- fakultetu lentele
create table fakultetai (
    id int unsigned not null auto_increment,
    pavadinimas varchar(30),
    telefonas varchar(20),
    primary key(id)
) engine = innodb;

-- kursu lentele
create table kursai (
    id int unsigned not null auto_increment,
    kodas varchar(10) not null unique,
    pavadinimas varchar(30) not null,
    fakulteto_id int unsigned not null,
    primary key(id),
    foreign key(fakulteto_id) references fakultetai(id)
) engine = innodb;


-- studentu_kursai lentele
create table studentu_kursai (
    id int unsigned not null auto_increment,
    studento_id int unsigned not null,
    kurso_id int unsigned not null,
    sunkumas varchar(1) not null,
    primary key(id),
    foreign key(studento_id) references studentai(id),
    foreign key(kurso_id) references kursai(id)
) engine = innodb;