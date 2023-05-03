window.onload = function() {
    // 1 funkcijos iškvietimo (panaudojimo) Variantas
    // Naudojame funkciją su skaičiais kaip argumentais
    // Funkcijos rezultatą saugojame kintamajame
    // Tą kintamąjį išvedame į konsolę
    let rezultatas1 = dvigubaSuma(10, 5);
    console.log(rezultatas1);

    // 2 funkcijos iškvietimo (panaudojimo) variantas
    // Susikuriame x ir y kintamuosius, jiems priskiru reikšmes
    // Panaudojame funkciją su šiais kintamaisiais ir išsaugome rezultatą trečiame kintamajame
    // Ir tą trečia kintamąjį išvedu į konsolę
    let x = 20;
    let y = 40;
    let rezultatas2 = dvigubaSuma(x, y);
    console.log(rezultatas2);

    // Grąžesnis išvedimas
    console.log("Suma tarp " + x + " ir " + y + " yra: " + rezultatas2);
}

// Papildomos funkcijos
function dvigubaSuma(a, b) {
    return 2 * (a + b);
}