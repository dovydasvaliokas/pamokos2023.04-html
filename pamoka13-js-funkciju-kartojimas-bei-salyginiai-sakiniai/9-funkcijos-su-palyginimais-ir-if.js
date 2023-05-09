// Pagrindine funkcija
window.onload = function() {
    let x = +prompt("Įveskite skaičių");
    alert("Skaičius yra teigiamas: " + arTeigiamas(x));
    alert("Skaičius dalinasi iš 5: " + arDalinasiIsPenkiuBeLiekanos(x));
}

// Papildomos funkcijos
function arTeigiamas(skaicius) {
    return skaicius > 0;
}

function arDalinasiIsPenkiuBeLiekanos(skaicius) {
    return skaicius % 5 == 0;
}