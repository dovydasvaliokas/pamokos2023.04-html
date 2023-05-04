window.onload = function() {
    // Panaudoju savo kurtą funkciją, kurioje yra Math.PI
    console.log(apskritimoIlgis(5));
    isvestiBruksniukus();

    // Math.abs() - skaičiaus modulis
    console.log(Math.abs(20));      // išves 20
    console.log(Math.abs(-14));     // išves 14
    isvestiBruksniukus();

    // Math.ceil() - jeigu skaičius sveikasis, tai jį ir palieka tokį pat, o jeigu su kableliu - jį pakelia iki didesnio artimiausio sveikojo
    console.log(Math.ceil(5));          // išves 5
    console.log(Math.ceil(6.28));       // išves 7
    console.log(Math.ceil(-20.147));    // išves -20
    isvestiBruksniukus();

    // Math.floor() - jeigu skaičius sveikasis, tai jį ir palieka tokį pat, o jeigu su kableliu - jį pažemina iki mažesnio artimiausio sveikojo
    console.log(Math.floor(5));          // išves 5
    console.log(Math.floor(6.28));       // išves 6
    console.log(Math.floor(-20.147));    // išves -21
    isvestiBruksniukus();

    // Math.round() - apvalina skaičių iki artimiausio sveiko skaičiaus
    console.log(Math.round(5))      // išves 5
    console.log(Math.round(6.28));       // išves 6
    console.log(Math.round(6.5))        // išves 7
    isvestiBruksniukus();

    // Math.max() - suranda didžiausią iš visų įvestų
    console.log(Math.max(6, 8));        // išves 8
    console.log(Math.max(3, 5, 2, 17, 2, 25, 14, 3));       // išves 25
    isvestiBruksniukus();

    // Math.min() - suranda mažiausių iš visų įvestų
    console.log(Math.min(6, 8));        // išves 6
    console.log(Math.min(3, 5, 2, 17, 2, 25, 14, 3));       // išves 2
    isvestiBruksniukus();

    // Math.pow() - pakelia skaičių laipsniu
    console.log(Math.pow(2, 3));            // pakels dvejetą trečiuoju laipsniu; išves 8
    console.log(Math.pow(4, 5));            // pakels ketvertą penktuoju laipsniu; išves 1024
    console.log(Math.pow(8, 1/3));          // pakelia aštuonetą 1/3-uoju laipsniu; tai yra kubinė šaknis ir išves 2 (1/2-uoju laipsniu būtų kvadratinė šaknis)
    console.log(Math.pow(12, -2));          // pakelia 12 antruoju laipsniu, o tada grąžina tam skaičiu atvirkščią (išves 1/144)
    isvestiBruksniukus();

    // Math.sqrt() - ištraukia kvadratinę šaknį
    console.log(Math.sqrt(16));     // išves 4
    console.log(Math.sqrt(49));     // išves 7
    console.log(Math.sqrt(15));     // išves 3.872983346207417
    isvestiBruksniukus();

    // Math.random() - grąžina realųjų (su kableliu) atsitiktinį skaičių tarp 0 ir 1
    console.log(Math.random());     // išves atsitiktinį nuo 0 iki 1
    console.log(Math.random() * (55 - 20) + 20);        // išves atsitiktinį nuo 20 iki 55
    console.log(Math.round(Math.random() * (90 - 30) + 30));        // išves atsitiktinį sveikąjį skaičių nuo 30 iki 90
}

// Papildomos funkcijos
// Sukuriu apskritimo ilgio funkciją, kuri naudojama Math.PI savo viduje
function apskritimoIlgis(r) {
    return 2 * Math.PI * r;
}

function isvestiBruksniukus() {
    console.log("--------------");
}