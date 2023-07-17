-- visų užsakymų duomenys su klientų duomenimis
select u.*, k.pavadinimas, k.valstija 
from uzsakymai u 
join klientai k on u.kliento_id = k.id;

-- visų užsakymų duomenys su produktų duomenimis
select *
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id


-- 1008 užsakymo prekių duomenys surikiuoti pagal prekės kainą
select u.id as uzsakymo_id, p.id as produkto_id, p.pavadinimas, p.kaina, up.kiekis
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
where u.id = 1008
order by p.kaina asc;

-- 1008 užsakymo prekių duomenys surikiuoti paal bendrą prekių kainą, t.y. kaina * kiekis
select u.id as uzsakymo_id, p.id as produkto_id, p.pavadinimas, p.kaina, up.kiekis, p.kaina * up.kiekis as bendra_kaina
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
where u.id = 1008
order by p.kaina * up.kiekis asc;

-- 1008 užsakymo prekių duomenys, surikiuoti pagal bendrą kainą ir dar plius klientuo duomenys pridėti
select u.id as uzsakymo_id, p.id as produkto_id, p.pavadinimas, p.kaina, up.kiekis, p.kaina * up.kiekis as bendra_kaina, k.id as kliento_id, k.pavadinimas
from uzsakymai u
join uzsakymo_produktai up on u.id = up.uzsakymo_id
join produktai p on up.produkto_id = p.id
join klientai k on u.kliento_id = k.id
where u.id = 1008
order by p.kaina * up.kiekis asc;