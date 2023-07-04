-- Įdedu vieną prekę
INSERT INTO preke(
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
INSERT INTO preke(
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