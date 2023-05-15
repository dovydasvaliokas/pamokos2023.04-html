// Pagrindinė funkcija
window.onload = function() {
    alert("Skaičių nuo 1 iki 100 bendra suma yra " + suskaiciuotiSumaNuoVienetoIkiSimto())
    alert("Skaičių nuo 1 iki 100 (naudojant universalią funkciją) suma yra: " + suskaiciuotiIntervaloSuma(1, 100));

    let pradzia = +prompt("Iveskite pradzia");
    let pabaiga = +prompt("Iveskite pabaiga");
    alert(`Skaičių nuo ${pradzia} iki ${pabaiga} intervalo suma yra ${suskaiciuotiIntervaloSuma(pradzia, pabaiga)}`)
    alert(`Skaičių nuo ${pradzia} iki ${pabaiga} intervalo TIK LYGINIŲ suma yra ${surastiTikLyginiuSuma(pradzia, pabaiga)}`)

    isvestiIntervaloTrejetoIrPenketoKartotinius(pradzia, pabaiga);


}


// Papildomos funkcijos
function suskaiciuotiSumaNuoVienetoIkiSimto() {
    let suma = 0;
    // debugger;
    for (let i = 1; i <= 100; i++) {
        suma += i;
    } 
    return suma;
}


function suskaiciuotiIntervaloSuma(pradzia, pabaiga) {
    let suma = 0;
    for (let i = pradzia; i <= pabaiga; i++) {
        suma += i;
    }
    return suma;
}


function surastiTikLyginiuSuma(pradzia, pabaiga) {
    let suma = 0;
    for (let i = pradzia; i <= pabaiga; i++) {
        if (i % 2 == 0) {
            suma += i;
        }
    }
    return suma;
}


function arTrejetoIrPenketoKartotinis(skaicius) {
    return skaicius % 3 == 0 && skaicius % 5 == 0;
}


function isvestiIntervaloTrejetoIrPenketoKartotinius(pradzia, pabaiga) {
    for (let i = pradzia; i <= pabaiga; i++) {
        if (arTrejetoIrPenketoKartotinis(i)) {
            console.log(i);
        }
    }
}