-- Paimame visų prekių id
SELECT id
FROM preke;

-- Paimame visų prekių pavadinimus
select pavadinimas
from preke;


-- Paimame visų prekių pavadinimą, kainą ir kiekį
select pavadinimas, kaina, kiekis_sandelyje
from preke;

-- Paimame visų prekių visus stulpelius (juos išvardinant)
select id, pavadinimas, kiekis_sandelyje, kategorija, kaina
from preke;

-- Paimame visų prekių visus stulpelius (naudojant universalų operatorių (*))
select *
from preke;

-- -------- Where pavyzdžiai ----------
-- Visus stulpelius, prekės, kurios id yra 3
select *
from preke
where id = 3;

-- Kainą ir kiekį, prekės, kurios pavadinimas yra 'Kėdė'
select kaina, kiekis_sandelyje
from preke
where pavadinimas = 'Kėdė';

-- Visus stuleplius, prekių, kurių kaina yra didesnė už 100
select *
from preke
where kaina > 100;

-- Pavadinimą ir kategoriją, prekių, kurių kategorija yra 'baldai'
select pavadinimas, kategorija
from preke
where kategorija = 'baldai';