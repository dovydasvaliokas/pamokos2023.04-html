window.onload = function() {
    const prekes = sugeneruotiPrekes();
    isvestiPrekesIConsole(prekes);

    const perkamosPrekes = apsipirkti(prekes);
    console.clear();
    console.log("Apsipirkimas baigtas. Jūsų krepšelis: ");
    isvestiPrekesIConsole(perkamosPrekes);

}


function apsipirkti(prekes) {
    const perkamosPrekes = [];
    let arTesti;
    do {
        pridetiPrekeIPrekiuKrepseli(prekes, perkamosPrekes);
        arTesti = prompt(`Jeigu norite dar kažką pirkti, įveskite "taip", jeigu jau nenorite pirkti, įveskite "ne"`);
        console.clear();
        console.log("Jūsų prekės:");
        isvestiPrekesIConsole(perkamosPrekes);
        console.log("Visos prekės:");
        isvestiPrekesIConsole(prekes);
    } while (arTesti.toLocaleLowerCase() == "taip");
    return perkamosPrekes;
}

// 
function pridetiPrekeIPrekiuKrepseli(prekes, perkamosPrekes) {
    let perkamosId = +prompt("Įveskite prekės ID, kurią norite pridėti į krepšelį");
    let perkamasKiekis = +prompt("Įveskite kiek norite tos prekės vienetų");
    for (let i = 0; i < prekes.length; i++) {
        if (prekes[i].id == perkamosId) {
            if (prekes[i].kiekisSandelyje >= perkamasKiekis) {
                let perkamaPreke = Object.assign({}, prekes[i]);
                perkamaPreke.kiekisSandelyje = perkamasKiekis;
                perkamosPrekes.push(perkamaPreke);
                prekes[i].kiekisSandelyje -= perkamasKiekis;
            }
            else {
                alert("Per didelis kiekis, tiek sandėlyje nėra.");
            }  
        }
    }
}

function isvestiPrekesIConsole(prekes) {
    let suformatuotosPrekes = "";
    for (let i = 0; i < prekes.length; i++) {
        let prekesPrierasas = `----------Prekė ${i}-----------------\n`;
        let prekeSuformatuota = `Prekės ID: ${prekes[i].id}\nPrekės pavadinimas: ${prekes[i].pavadinimas}\nPrekės kaina: ${prekes[i].kaina}\nPrekės kategorija: ${prekes[i].kategorija}\nPrekės kiekis sandėlyje: ${prekes[i].kiekisSandelyje}\nPrekės nuolaida: ${prekes[i].nuolaida}%\n`;
        suformatuotosPrekes += prekesPrierasas + prekeSuformatuota;
    }
    console.log(suformatuotosPrekes);
}


function sugeneruotiPrekes() {
    let preke1 = {id: 1, pavadinimas:"Kėdė", kaina:17.99, kategorija:"baldai", kiekisSandelyje:18, nuolaida: 0};
    let preke2 = {id: 2, pavadinimas:"Stalas", kaina:170.99, kategorija:"baldai", kiekisSandelyje:2, nuolaida: 0};
    let preke3 = {id: 3, pavadinimas:"Spinta", kaina:56.99, kategorija:"baldai", kiekisSandelyje:20, nuolaida: 0};
    let preke4 = {id: 589, pavadinimas:"Laptopas", kaina:1719.99, kategorija:"elektronika", kiekisSandelyje:180, nuolaida: 0};
    let preke5 = {id: 147, pavadinimas:"Klaviatūra", kaina:17.99, kategorija:"elektronika", kiekisSandelyje:11, nuolaida: 0};
    let preke6 = {id: 133, pavadinimas:"Mikrafonas", kaina:79.99, kategorija:"elektronika", kiekisSandelyje:1, nuolaida: 0};
    let preke7 = {id: 120, pavadinimas:"Vanduo x6 pakuotė", kaina:4.99, kategorija:"maistas", kiekisSandelyje:0, nuolaida: 0};

    const prekes = [];
    prekes.push(preke1);
    prekes.push(preke2);
    prekes.push(preke3);
    prekes.push(preke4);
    prekes.push(preke5);
    prekes.push(preke6);
    prekes.push(preke7);

    return prekes;
}