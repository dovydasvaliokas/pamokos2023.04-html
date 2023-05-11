// Pagrindinė funkcija
window.onload = function() {
    let zodis1 = prompt("Įveskite pirmą žodį:");
    let zodis2 = prompt("Įveskite antrą žodį:");
    alert("Palyginimo rezultatas yra: " + palygintiZodziuIlgius(zodis1, zodis2));
    isvestiKurisIlgesnis(zodis1, zodis2);
}

// Papildomos funkcijos
function palygintiZodziuIlgius(z1, z2) {
    if (z1.length > z2.length) {
        return -1;
    } else if (z1.length == z2.length) {
        return 0;
    } else {
        return 1;
    }
}

function isvestiKurisIlgesnis(z1, z2) {
    switch(palygintiZodziuIlgius(z1, z2)) {
        case -1:
            alert("Pirmas žodis yra ilgesnis");
            break;
        case 0:
            alert("Abu žodžiai yra vienodo ilgio");
            break;
        case 1:
            alert("Antras žodis yra ilgesnis");
    }
}