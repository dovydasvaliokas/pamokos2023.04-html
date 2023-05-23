window.onload = function() {
    // Gauname pastraipą iš html puslapio
    let pastraipa = document.getElementById("pirmaPastraipa");

    // Išvedam pastraipą į konsolę
    console.log(pastraipa);

    // Pakeičiam pastraipai tekstą
    pastraipa.innerHTML = "Čia yra pakeistas pastraipos tekstas";
}