window.onload = function() {
    let pradzia = +prompt("Įveskite nuo kurio skaičio pradėti");
    let pabaiga = +prompt("Įveskite iki kurio skaičiaus daryti");
    alert("Skaičių intervalas: " + sudetiSkaiciuIntervalaEiluteje(pradzia, pabaiga));


    let raide = prompt("Įveskite ieškomą raidę");
    let zodis = prompt(`Įveskite tekstą, kuriame ieškosite kiek yra ${raide} raidžių.`);
    alert(`Tekste: "${zodis}" raidžių "${raide}" kiekis yra: ${rastiKiekYraIeskomuSimboliuTekste(zodis, raide)}`);

}

function sudetiSkaiciuIntervalaEiluteje(pradzia, pabaiga) {
    let tekstas = "";
    for (let i = pradzia; i <= pabaiga; i++) {
        // if (pabaiga - i == 0) {
        //     tekstas += i;
        // }
        // else {
        //     tekstas += i + ", ";
        // }
        // Virsuje vienas variantas kaip neisvest kablelio ant paskutinio skaiciaus.
        tekstas += i + ", ";
    }
    tekstas = tekstas.slice(0, tekstas.length - 2);
    return tekstas;
}


function rastiKiekYraIeskomuSimboliuTekste(tekstas, ieskomasSimbolis) {
    let kiekis = 0;
    for (let i = 0; i < tekstas.length; i++) {
        if (tekstas[i] == ieskomasSimbolis) {
            kiekis++;
        }
    }
    return kiekis;
}