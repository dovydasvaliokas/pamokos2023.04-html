package pavyzdys1objektonuskaitymas;

import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke preke1 = new Preke(1, "Kėdė", 99.99, 27, "baldai");
        System.out.println("preke1 = " + preke1);
//        Preke preke2 = nuskaitytiPrekeIsKonsoles();
//        System.out.println("preke2 = " + preke2);
        Preke preke3 = nuskaitytiPrekeIsKonsolesSuSetteriais();
        System.out.println("preke3 = " + preke3);
    }

    public static Preke nuskaitytiPrekeIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite prekės ID:");
        int id = skaitytuvas.nextInt();
        System.out.println("Įveskite pavadinimą:");
        skaitytuvas.nextLine();
        String pavadinimas = skaitytuvas.nextLine();
        System.out.println("Įveskite kainą:");
        double kaina = skaitytuvas.nextDouble();
        System.out.println("Įveskite kiekį sandėlyje: ");
        int kiekisSandelyje = skaitytuvas.nextInt();
        System.out.println("Įveskite kategoriją: ");
        skaitytuvas.nextLine();
        String kategorija = skaitytuvas.nextLine();

        Preke preke = new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
        return preke;
        // galima šitas dvi eilutes sutrumpinti į vieną
//        return new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
    }

    public static Preke nuskaitytiPrekeIsKonsolesSuSetteriais() {
        Scanner skaitytuvas = new Scanner(System.in);
        Preke preke = new Preke();

        System.out.println("Įveskite prekės ID:");
        int id = skaitytuvas.nextInt();
        preke.setId(id);
        // praeitas dvi eilutes galima sutrumpinti iki vienos
//        preke.setId(skaitytuvas.nextInt());
        System.out.println("Įveskite pavadinimą:");
        skaitytuvas.nextLine();
        String pavadinimas = skaitytuvas.nextLine();
        preke.setPavadinimas(pavadinimas);
        System.out.println("Įveskite kainą:");
        double kaina = skaitytuvas.nextDouble();
        preke.setKaina(kaina);
        System.out.println("Įveskite kiekį sandėlyje: ");
        int kiekisSandelyje = skaitytuvas.nextInt();
        preke.setKiekisSandelyje(kiekisSandelyje);
        System.out.println("Įveskite kategoriją: ");
        skaitytuvas.nextLine();
        String kategorija = skaitytuvas.nextLine();
        preke.setKategorija(kategorija);
        return preke;
    }
}
