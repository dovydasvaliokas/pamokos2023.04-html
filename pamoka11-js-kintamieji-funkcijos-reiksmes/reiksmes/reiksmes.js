window.onload = function() {
    // SKAITINIŲ reikšmių išvedimas
    console.log(25 + 30);
    console.log(24 + 10 - 2 * 4);
    console.log((24 + 10 - 2) * 4);

    console.log("Čia yra kažkoks tekstas");
    console.log("25 + 30");     // išves 25 + 30, o ne 55
    // Galima tekstus ir sudėti
    console.log("Pirma teksto dalis" + "Antra teksto dalis");       // sudedu du tekstus
    console.log("Pirmas" + " " + "Antras");     // sudedu tris tekstus (vienas iš jų tiesiog tarpas)
    console.log("Skaičius: " + "2");

    console.log("tekstas" - "kitas tekstas");       // išveda NaN (Not a Number), nes bandome atlikti aritmenius veiksmus ne skaičiams
    console.log("tekstas" * 3);         // irgi išves NaN
    
    // Jeigu sudėtume du tekstus, kuriuose tik skaičiai
    console.log("25" + "30");           // gausis 2530, nes juos sudeda kaip tekstą, o ne skaičius

    // Jeigu sudėsime skaičių prie teksto (tai tiesiog gausis kaip dviejų tekstų sudėjimas)
    console.log(25 + "30");     // gausis 2530
    console.log("Laimingas skaičius yra: " + 7);

    // Jeigu pirmiau sudedame kaip skaičius o po to kaip tekstą, tai kiekvienas operatorius yra vertinamas atskirai
    console.log(25 + 30 + "77");
}