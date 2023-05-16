window.onload = function() {
    let x = 20;
    let y = 10;
    patikrintiAritmeniVeiksma(x, y);
}

function patikrintiAritmeniVeiksma(x, y) {
    let atsakymas;
    do {
        atsakymas = +prompt(`Iveskite kiek bus ${x} + ${y}`);
    } while(atsakymas != x + y)
    alert("Teisingai");
} 