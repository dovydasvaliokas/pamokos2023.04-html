// Pagrindinė funkcija
window.onload = function() {
    // Su tekstu nuskaitymas yra paprastai
    let tekstas = prompt("Įveskite tekstą");
    isvestiTekstaDuKartus(tekstas);

    // Jeigu norime nuskaityti skaičių. Reikia pirma nuskaityti jį kaip tekstą (kaip viršuje), o po to konvertuoti į skaičių
    // Sveikųjų skaičių konvertavimas
    let sk1 = prompt("Įveskite skaičių");
    sk1 = parseInt(sk1);
    console.log(sk1 + sk1);

    // Jeigu norime konvertuoti į skaičių su kableliu, naudojame parseFloat
    let sk2 = prompt("Įveskite skaičių (gali būti ir su trupmenine dalimi)");
    sk2 = parseFloat(sk2);
    console.log(sk2 + sk2);

    // JavaScripte galima konvertavimą padaryti trumpiau
    let sk3 = +prompt("Įveskite skaičių");
    console.log(sk3 + sk3);

}

// Papildomos funkcijos
function isvestiTekstaDuKartus(zodis) {
    console.log(zodis);
    console.log(zodis);
}

