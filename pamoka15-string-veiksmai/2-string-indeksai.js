// Pagrindinė funkcija
window.onload = function() {
    let zodis1 = prompt("Įveskite pirmą žodį:");
    alert("Ar žodžio pirma raidė yra lygi paskutinei SU AT: " + palygintiPirmaRaideSuPaskutineSuAt(zodis1));
    alert("Ar žodžio pirma raidė yra lygi paskutinei SU INDEKSU: " + palygintiPirmaRaideSuPaskutineSuIndeksu(zodis1));
}

// Papildomos funkcijos
/**
 * Funkcija palygina žodžio pirmą raidę su paskutine ar jos yra vienodos
 * Funkcija naudoja String.at() funkciją raidžių gavimui.
 * @param {*} zodis 
 * @returns grąžina true, jeigu vienodos, grąžina false, jeigu skirtingos.
 */
function palygintiPirmaRaideSuPaskutineSuAt(zodis) {
    if (zodis.at(0) == zodis.at(-1)) {
        return true;
    }
    else {
        return false;
    }
}

/**
 * Funkcija palygina žodžio pirmą raidę su paskutine ar jos yra vienodos
 * Funkcija naudoja indeksą, t.y. [] raidžių gavimui.
 * @param {*} zodis 
 * @returns grąžina true, jeigu vienodos, grąžina false, jeigu skirtingos.
 */
function palygintiPirmaRaideSuPaskutineSuIndeksu(zodis) {
    if (zodis[0] == zodis[zodis.length - 1]) {
        return true;
    }
    else {
        return false;
    }
}
