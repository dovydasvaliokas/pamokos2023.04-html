// pagr funkcija
window.onload = function() {
    let darbuotojas = {id: 157, vardasPavarde: "Vardenis Pavardenis", alga: 1532.58, pareigos: "programuotojas" };
    console.log(darbuotojas);
    // alert(darbuotojas);
    // alert(darbuotojas.vardasPavarde);
    // alert("Darbuotojas turi didesnę nei vidutinė: " + arAlgaDidesniUzVidutini(darbuotojas, 1500));
    let darbuotojas2 = nuskaitytiDarbuotojaIsPrompt();
    console.log(darbuotojas2);
    pakeltiAlgaProcentais(darbuotojas2, 10);
    isvestiDarbuotojaIAlerta(darbuotojas2);
}

// papildomos funkcijos
function arAlgaDidesniUzVidutini(darbuotojas, vidutineAlga) {
    if (darbuotojas.alga > vidutineAlga) {
        return true;
    }
    else {
        return false;
    }
}

function nuskaitytiDarbuotojaIsPrompt() {
    let darbuotojas = {id: 0, vardasPavarde: "", alga: 0, pareigos: "" }
    // Galima saugoti iš pradžių į naują kintamąjį ir tada jo reikšmę į objekto kintamąjį išsaugoti
    let laikinasId = +prompt("Įveskite darbuotojo ID");
    darbuotojas.id = laikinasId;
    // Galima iš karto saugoti į objekto kintamąjį
    darbuotojas.vardasPavarde = prompt("Iveskite darbuotojo varda");
    darbuotojas.alga = +prompt("Iveskite darbuotojo alga");
    darbuotojas.pareigos = prompt("Iveskite darbuotojo pareigas");
    return darbuotojas;
}

function isvestiDarbuotojaIAlerta(darbuotojas) {
    let darbuotojasTekstinis = `Darbuotojo ID: ${darbuotojas.id}\nDarbuotojo vardas pavardė: ${darbuotojas.vardasPavarde}\nDarbuotojo alga: ${darbuotojas.alga}\nDarbuotojo pareigos: ${darbuotojas.pareigos}`;
    alert(darbuotojasTekstinis);
}

function pakeltiAlgaProcentais(darbuotojas, procentai) {
    darbuotojas.alga = darbuotojas.alga + darbuotojas.alga * procentai / 100;
}