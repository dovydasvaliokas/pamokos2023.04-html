window.onload = function() {
    isvestiNuoVienetoIkiDesimt();
    isvestiBruksniukus();
    isvestiNuoIki(17, 30);

    let tekstas = "ATVRKA1925";
    console.log(`${tekstas} pakeistas, kur būtų tik pradinės raidės: ${grazintiTikRaides(tekstas)}`);
    let tekstas2 = "BETKASBEasdasdasKAS16165165";
    console.log(`${tekstas2} pakeistas, kur būtų tik pradinės raidės: ${grazintiTikRaides(tekstas2)}`);

    let sk1 = 213;
    console.log(`${sk1} skaitmenų suma yra: ${skaitmenuSuma(sk1)}`);

    patikrintiAritmetiniVeiksma();
}

// Papildomos funkcijos
function isvestiNuoVienetoIkiDesimt() {
    let i = 0;
    while (i < 10) {
        console.log(i);
        i++;
    }
}

function isvestiNuoIki(pradzia, pabaiga) {
    while (pradzia <= pabaiga) {
        console.log(pradzia);
        pradzia++;
    }
}

function isvestiBruksniukus() {
    console.log("-------------");
}

function grazintiTikRaides(tekstas) {
    let i = 0;
    let tikRaides = "";
    while (!"0123456789".includes(tekstas[i])) {
        tikRaides += tekstas[i];
        i++;
    }
    return tikRaides;
}

function skaitmenuSuma(skaicius) {
    let suma = 0;
    while (skaicius > 0) {
        let skaitmuo = skaicius % 10;
        suma += skaitmuo;
        skaicius /= 10;
        skaicius = Math.floor(skaicius);
    }
    return suma;
}


function patikrintiAritmetiniVeiksma() {
    let x = 5;
    let y = 10
    let atsakymas = +prompt(`Kiek yra ${x} + ${y}`);

    while (atsakymas != x + y) {
        atsakymas = +prompt(`Kiek yra ${x} + ${y}`);
    }
    alert("Teisingai!");
}
