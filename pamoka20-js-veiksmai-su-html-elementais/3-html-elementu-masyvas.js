window.onload = function() {
    const pastraipos = document.getElementsByClassName("pastraipa");
    console.log(pastraipos);
    
    let mygtukas1 = document.getElementById("mygtukas1");
    mygtukas1.onclick = function() {
        for (let i = 0; i < pastraipos.length; i++) {
            pastraipos[i].style.color = "green";
        }
    }

    let mygtukas2 = document.getElementById("mygtukas2");
    mygtukas2.onclick = function() {
        let ieskomasTekstas = prompt("Įveskite tekstą, kurio ieškote pastraipoje");
        for (let i = 0; i < pastraipos.length; i++) {
            if (pastraipos[i].innerHTML.toLocaleLowerCase().includes(ieskomasTekstas.toLocaleLowerCase())) {
                alert(`Ieškomas tekstas yra pastraipoje ${i} pagal indeksą`)
            }
        }
    }

    let mygtukas3 = document.getElementById("mygtukas3");
    mygtukas3.onclick = function() {
        for (let i = 0; i < pastraipos.length; i++) {
            pastraipos[i].style.backgroundColor = `rgb(${grazintiAtsitiktini(0, 256)}, ${grazintiAtsitiktini(0, 256)}, ${grazintiAtsitiktini(0, 256)})`;
        }
    }
}


function grazintiAtsitiktini(nuo, iki) {
    return Math.floor(Math.random() * (iki - nuo) + nuo);
}