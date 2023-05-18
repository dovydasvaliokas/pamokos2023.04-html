window.onload = function() {
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

    console.log(prekes);
    // grazintiPigesnesNeiX(prekes, 18);
    // console.log("Po kainos filtravimo: ");
    // console.log(prekes);
    console.log("Pagal kainą:");
    const filtrPrekes = filtruotiPigesneNeiX(prekes, 60);
    console.log(filtrPrekes);

    console.log("Pagal kategoriją:");
    const filtrPagalKategorija = filtruotiPagalKategorija(prekes, "elektronika");
    console.log(filtrPagalKategorija);

}

function grazintiPigesnesNeiX(prekes, x) {
    for (let i = 0; i < prekes.length; i++) {
        if (prekes[i].kaina > x) {
            prekes.splice(i, 1);
            i--;
        }
    }
}

function filtruotiPigesneNeiX(prekes, x) {
    const prafiltruotosPrekes = [];
    for (let i = 0; i < prekes.length; i++) {
        if (prekes[i].kaina < x) {
            prafiltruotosPrekes.push(prekes[i]);
        }  
    }
    return prafiltruotosPrekes;
}

function filtruotiPagalKategorija(prekes, kategorija) {
    const prafiltruotosPrekes = [];
    for (let i = 0; i < prekes.length; i++) {
        if (prekes[i].kategorija == kategorija) {
            prafiltruotosPrekes.push(prekes[i]);
        }
    }
    return prafiltruotosPrekes;
}