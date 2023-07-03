-- Sukuriama prekės lentelė
create table prekes (
    id int unsigned zerofill not null auto_increment,
    pavadinimas varchar(200) not null,
    kaina decimal(10,2) unsigned,
    kiekis_sandelyje int unsigned not null default 0,
    kategorija varchar(100),
    primary key(id)
);

-- Įdedu vieną prekę
INSERT INTO prekes(
    id,
    pavadinimas,
    kaina,
    kiekis_sandelyje,
    kategorija
)
VALUES(
    null,
    'Kėdė',
    59.99,
    23,
    'baldai'
);

-- Įdedu iš karto tris prekes
INSERT INTO prekes(
    id,
    pavadinimas,
    kaina,
    kiekis_sandelyje,
    kategorija
)
VALUES(
    NULL,
    'Stalas',
    179.99,
    2,
    'baldai'
),(
    NULL,
    'Kompiuteris',
    1596.99,
    0,
    'elektronika'
),(
    NULL,
    'Spinta',
    96.99,
    14,
    'baldai'
);