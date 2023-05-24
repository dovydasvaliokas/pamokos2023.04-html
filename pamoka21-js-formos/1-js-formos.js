window.onload = function() {
    let forma = document.forms["forma"];
    console.log(forma);
    // Teoriškai įmanoma formos laukelius gauti pagal id, tačiau reikėtų pagal taisykles naudoti name 
    // let tekstoLaukelis = document.getElementById("tekstas");
    // console.log(tekstoLaukelis);
    let tekstoLaukelis = forma["tekstas"];
    console.log(tekstoLaukelis);

    let kiekioLaukelis = forma["kiekis"];

    let mygtukas = document.getElementById("mygtukas");
    mygtukas.onclick = function() {
        let tekstas = tekstoLaukelis.value;
        let kiekis = kiekioLaukelis.valueAsNumber;
        isvestiArIlgesnis(tekstas, kiekis);
    }
}

function isvestiArIlgesnis(tekstas, x) {
    if (tekstas.length > x) {
        alert(`Tekstas yra ilgesnis nei ${x} simbolių`);
    }
    else {
        alert(`Tekstas yra trumpesnis nei ${x} simbolių`);
    }
}