-- atnaujinu VISŲ prekių kategoriją į 'elektronika'
update preke
set kategorija = 'elektronika';

-- atnaujinu VISŲ prekių kategoriją į 'baldai'
update preke
set kategorija = 'baldai';

-- atnaujinu prekės, kurios id yra 3, kategoriją į 'elektronika'
update preke
set kategorija = 'elektronika'
where id = 3;


-- atnaujinu antros prekės kiekį į 0 ir kainą į null
update preke
set kiekis_sandelyje = 0, kaina = null
where id = 2;

