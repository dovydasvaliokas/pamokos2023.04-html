// Pagrindinė funkcija
window.onload = function() {
    let amzius = +prompt("Įveskite amžių");
    let arTuriPensininkoPazymejimaZodis = prompt("Ar turite pensininko pažymėjimą (taip / ne)");
    let arTuriPazymejima = patikrintiIvedima(arTuriPensininkoPazymejimaZodis);
    alert("Jūsų bilieto kaina yra: " + skaiciuotiBilietoKaina(amzius, arTuriPazymejima));

    let sk = +prompt("Įveskite skaičių");
    patikrinaArLyginisArbaTrejetoIrPenketoKartotinis
}

function skaiciuotiBilietoKaina(amzius, arTuriPensPazymejima) {
    if (amzius <= 18 || arTuriPensPazymejima) {
        return 5;
    }
    else {
        return 10;
    }
}

function patikrintiIvedima(zodis) {
    if (zodis == "taip") {
        return true;
    }
    else {
        return false;
    }
}


function patikrinaArLyginisArbaTrejetoIrPenketoKartotinis(skaicius) {
    if (skaicius % 2 == 0 || (skaicius % 3 == 0 && skaicius % 5 == 0)) {
        alert("Skaičius yra arba lyginis arba dalinasi iš 3 ir 5");
    }
    else {
        alert("Nei lyginis, nei dalinasi iš 3 ir 5.")
    }
}
