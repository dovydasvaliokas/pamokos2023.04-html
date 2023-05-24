window.onload = function() {
    // 1 pavyzdys
    let pirmaForma = document.forms["pirmaForma"];
    let skaiciuLaukelis = pirmaForma["skaiciuMasyvas"];
    let mygtukas1 = document.getElementById("mygtukas1");

    mygtukas1.onclick = function() {
        const skaiciai = skaiciuLaukelis.value.split(",");
        console.log(skaiciai);
        alert(`Masyvo suma yra: ${masyvoSuma(skaiciai)}`);
        konvertuotiTekstiniMasyvaISkaitini(skaiciai);
        console.log(skaiciai);
        alert(`Masyvo suma yra: ${masyvoSuma(skaiciai)}`);
    }

    // 2 pavyzdys
    let antraForma = document.forms["antraForma"];
    let mygtukas2 = document.getElementById("mygtukas2");
    let pliusoMygtukas = document.getElementById("pliusoMygtukas");

    pliusoMygtukas.onclick = function() {
        let naujasLaukelis = document.createElement("input");
        naujasLaukelis.setAttribute("type", "number");
        naujasLaukelis.setAttribute("name", "skaicius");
        let paskutinisLaukelis = antraForma.lastChild;
        antraForma.insertBefore(naujasLaukelis, paskutinisLaukelis);
    }

    mygtukas2.onclick = function() {
        const skaiciuMasyvas = nuskaitytiIsLaukeliuIMasyva("skaicius");
        alert(`Skaičių suma yra ${masyvoSuma(skaiciuMasyvas)}`);
        // location.reload();     čia jei norima atrefreshint puslapį
        istrintiLaukelius("skaicius");
    }
}

function konvertuotiTekstiniMasyvaISkaitini(masyvas) {
    for (let i = 0; i < masyvas.length; i++) {
        masyvas[i] = +masyvas[i];
    }
}

function masyvoSuma(masyvas) {
    let suma = 0;
    for (let i = 0; i < masyvas.length; i++) {
        suma += masyvas[i];
    }
    return suma;
}

function nuskaitytiIsLaukeliuIMasyva(name) {
    const laukeliai = document.getElementsByName(name);
    const masyvas = [];
    for (let i = 0; i < laukeliai.length; i++) {
        masyvas.push(laukeliai[i].valueAsNumber)
    }
    return masyvas;
}


function istrintiLaukelius(name) {
    const laukeliai = document.getElementsByName(name);
    for (let i = laukeliai.length - 1; i > 0; i--) {
        laukeliai[i].remove();
    }
}