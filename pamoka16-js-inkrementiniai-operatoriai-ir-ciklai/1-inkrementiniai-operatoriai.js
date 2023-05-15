window.onload = function() {
    //-------- Kintamųjų reikšmių keitimas be inkrementinių operatorių
    let x = +prompt("Įveskite X");

    // Pridėti skaičių prie X
    x = x + 20;
    alert("X reikšmė, pridėjus prie jo +20 yra " + x);

    // Atimti skaičių iš x
    x = x - 10;
    alert("Atėmus iš naujos X reikšmės 10 yra: " + x);

    // Padidinti X dvigubai
    x = x * 2;
    alert("Padvigubinus X reikšmę yra: " + x);

    // Pamažinti X keturis kartus
    x = x / 4
    alert("Pamažinus keturis kartus X reikšmę yra: " + x);

    //--------- Inkrementiniai operatoriai
    let y = +prompt("Iveskite Y");
    
    // Pridedu prie y penketą
    y += 5;
    
    // Atimu iš Y aštuonetą
    y -= 8;

    // Patrigubinu y
    y *= 3;

    // Sumažinu per pus y
    y /= 2;

    alert("Pridėjus prie Y penketą, atėmus aštuonetą, tada patrigubinus ir tada sumažinus perpus, reikšmė yra: " + y);


    // ++ ir -- operatoriai
    let a = +prompt("Iveskite a");
    a++;
    alert("A reiksme padidinta vienetu" + a);
    a--;
    alert("A reiksme pamazinta vienetu" + a);

    alert("A reiksme yra didinama vienetu, bet jos dar nepanaudoja sitame isvedime (a++): " + a++);
    alert("Antras alertas po a++: " + a);

    alert("Is karto galima isvesti padidinta reiksme: " + ++a);

    alert(`Isvedame a pamazina reiksme: ${--a}`);

}