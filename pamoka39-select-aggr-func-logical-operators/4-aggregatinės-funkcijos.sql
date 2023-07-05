-- Grąžinu visų knygų kiekį
select count(*)
from knygos;

-- Grąžinu visų knygų, kurių įvertinimas yra didesnis už 4, kiekį.
select count(*)
from knygos
where ivertinimas > 4;

-- Apskaičiuojame visų knygų puslapių skaičių
select sum(psl_skaicius)
from knygos;

-- Apskaičiuojame 'Penguin' leidėjo knygų puslapių skaičių
select sum(psl_skaicius)
from knygos
where leidejas = 'Penguin';

-- Apskaičiuojame 3, 6 ir 76 knygų pagal id puslapių skaičių
select sum(psl_skaicius)
from knygos
where id = 3 or id = 6 or id = 76;

-- Apskaičiuojame visų knygų įvertinimo vidurkį
select avg(ivertinimas)
from knygos;

-- Apskaičiuojame knygų išleistų 2007 arba 2008 metais įvertinimų vidurkį
select avg(ivertinimas)
from knygos
where metai = 2007 or metai = 2008;