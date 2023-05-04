window.onload = function() {
    // Return funkcijos panaudojimas su kintamaisiais ir išvedam kintamąjį, į kurį saugome funkcijos grąžinamą rezultatą
    let x = 5;
    let xKvadratas = pakeltiKvadratu(x);
    console.log(xKvadratas);

    // Išvedame iš karto funkcijos rezultatą į konsolę
    console.log(pakeltiKvadratu(x));

    // Išvedame iš karto funkciją su suformatuotu tekstu
    console.log("Skaičiaus " + x + " kvadratas yra: " + pakeltiKvadratu(x));

    // Galima funkcijai ir paduoti (aritmetinį) veiksmą kaip argumentą
    let y = 10;
    let sumosKvadratas = pakeltiKvadratu(x + y);
    console.log(sumosKvadratas);

    // Galima ir viršutinį variantą sutrumpinti iš karto išvedant tos funkcijos rezultatą
    console.log(pakeltiKvadratu(x + y));


    // Galima naudoti funkcijų rezultatus paduodant juos kaip argumentą kitai funkcijai
    let kvadratuSumosKvadratas = pakeltiKvadratu(pakeltiKvadratu(x) + pakeltiKvadratu(y));
    console.log(kvadratuSumosKvadratas);

    // Panaudojam antrą funkciją, kurios viduje (apibrėžime) yra naudojama pirmoji funkcija
    console.log(kvadratuSuma(x, y));
    console.log(kvadratuSuma(3, 8));

    // Panaudojame void funkciją
    isvestiBruksniukus();

    // Panaudojame funkciją su parametrais (įdedame argumentą)
    isvestiZodiTrisKartus("Ketvirtadienis");

    isvestiBruksniukus();
    let tekstas = "Čia yra kažkoks tekstas";
    isvestiZodiTrisKartus(tekstas);
    isvestiBruksniukus();

    // VOID FUNKCIJŲ NEGALIMA PRISKIRTI KAIP REIKŠMIŲ KINTAMIESIEMS
    let tekstasTrisKartus = isvestiZodiTrisKartus(tekstas);             // NORS IR IŠVEDA, BET TOKS VARIANTAS YRA BLOGAS
    isvestiBruksniukus();

    // VOID FUNKCIJŲ NEGALIME IR NAUDOTI KAIP REIKŠMIŲ, T.Y. VOID FUNKCIJŲ NEGALIMA PADUOTI KAIP ARGUMENTO Į KITAS FUNKCIJAS
    console.log(isvestiZodiTrisKartus(tekstas));

    // Panaudoju funkciją, kuri padvigubiną žodį su atskirtu tarpu
    isvestiBruksniukus();
    console.log(padvigubintiZodi("namas"));

    // Return funkcijas privaloma naudoti kaip reikšmes, jeigu ją naudosiu kaip void - nieko neįvyks
    padvigubintiZodi("katė");       // tai nieko neišves, nes tai yra paprasčiausia tekstinė reikšmė, ją reikėtų kažkur panaudoti, tarkim kad ir console.log'e
}

// Papildomos funkcijos
function pakeltiKvadratu(a) {
    return a * a;
}

function kvadratuSuma(a, b) {
    return pakeltiKvadratu(a) + pakeltiKvadratu(b);
}

// Void funkcija, kuri nieko negrąžina, o tik atlieka veiksmus
function isvestiBruksniukus() {
    console.log("-----------");
}

// Void funkcija su parametrais
function isvestiZodiTrisKartus(zodis) {
    console.log(zodis);
    console.log(zodis);
    console.log(zodis);
}

function padvigubintiZodi(zodis) {
    return zodis + " " + zodis;
}