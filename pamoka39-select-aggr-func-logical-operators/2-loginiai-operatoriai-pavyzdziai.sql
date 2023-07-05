-- Paimame knygų leidėjus (tačiau duplikatų negrąžina su distinct)
select distinct leidejas
from knygos;


-- Paimame knygas, kurios yra išleistos tarp 2008 ir 2010 (imtinai)
select *
from knygos
where metai >= 2008 and metai <= 2010;

-- Paimame knygas, kurių puslapių skaičius mažesnis už 200 arba didesnis už 500 
select *
from knygos
where psl_skaicius <= 200 OR psl_skaicius >= 500;

-- Paimame knygas, kurių leidėjas NĖRA 'Penguin' (1variantas)
select *
from knygos
where leidejas != 'Penguin';

-- Paimame knygas, kurių leidėjas NĖRA 'Penguin' (2variantas)
select *
from knygos
where not leidejas = 'Penguin';

-- Paimame knygas, kurių puslapių skaičius yra didesnis už 500 ir jų leidėjas YRA 'Penguin'
select *
from knygos
where psl_skaicius > 500 and leidejas = 'Penguin';

-- Paimame knygas, kurių įvertinimas yra mažesnis nei 2 ARBA jos yra išleistos 2010 ir vėliau
select *
from knygos
where ivertinimas < 2 or metai >= 2010;

-- Paimame knygas, kurių (žanras yra data science) ARBA (jų leidėjas 'Penguin' ir puslapių skaiičus daugiau nei 500)
select *
from knygos
where (zanras = 'data science') OR (leidejas = 'Penguin' AND psl_skaicius > 500);

-- Paimame knygas, kurių (žanras yra arba data scienca arba leidėjas 'Penguin') IR (jų puslapių skaičius daugiau nei 500)
select *
from knygos
where (zanras = 'data science' OR leidejas = 'Penguin') AND (psl_skaicius > 500);