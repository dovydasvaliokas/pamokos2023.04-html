// Pagrindinė funkcija
window.onload = function() {
    let x = +prompt("Įveskite skaičių. Patikrinsime ar jis dalinasi iš 3 ir 5");
    alert("Ar dalinasi is 3 ir 5: " + arTrejetoIrPenketoKartotinis(x));

    let y = +prompt("Įveskite skaičių, kurį tikrinsit ar jis yra intervale");
    let pradzia = +prompt("Įveskite intervalo pradžią");
    let pabaiga = +prompt("Įveskite intervalo pabaigą");

    alert("Skaičius " + y + " yra intervale nuo " + pradzia + " iki " + pabaiga + ": " + arSkaiciusPriklausoIntervalui(y, pradzia, pabaiga));
}

/**
 * Funkcija naudojant AND operatorių patikrina ar skaičius dalinasi iš trijų ir iš penkių
 * @param {*} skaicius tikrinamas skaičius
 * @returns true, jeigu dalinasi iš trijų ir penkių; false, jeigu nesidalina
 */
function arTrejetoIrPenketoKartotinis(skaicius) {
    return skaicius % 5 == 0 && skaicius % 3 == 0;
}

/**
 * Funkcija patikrina ar skaičius yra intervale. Skaičių bei intervalą funkcija gauna per parametrus
 * @param {*} skaicius tikrinamas skaičius
 * @param {*} intervaloPradzia intervalo pradžia
 * @param {*} intervaloPabaiga intervalo pabaiga
 * @returns 
 */
function arSkaiciusPriklausoIntervalui(skaicius, intervaloPradzia, intervaloPabaiga) {
    return skaicius > intervaloPradzia && skaicius < intervaloPabaiga;
}
