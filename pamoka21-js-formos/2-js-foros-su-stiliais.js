window.onload = function() {
    // Pirmos formos pvz
    let pirmaForma = document.forms["pirmaForma"];
    let pirmaKrastineLaukelis = pirmaForma["pirmaKrastine"];
    let antraKrastineLaukelis = pirmaForma["antraKrastine"];
    let treciaKrastineLaukelis = pirmaForma["treciaKrastine"];
    let mygtukas1 = document.getElementById("mygtukas1");

    mygtukas1.onclick = function() {
        let pirmaKrastine = pirmaKrastineLaukelis.valueAsNumber;
        let antraKrastine = antraKrastineLaukelis.valueAsNumber;
        let treciaKrastine = treciaKrastineLaukelis.valueAsNumber;
        alert(`Trikampio perimetras yra: ${trikampioPerimetras(pirmaKrastine, antraKrastine, treciaKrastine)}`);
    }

    // Antros formos pvz
    let antraForma = document.forms["antraForma"];
    let ilgioLaukelis = antraForma["staciakampioKrastine1"];
    let plocioLaukelis = antraForma["staciakampioKrastine2"];
    let mygtukas2 = document.getElementById("mygtukas2");

    mygtukas2.onclick = function() {
        let ilgis = ilgioLaukelis.valueAsNumber;
        let plotis = plocioLaukelis.valueAsNumber;
        if (ilgis > 0 && plotis > 0) {
            alert(`Stačiakampio plotas yra: ${staciakampioPlotas(ilgis, plotis)}`);
        }
        else {
            alert(`Kraštinės negali būti neigiamos`);
        }
        
    }

}

function trikampioPerimetras(a, b, c) {
    return a + b + c;
}

function staciakampioPlotas(a, b) {
    return a * b;
}