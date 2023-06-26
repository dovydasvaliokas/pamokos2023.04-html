package pavyzdys2objektumasyvai;

import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        // 1 pavyzdys, kur masyvą susikuriu visą kode, be jokio nuskaitymo iš konsolės
//        int[] skaiciai = new int[] {4, 2, 5};
//        System.out.println("skaiciai = " + Arrays.toString(skaiciai));
        // Susikuriu keturias prekes
        Preke preke1 = new Preke(17, "Kėdė", 18.99, 174, "baldai");
        Preke preke2 = new Preke(18, "Stalas", 185.99, 20, "baldai");
        Preke preke3 = new Preke(9, "Kėdė", 74.99, 14, "baldai");
        Preke preke4 = new Preke(23, "Kompiuteris", 1809.99, 397, "elektronika");
        // Susikuriu masyvą, kuriame bus tos keturios prekės
        Preke[] prekes = new Preke[] {preke1, preke2, preke3, preke4};
        // Išvedu prekių masyvą į konsolę
        System.out.println("prekes = " + Arrays.toString(prekes));
        // papildomi pirmo pavyzdžio pavyzdžiai
        // Išvedame antrą (pagal indeksą) prekę iš masyvo
        System.out.println("prekes[2] = " + prekes[2]);

        // 2 pavyzdys nuskaitome masyvą iš konsolės naudodami papildomą funkciją
        Preke[] prekes2 = nuskaitytiPrekeMasyvaIsKonsoles();
        System.out.println("prekes2 = " + Arrays.toString(prekes2));
    }

    public static Preke[] nuskaitytiPrekeMasyvaIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek bus prekių skirtingų");
        int n = skaitytuvas.nextInt();
        Preke[] prekes = new Preke[n];
        for (int i = 0; i < n; i++) {
            Preke preke = nuskaitytiPrekeIsKonsoles();
            prekes[i] = preke;
        }
        return prekes;
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
    }
}
