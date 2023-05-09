// Pagrindine funkcija
window.onload = function() {
    let x = +prompt("Įveskite pirmą skaičių");
    let y = +prompt("Įveskite antrą skaičių");

    if (x > y) {
        alert("Pirmas yra didesnis už antrą")
    }
    else {
        alert("Antras yra didesnis už pirmą arba jie abu lygūs")
    }
}