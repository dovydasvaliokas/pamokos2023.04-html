-- ištrinu VISAS prekes
delete from preke;

-- ištrinu penktą prekę
delete from preke where id = 5;

-- ištrinu visas prekes, kurių kiekis sandėlyje yra 0
delete from preke where kiekis_sandelyje = 0;