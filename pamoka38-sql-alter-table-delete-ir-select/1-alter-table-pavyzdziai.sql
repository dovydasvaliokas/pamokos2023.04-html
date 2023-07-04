-- Susikuriu prekė lentelę su trim klaidomis
CREATE TABLE preke(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    pavadinimas INT UNSIGNED NOT NULL, -- šis stulpelis yra blogas, jį po to tvarkysime su alter table modify column komanda
    -- kaina yra tyčia praleidžiama, ją vėlgi įdėsime toliau su alter table add column komanda
    kiekis_sandelyje INT UNSIGNED NOT NULL,
    kategorija VARCHAR(100) NOT NULL,
    spalva VARCHAR(50), -- įdedu spalvos stulpelį, bet jį ištrinsime po to naudodami alter table drop column
    PRIMARY KEY(id)
);

-- Pataisau pirmą klaidą - pavadinimas stulpelį pakeičiu į varchar
ALTER TABLE preke 
MODIFY COLUMN pavadinimas VARCHAR(200) NOT NULL;

-- Pataisau antrą klaidą - pridedu kainos stulpelį
ALTER TABLE preke 
ADD kaina DECIMAL(10, 2) UNSIGNED;

-- Pataisau trečią klaidą - ištrinu spalvos stulpelį
ALTER TABLE preke
DROP COLUMN spalva;

-- Papildomas pataisymas - kiekiui padarome default 0
alter table preke
modify column kiekis_sandelyje int unsigned not null default 0;