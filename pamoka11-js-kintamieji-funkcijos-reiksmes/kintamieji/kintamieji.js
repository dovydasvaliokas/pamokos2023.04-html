window.onload = function () {
    let x;      // sukuriu kintamąjį
    x = 25;     // su = operatorium priskiriu reikšmę
    console.log(x);     // išvedu kintamojo reikšmę (ta kuri saugojama kintamajame)

    // Galima išvesti gražiau suformatuotą:
    console.log("x = " + x);

    // Galima reikšmę priskirt ir iš karto kuriant kintamąjį
    let y = 47;
    console.log(y);

    // Galima ir tekstą saugoti
    let zinute = "Šiandien yra trečiaidenis";
    console.log(zinute);

    // Kintamuosiuose galima ir saugoti veiksmų reikšmes (t.y. sudėti skaičius ar tekstus ir juos išsaugoti)
    let dvigubaSuma = 2 * (x + y);
    console.log("Dviguba suma yra: " + dvigubaSuma);

    // Galima ir kintamuosius aritmetikoj naudot kaip reikšmes
    console.log(x + y);
}