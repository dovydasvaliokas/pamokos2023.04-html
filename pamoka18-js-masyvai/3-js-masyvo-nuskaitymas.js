// Pagrindine programa
window.onload = function() {
    const skaiciai = nuskaitytiMasyva();
    console.log(skaiciai);

    const skaiciai2 = nuskaitytiMasyvaIkiStop();
    console.log(skaiciai2);

    const teigiamiSk2 = filtruotiTikTeigiamus(skaiciai2);
    console.log(teigiamiSk2);

}

// Papildomos funkcijos
/**
 * Nuskaito vartotojo įvedamą masyvą
 * @returns masyvą
 */
function nuskaitytiMasyva() {
    const masyvas = [];
    let n = +prompt("Įveskite kiek bus skaičių");
    for (let i = 0; i < n; i++) {
        masyvas.push(+prompt(`Įveskite ${i}-ąjį elementą`)); 
    }
    return masyvas;
}

/**
 * Nuskaito masyvą iš prompt. Vartotojas veda skaičius, o kai nori sustoti rašo "stop"
 * @returns masyvą
 */
function nuskaitytiMasyvaIkiStop() {
    const masyvas = [];
    let ivedamasSkaicius = prompt("Įveskite skaičių. Jeigu norite sustoti įveskite \"STOP\"");
    while (ivedamasSkaicius.toLocaleLowerCase() != "stop") {
        masyvas.push(+ivedamasSkaicius);
        ivedamasSkaicius = prompt("Įveskite skaičių. Jeigu norite sustoti įveskite \"STOP\"");
    }
    return masyvas;
}


function filtruotiTikTeigiamus(masyvas) {
    const teigiamiSkaiciai = [];
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > 0) {
            teigiamiSkaiciai.push(masyvas[i]);
        }
    }
    return teigiamiSkaiciai;
}