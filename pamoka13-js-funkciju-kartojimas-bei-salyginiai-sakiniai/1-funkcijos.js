// Pagrindinė funkcija
window.onload = function() {
    let x = 20;
    let ilgis = apskritimoIlgis(x);
    let y = 15;
    let z = 10;
    let ilgis1 = apskritimoIlgis(y);
    let iligs2 = apskritimoIlgis(z);

    let ilgis3 = apskritimoIlgis(41);
    let ilgis4 = apskritimoIlgis(10.25);
    let ilgis5 = apskritimoIlgis(11.71);

    let r = 4;
    let ilgis6 = apskritimoIlgis(r);
}


// Papildomos funkcijos
function apskritimoIlgis(r) {
    return 2 * Math.PI * r;
}

function apskritimoPlotas(r) {
    return Math.pi * r * r;
}