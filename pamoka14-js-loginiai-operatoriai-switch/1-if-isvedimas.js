// Pagrindinė funkcija
window.onload = function() {
    // Ar teigiamas pvz naudojimas
    let x = +prompt("Įveskite skaičių");
    arTeigiamasIsvedaIsKarto(x);
    isvestiArTeigiamas(x);

    // Mokesčių skaičiavimas pvz naudojimas (naudojant irgi ar teigiamas)
    let pajamos = +prompt("Įveskite savo pajamas");
    isvestiMokesti(skaiciuotiMokesti(pajamos));
}


// Papildomos funkcijos
/**
 * Patikrina ar skaičius yra teigiamas ir išveda iš karto į alert atsakymą.
 * @param {*} skaicius tikrinamas skaičius (ar teigiamas ar ne)
 */
function arTeigiamasIsvedaIsKarto(skaicius) {
    if (skaicius > 0) {
        alert("Skaičius " + skaicius + " yra teigiamas");
    } 
    else {
        alert("Skaičius " + skaicius + " yra NE teigiamas");
    }
}

/**
 * Patikrina ar skaičius teigiamas
 * @param {*} skaicius tikrinamas skaičius
 * @returns true, jeigu teigiamas, false jeigu neigiamas arba nulis
 */
function arTeigiamas(skaicius) {
    return skaicius > 0;
}


function isvestiArTeigiamas(skaicius) {
    if (arTeigiamas(skaicius) == true) {                // == true nereikia rašyti, su booleanais tą automatiškai if'e supranta
        alert("Skaičius " + skaicius + " yra teigiamas");
    }
    else {
        alert("Skaičius " + skaicius + " yra NE teigiamas");
    }
}

/**
 * Apskaičiuoja mokestį pagal pajamas, jeigu pajamos neigiamos - mokestis yra nulis.
 * Jeigu pajamos yra teigiamos, mokestis yra 10% pajamų
 * @param {*} pajamos pajamos
 * @returns mokestį
 */
function skaiciuotiMokesti(pajamos) {
    let mokestis;
    if (arTeigiamas(pajamos)) {
        mokestis = pajamos * 0.1;
    }
    else {
        mokestis = 0;
    }
    return mokestis;
}

function isvestiMokesti(mokestis) {
    alert("Pagal jūsų pajamas, jūsų mokestis yra: " + mokestis);
}

