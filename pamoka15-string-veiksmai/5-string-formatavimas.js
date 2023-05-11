// Pagrindinė funkcija
window.onload = function() {
    let x = +prompt("Įveskite pirmą skaičių: ");
    let y = +prompt("Įveskite antrą skaičių: ");

    alert("Skaičių " + x + " ir " + y + " suma yra: " + (x + y));
    alert(`Skaičių ${x} ir ${y} suma yra ${x + y}`);
}