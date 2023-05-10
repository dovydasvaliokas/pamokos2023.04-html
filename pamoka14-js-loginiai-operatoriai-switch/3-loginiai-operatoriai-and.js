// Pagrindinė funkcija
window.onload = function() {
    let x = +prompt("Įveskite skaičių. Patikrinsime ar jis dalinasi iš 3 ir 5");
    alert("Ar dalinasi is 3 ir 5: " + arTrejetoIrPenketoKartotinis(x));

    let y = +prompt("Įveskite skaičių, kurį tikrinsit ar jis yra intervale");
    let pradzia = +prompt("Įveskite intervalo pradžią");
    let pabaiga = +prompt("Įveskite intervalo pabaigą");

    alert("Skaičius " + y + " yra intervale nuo " + pradzia + " iki " + pabaiga + ": " + arSkaiciusPriklausoIntervalui(y, pradzia, pabaiga));
}

function arTrejetoIrPenketoKartotinis(skaicius) {
    return skaicius % 5 == 0 && skaicius % 3 == 0;
}


function arSkaiciusPriklausoIntervalui(skaicius, intervaloPradzia, intervaloPabaiga) {
    return skaicius > intervaloPradzia && skaicius < intervaloPabaiga;
}
