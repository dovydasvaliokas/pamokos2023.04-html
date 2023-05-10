// Pagrindinė funkcija
window.onload = function() {
    let amzius = +prompt("Įveskite amžių");
    let arMokslPazymejimasZodis = prompt("Ar turite moksleivio pažymėjimą? (taip / ne)");
    let arTuriPazymejima = patikrintiIvedima(arMokslPazymejimasZodis);

     alert("Jūsų bilieto kaina yra: " + apskaiciuotiBilietoKaina(amzius, arTuriPazymejima));
}

// Papildomos funkcijos
/**
 * Funkcija apskaičiuoja bilieto kainą. Bilietas kainuoja 7 eurus, jeigu klientas yra jaunesnis nei 19 IR turi pažymėjimą
 * Bilietas kainuoja 10 eurų, jeigu klientas jaunesnis nei 19, BET NETURI pažymėjimo
 * Bilietas kainuoja 15 eurų, jeigu klientas yra vyresnis nei 18
 * @param {*} amzius kliento amžis
 * @param {*} arTuriMokslPazymejima ar turi moksleivio pažymėjimą
 * @returns apskaičiuotą bilieto kainą eurais
 */
function apskaiciuotiBilietoKaina(amzius, arTuriMokslPazymejima) {
    let kaina;
    if (amzius <= 18) {
        if (arTuriMokslPazymejima) {
            kaina = 7;
        }
        else {
            kaina = 10;
        }
    }
    else {
        kaina = 15;
    }
    return kaina;
}

/**
 * Funkcija konvertuoja "taip" ir "ne" žodines reikšmes į boolean true ir fontVariantAlternates: 
 * Ją naudojame, jog iš nuskaitymo įvestus žodžius "taip" arba "ne" paverstume į boolean reikšmes
 * @param {*} zodis tikrinamas žodis
 * @returns Jeigu gauna "taip" tai grąžina true, jeigu gauna "ne" arba kokią kitą reikšmę, grąžina false
 */
function patikrintiIvedima(zodis) {
    if (zodis == "taip") {
        return true;
    }
    else {
        return false;
    }
}
