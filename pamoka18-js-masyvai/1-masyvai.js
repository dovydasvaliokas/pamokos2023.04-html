// pagr programa
window.onload = function() {
    // Susikuriu masyvą ir priskiriu reikšmes
    const masyvas = [4, 7, 8, 9, 20, 30, 50, 70, 500];

    // Išvedu kiekvieną elementą atskirai
    // Toks perėjimas per visus masyvo elementus būtų blogas, nes jeigu masyvo ilgis/elementų kiekis bus kitoks, jau mūsų kodas nepilnai veiks
    console.log(masyvas[0]);
    console.log(masyvas[1]);
    console.log(masyvas[2]);
    console.log(masyvas[3]);
    console.log(masyvas[4]);
    console.log(masyvas[2 - 1]);            // čia išves masyvas[1] kas yra 7
    console.log(masyvas[2] - masyvas[1]);       // čia išves 8 - 7, kas yra 1

    // Išvedu masyvo ilgį (elementų kiekį)
    console.log("Masyvo ilgis yra: " + masyvas.length);
    console.log("Ketvirtas nuo galo (jei surikiuotas, tai ketvirtas didžiausias): " + masyvas[masyvas.length - 5]);

    // Galima masyvą išvesti visą iš karto
    console.log(masyvas);

    isvestiMasyvaAtskirasEilutes(masyvas);
    console.log("Masyvo suma yra: " + masyvoSuma(masyvas));

    //---- Pavyzdys su didziausio radimu
    const skaiciai = [12, 4, 8, 20, 14, 2, 5, 8];
    console.log("Didžiausia masyvo reikšmė yra: " + rastiDidziausia(skaiciai));
    console.log("Didžiausio skaičiaus vieta yra: " + rastiDidziausioIndeksa(skaiciai));

    const skaiciai2 = [-20, 14, 8, -37, 41, -2, -4, 8];
    paverstiMasyvaTeigiamu(skaiciai2);
    console.log(skaiciai2);
}

// papildomos funkcijos

/**
 * Pereinam per masyvą ir išvedam kiekvieną elementą į naują eilutę
 * @param {*} skaiciai masyvas
 */
function isvestiMasyvaAtskirasEilutes(skaiciai) {
    for (let i = 0; i < skaiciai.length; i++) {
        console.log(skaiciai[i]);
    }
}

/**
 * Funkcija suranda masyvo sumą
 * @param {*} masyvas 
 * @returns suma
 */
function masyvoSuma(masyvas) {
    let suma = 0;
    for (let i = 0; i < masyvas.length; i++) {
        suma += masyvas[i];
    }
    return suma;
}

/**
 * Funkcija randa didžiausio skaičiaus reikšmę iš masyvo. 
 * Priskiria iš pradžių tarpiniam didžiausiui nulinį elementą, eina tada per visus elementus ir jeigu elemenetas didesnis
 * už tarpinį max, tai tada tarpinis max yra lygus tam elementui
 * @param {*} masyvas 
 * @returns didžiausią skaičių
 */
function rastiDidziausia(masyvas) {
    let didziausias = masyvas[0];
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > didziausias) {
            didziausias = masyvas[i];
        }
    }
    return didziausias;
}

function rastiDidziausioIndeksa(masyvas) {
    let didziausioIndeksas = 0;
    for (let i = 0; i < masyvas.length; i++) {
        if (masyvas[i] > masyvas[didziausioIndeksas]) {
            didziausioIndeksas = i;
        }
    }
    return didziausioIndeksas;
}

function paverstiMasyvaTeigiamu(masyvas) {
    for (let i = 0; i < masyvas.length; i++) {
        masyvas[i] = Math.abs(masyvas[i]);
    }
}