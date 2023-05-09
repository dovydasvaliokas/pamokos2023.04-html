// Pagrindine funkcija
window.onload = function() {
    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("Įveskite antrą skaičių");

    if (x > y) {
        alert("Pirmas didesnis");
    } else if (x < y) {
        alert("Antras didesnis");
    }
    else {
        alert("Jie abu yra lygūs");
    }
}