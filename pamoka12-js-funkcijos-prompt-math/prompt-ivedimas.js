window.onload = function() {
    // Susikuriu kintamąjį ir į jį išsaugau ką įveda/nuskaito prompt funkcija. Tada tą kintamąjį išvedu į konsolę.
    let x;
    x = prompt("Įveskite X", 0)         // išves žinutę "Įveskite X", o jeigu nieko neįves, tai x bus 0
    console.log(x);

    // Antrą funkcijos argumentą galima praleisti, tiesiog į tą įvedimo laukelį nebus įrašytas default value
    // Taip pat galima iš karto kuriant kintamąjį į jį saugoti
    let y = prompt("Įveskite Y");
    console.log(y);

    // Panaudojame įvedimą (prompt), kad apskaičiuotų kvadratą skaičiaus (mūsų sukurta funkcija)
    let sk1 = prompt("Įveskite skaičių, kurį norite pakelti kvadratu");
    let sk1Kvadratas = pakeltiKvadratu(sk1);
    alert("Skaičiaus " + sk1 + " kvadratas yra: " + sk1Kvadratas);

    // Galima naudoti prompt iš karto irgi kaip reikšmę kitose funkcijose, bet su šituo jau reikėtų atsargiau
    console.log(prompt("Įveskite skaičių, kurį ne saugos, o iš kart išves į konsolę"));
}

function pakeltiKvadratu(a) {
    return a * a;
}