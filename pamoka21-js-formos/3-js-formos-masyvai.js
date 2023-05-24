window.onload = function() {
    let pirmaForma = document.forms["pirmaForma"];
    let skaiciuLaukelis = pirmaForma["skaiciuMasyvas"];
    let mygtukas1 = document.getElementById("mygtukas1");

    mygtukas1.onclick = function() {
        const skaiciai = skaiciuLaukelis.value.split(",");
        console.log(skaiciai);
    }
    
}


