// Pagrindinė funkcija
window.onload = function() {
    let amzius = +prompt("Įveskite amžių");
    let arMokslPazymejimasZodis = prompt("Ar turite moksleivio pažymėjimą? (taip / ne)");
    let arTuriPazymejima = patikrintiIvedima(arMokslPazymejimasZodis);

     alert("Jūsų bilieto kaina yra: " + apskaiciuotiBilietoKaina(amzius, arTuriPazymejima));
}

// Papildomos funkcijos
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


function patikrintiIvedima(zodis) {
    if (zodis == "taip") {
        return true;
    }
    else {
        return false;
    }
}
