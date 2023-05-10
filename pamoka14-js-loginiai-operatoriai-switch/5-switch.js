// Pagrindinė funkcija
window.onload = function() {
    let x = +prompt("Įveskite mėnesio skaičių");
    alert("Įvestas mėnesis yra: " + menesioZodisPagalSkaiciuElseIf(x));
    alert("Įvestas mėnesis yra: " + menesioZodisPagalSkaiciuSwitch(x));
}

/**
 * Funkcija konvertuoja mėnesio skaitinę reikšmę į žodinę reikšmę. 
 * Šitas pavyzdys naudoja if-else-if variantą
 * @param {*} menesioSkaicius mėnesio skaičius
 * @returns jeigu 1, grąžina "sausis", jeigu 2 - grąžina "vasaris", jeigu 3 - "kovas" ir t.t.
 */
function menesioZodisPagalSkaiciuElseIf(menesioSkaicius) {
    if (menesioSkaicius == 1) {
        return "sausis";
    } else if (menesioSkaicius == 2) {
        return "vasaris";
    } else if (menesioSkaicius == 3) {
        return "kovas";
    } else if (menesioSkaicius == 4) {
        return "balandis";
    } else if (menesioSkaicius == 5) {
        return "geguŽė";
    } else if (menesioSkaicius == 6) {
        return "birŽelis";
    } else if (menesioSkaicius == 7) {
        return "liepa";
    } else if (menesioSkaicius == 8) {
        return "rugpjūtis"
    } else if (menesioSkaicius == 9) {
        return "rugsejis"
    } else if (menesioSkaicius == 10) {
        return "spalis"
    } else if (menesioSkaicius == 11) {
        return "lapkritis"
    } else if (menesioSkaicius == 12) {
        return "gruodis"
    } else {
        return "netinkamas skaičius";
    }
}


/**
 * Funkcija konvertuoja mėnesio skaitinę reikšmę į žodinę reikšmę. 
 * Šitas pavyzdys naudoja switch variantą
 * @param {*} menesioSkaicius mėnesio skaičius
 * @returns jeigu 1, grąžina "sausis", jeigu 2 - grąžina "vasaris", jeigu 3 - "kovas" ir t.t.
 */
function menesioZodisPagalSkaiciuSwitch(menesioSkaicius) {
    let menesioDienaZodis;
    switch (menesioSkaicius) {
        case 1:
            menesioDienaZodis = "sausis";
            break;
        case 2:
            menesioDienaZodis = "vasaris";
            break;
        case 3:
            menesioDienaZodis = "kovas";
            break;
        case 4:
            menesioDienaZodis = "balandis";
            break;
        case 5:
            menesioDienaZodis = "geguze";
            break;
        case 6:
            menesioDienaZodis = "birzelis";
            break;
        case 7:
            menesioDienaZodis = "liepa";
            break;
        case 8:
            menesioDienaZodis = "rugpjutis";
            break;
        case 9:
            menesioDienaZodis = "rugsejis";
            break;
        case 10:
            menesioDienaZodis = "spalis";
            break;
        case 11:
            menesioDienaZodis = "lapkritis";
            break;
        case 12:
            menesioDienaZodis = "gruodis";
            break;
        default:
            menesioDienaZodis = "netinkamas skaičius";
    }
    return menesioDienaZodis;
}