window.onload = function() {
    let pastraipa = document.getElementById("pastraipa");
    console.log(pastraipa);

    pastraipa.onclick = function() {
        pastraipa.innerHTML = "Buvo paspausta ant pastraipos."
    }

    let mygtukas1 = document.getElementById("mygtukas1");
    console.log(mygtukas1);

    // Pirmo mygtuko event listeneris
    mygtukas1.onclick = function() {
        // Pakeičia pastraipos tekstą
        pastraipa.innerHTML = "Mygtukas buvo paspaustas.";
    }

    let mygtukas2 = document.getElementById("mygtukas2");
    console.log(mygtukas2);

    mygtukas2.onclick = function() {
        pastraipa.style.color = "red";
        pastraipa.style.backgroundColor = "rgb(10, 10, 255)";
        pastraipa.style.border = "2px solid black";
    }

}