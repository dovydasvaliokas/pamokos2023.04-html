window.onload = function() {
    let pastraipa = document.getElementById("pastraipa");
    console.log(pastraipa);

    pastraipa.onclick = function() {
        pastraipa.innerHTML = "Buvo paspausta ant pastraipos."
    }

    let mygtukas1 = document.getElementById("mygtukas1");
    console.log(mygtukas1);

    mygtukas1.onclick = function() {
        pastraipa.innerHTML = "Mygtukas buvo paspaustas.";
    }

}