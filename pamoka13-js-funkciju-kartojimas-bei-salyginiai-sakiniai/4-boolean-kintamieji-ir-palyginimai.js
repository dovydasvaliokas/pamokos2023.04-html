// Pagrindinė funkcija
window.onload = function() {
    // Booleano reikšmės
    let b1 = true;
    let b2 = false;
    console.log(b1);
    console.log(b2);
    console.log(true);
    isvestiBruksniukus();

    //------- Palyginimai
    // Daugiau operatorius >
    console.log(5 > 3);     // true
    console.log(2 > 8);     // false
    isvestiBruksniukus();

    // Mažiau operatorius <
    console.log(5 < 3);     // false
    console.log(2 < 8);     // true
    isvestiBruksniukus();

    // Lyginti operatorius ==
    console.log(5 == 3);        // false
    console.log(17 == 17);      // true
    isvestiBruksniukus();

    // Daugiau arba lygu operatorius >=
    console.log(5 >= 3);        // true
    console.log(5 >= 5);        // true
    console.log(5 >= 12);       // false
    isvestiBruksniukus();

    // Mažiau arba lygu operatorius <=
    console.log(5 <= 3);        // false
    console.log(5 <= 5);        // true
    console.log(5 <= 12);       // true
    isvestiBruksniukus();

    // Nelygu operatorius !=
    console.log(5 != 3);        // true
    console.log(5 != 5);        // false
    console.log(5 != 10);       // true
    isvestiBruksniukus();
}

// Papildomos funkcijos
function isvestiBruksniukus() {
    console.log("--------------");
}
