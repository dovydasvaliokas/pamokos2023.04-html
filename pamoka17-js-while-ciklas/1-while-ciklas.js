window.onload = function() {
    isvestiNuoVienetoIkiDesimt();
    isvestiBruksniukus();
    isvestiNuoIki(17, 30);

    let tekstas = "ATVRKA1925";
    console.log(`${tekstas} pakeistas, kur būtų tik pradinės raidės: ${grazintiTikRaides(tekstas)}`);
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