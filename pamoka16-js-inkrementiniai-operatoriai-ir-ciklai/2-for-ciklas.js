// Pagr. funkcija
window.onload = function() {
    isvestiNuoPenketoIkiDvidesimt();
    isvestiBruksniukus();

    isvestiNuoDesimtIkiMinusDvidesimtKasAntra();
    isvestiBruksniukus();

    let pradzia = +prompt("Iveskite nuo kurio skaiciaus pradeti");
    let pabaiga = +prompt("Iveskite iki kurio skaiciaus (IMTINAI) isvesti");
    isvestiIntervalaArbaDidejantArbaMazejant(pradzia, pabaiga);
}


// Papildomos funkcijos
function isvestiNuoPenketoIkiDvidesimt() {
    for (let i = 5; i < 20; i++) {
        console.log(i);
    }
}

function isvestiNuoDesimtIkiMinusDvidesimtKasAntra() {
    for (let i = 10; i > -20; i -= 2) {
        console.log(i);
    }
}

function isvestiNuoIki(pradzia, pabaiga) {
    for (let i = pradzia; i <= pabaiga; i++) {
        console.log(i);
    }
}

function isvestiNuoIkiMazejant(pradzia, pabaiga) {
    for (let i = pradzia;i >= pabaiga; i--) {
        console.log(i);
    }
}

function isvestiIntervalaArbaDidejantArbaMazejant(pradzia, pabaiga) {
    if (pradzia < pabaiga) {
        isvestiNuoIki(pradzia, pabaiga);
    }
    else {
        isvestiNuoIkiMazejant(pradzia, pabaiga);
    }
}


function isvestiBruksniukus() {
    console.log("--------------------------");
}