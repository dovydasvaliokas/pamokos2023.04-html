// Pagrindinė funkcija
window.onload = function() {
    // Pavyzdžiai su mažosiomis / didžiosimis raidėmis
    let zodis1 = prompt("Įveskite žodį, kurį iš pradžių išves visom mažosiomis raidėmis, o po to visos didžiosios:");
    alert(zodis1.toLocaleLowerCase());
    alert(zodis1.toLocaleUpperCase());

    // Pavyzdys kaip lyginti tekstus, ignoruojant mažųjų/didžiųjų skirtumą
    let tekstas1 = prompt("Įveskite pirmą tekstą, kurį lyginsite su antru:")
    let tekstas2 = prompt("Įveskite antrą tekstą, su kuriuo lyginate pirmą:");
    alert("Ar tekstai yra vienodi: " + palygintiDuTekstus(tekstas1, tekstas2));

    // Pavyzdys su String.includes() kaip galima ieškoti ar tekste yra tam tikra reikšmė bei taip pat ignoruojant mažąsias/didžiąsias
    let tekstas3 = prompt("Įveskite tekstą, kuriame ieškosite ar yra reikšmė:");
    let ieskomasTekstas = prompt("Įveskite kokios reikšmės ieškote tekste");
    alert("Ar tekste yra reikšmė (neignoruojant mažųjų/didžiųjų): " + tekstas3.includes(ieskomasTekstas));        // čia NEIGNORUOJANT mažųjų/didžiųjų
    alert("Ar tekste yra reikšmė (ignoruojant mažųjų/didžiųjų skirtumą: " + tekstas3.toLocaleLowerCase().includes(ieskomasTekstas.toLocaleLowerCase()))

    // Pavyzdys su index ir lastindex of
    let tekstas4 = "Šiandien yra ketvirtadienis. Kitos savaitės ketvirtadienis bus už setpynių dienų.";
    alert(tekstas4.indexOf("ketv"));
    alert(tekstas4.lastIndexOf("ketv"));

    // Pavyzdys su startsWith ir endsWith
    let tekstas5 = "Bananas";
    alert(tekstas5.toLocaleLowerCase().startsWith("ba"));       // išves true
    alert(tekstas5.toLocaleLowerCase().startsWith("r"));        // išves false
    alert(tekstas5.endsWith("nas"));            // išves true
    alert(tekstas5.endsWith("is"));         // išves false


}

// Papildomos funkcijos
function palygintiDuTekstus(t1, t2) {
    if (t1.toLocaleLowerCase() == t2.toLocaleLowerCase()) {
        return true;
    }
    else {
        return false;
    }
}