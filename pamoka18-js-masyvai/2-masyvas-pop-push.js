// Pagrindinė programa
window.onload = function() {
    const testinisMasyvas = [14, 7, 8, 9, 20];
    console.log(testinisMasyvas);

    // Pridedu į masyvo galą naujus elementus
    testinisMasyvas.push(5);
    console.log(testinisMasyvas);
    testinisMasyvas.push(-4, -7, 81);
    console.log(testinisMasyvas);

    // Panaikinu paskutinį masyvo elementą
    testinisMasyvas.pop();
    testinisMasyvas.pop();
    console.log(testinisMasyvas);

    // Pridedu naują elementą į masyvo pradžią
    testinisMasyvas.unshift(-100);
    testinisMasyvas.unshift(10, 200, 37);
    console.log(testinisMasyvas);

    // Pašalinu du pirmus masyvo elementus
    testinisMasyvas.shift();
    testinisMasyvas.shift();
    console.log(testinisMasyvas);
}

// Papildomos funkcijos