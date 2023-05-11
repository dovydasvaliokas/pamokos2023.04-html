// Pagrindinė funkcija
window.onload = function() {
    let zodis1 = prompt("Įveskite pirmą žodį:");
    let zodis2 = prompt("Įveskite antrą žodį:");
    alert("Ar žodžių paskutiniai trys simboliai vienodi: " + palygintiTrisPaskutiniusSimbolius(zodis1, zodis2));
}

// Papildomos funkcijos
/**
 * Funkcija palygina dviejų žodžių tris paskutinius simbolius.
 * T.y., ar tų žodžių paskutiniai trys simboliai sutampa
 * @param {*} z1 pirmas žodis
 * @param {*} z2 antras žodis
 * @returns true, jeigu sutampa, false jeigu nesutampa
 */
function palygintiTrisPaskutiniusSimbolius(z1, z2) {
    if (z1.slice(-3) == z2.slice(-3)) {
        return true;
    }
    else {
        return false;
    }
}