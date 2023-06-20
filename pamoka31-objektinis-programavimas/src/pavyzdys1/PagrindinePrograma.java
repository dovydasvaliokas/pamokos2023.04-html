package pavyzdys1;

public class PagrindinePrograma {
    public static void main(String[] args) {
        // susikuriame prekės objektą
        Preke preke = new Preke();

        // Priskiriame objekto kintamiesiems (savybėms) reikšmes
        preke.pavadinimas = "Stalas";
        preke.kaina = 99.99;
        preke.kiekisSandelyje = 12;
        preke.kategorija = "baldai";
        preke.id = 15;

        // Išvedame pora savybių objekto
        System.out.println("preke.pavadinimas = " + preke.pavadinimas);
        System.out.println("preke.kaina = " + preke.kaina);

        // Išvedame visą objektą (šitas išvedimas veiks tik tada, jei bus toString() funkcija objekte padaryta))
        System.out.println("preke = " + preke);
    }
}
