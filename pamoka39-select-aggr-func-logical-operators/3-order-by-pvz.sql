-- Paimame visas knygas surikiuotas pagal pavadinimą abėcėlės tvarka
select *
from knygos
order by pavadinimas asc;

-- Paimame visas knygas surikiuotas pagal metus, o jei metai tokie patys, tai tada pagal pavadinimą abėcėlės tvarka
select *
from knygos
order by metai, pavadinimas asc;

-- Paimame visas knygas surikiuotas pagal metus didėjimo tvarka, o jei tokie patys, tai pagal pavadinimą prieš abėcėlę (mažėjimo tvarka)
select *
from knygos
order by metai asc, pavadinimas desc;

-- Paimame knygas, kurių įvertinimas yra daugiau nei 3.5 ir tada jas surikiuojame pagal metus didėjančia tvarka, o jei tokie patys metai pagal puslapių skaičių mažėjimo tvarka
select *
from knygos
where ivertinimas > 3.5
order by metai asc, psl_skaicius desc;

-- grąžiname tik penkias knygas iš visų
select *
from knygos
limit 5;

-- grąžiname vieną bet kurią 'Random House' leidėjo knygą.
select *
from knygos
where leidejas = 'Random House'
limit 1;

-- Grąžiname leidėjo 'Random House' geriausiai įvertintą knygą.
select *
from knygos
where leidejas = 'Random House'
order by ivertinimas desc
limit 1;

