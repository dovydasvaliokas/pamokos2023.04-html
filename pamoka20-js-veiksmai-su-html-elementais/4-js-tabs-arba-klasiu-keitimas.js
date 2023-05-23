window.onload = function() {
    const tabai = document.getElementsByClassName("tab");
    const turiniai = document.getElementsByClassName("turinys");

    // Išsitestuoju ar gerai jie gauti, išvesdamas į konsolę
    console.log(tabai);
    console.log(turiniai);


    for (let i = 0; i < tabai.length; i++) {
        tabai[i].onclick = function() {
            for (let j = 0; j < tabai.length; j++) {
                tabai[j].classList.remove("active");
                turiniai[j].classList.remove("active");
            }
            tabai[i].classList.add("active");
            turiniai[i].classList.add("active");
        }
    }
}