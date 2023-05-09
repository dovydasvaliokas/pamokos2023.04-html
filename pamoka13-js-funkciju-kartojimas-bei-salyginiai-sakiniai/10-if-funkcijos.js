// Pagrindine funkcija
window.onload = function() {
    // let x = +prompt("Įveskite pirmą skaičių");
    // let y = +prompt("Įveskite antrą skaičių");

    // palygintiSkaiciusIrIsvestiRezultata(x, y);

    // alert("X yra: " + patikrintiArTeigiamas(x));

    let klientoPajamos = +prompt("Įveskite savo pajamas, norint apskaičiuoti mokesčius");
    alert("Jūsų mokesčiai yra: " + skaiciuotiMokescius(klientoPajamos));
}

function palygintiSkaiciusIrIsvestiRezultata(a, b) {
    if (a > b) {
        alert("Pirmas skaičius yra didesnis");
    } else if (a < b) {
        alert("Antras skaičius yra didesnis");
    }
    else {
        alert("Abu yra lygūs");
    }
}

function patikrintiArTeigiamas(a) {
    let rezultatas;
    if (a > 0) {
        rezultatas = "Teigiamas";
    } else if (a < 0) {
        rezultatas = "Neigiamas";
    }
    else {
        rezultatas = "Nulis"
    }
    return rezultatas;
}

function skaiciuotiMokescius(pajamos) {
    // Jei pajamos neigiamos, mokesčiai lygu nuliui
    // Jei pajamos nuo 0 - 10 000, tai mokesčiai 10%
    // Jei pajamos nuo 10 000 - 100 000, tai mokesčiai 20%
    // Jei pajamuos > 100 000, tai mokesčiai 40%
    let mokesciai;
    if (pajamos > 100000) {
        mokesciai = pajamos * 0.4;
    } else if (pajamos > 10000) {
        mokesciai = pajamos * 0.2;
    } else if (pajamos > 0) {
        mokesciai = pajamos * 0.1;
    }
    else {
        mokesciai = 0;
    }
    return mokesciai;
}