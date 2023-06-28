package pavyzdys1issaugojimasifaila;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        String failoPav = "prekes.csv";
        Preke preke = nuskaitytiPrekeIsKonsoles();
        System.out.println("preke = " + preke);

        // Šita funkcija prideda į failo galą prekę, tačiau esminė problema - nepakeičia visų prekių kiekio
//        issaugotiPrekeIFaila(preke, "prekes.csv");

        issaugotiVisasPrekesIFaila(preke, failoPav);
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

    public static void issaugotiPrekeIFaila(Preke preke, String failoPavadinimas) {
        try {
            FileWriter failas = new FileWriter(failoPavadinimas, true);
            BufferedWriter writer = new BufferedWriter(failas);

            // Šis metodas perrašo failą - t.y. viską ištrina ir tik tada į jį įrašo.
//            writer.write(preke.toString());

            // Šis metodas prirašo į failo galą, neištrinant kas buvo prieš tai (bet tik tada, jei filewriter append yra true)
            writer.append("\n");
            writer.append(preke.toStringCsvFormatu());

            writer.close();
        } catch (IOException e) {
            System.out.println("Nepavyko išvesti į failą.");
            e.printStackTrace();
        }
    }

    public static void issaugotiVisasPrekesIFaila(Preke preke, String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        try {
            Scanner skaitytuvas = new Scanner(failas);
            String pirmaEilute = skaitytuvas.nextLine();
            int n = skaitytuvas.nextInt();
            Preke[] prekes = nuskaitytiPrekesIsFailo(failoPavadinimas);
            Preke[] naujosPrekes = Arrays.copyOf(prekes, prekes.length + 1);
            naujosPrekes[naujosPrekes.length - 1] = preke;
            n++;

            FileWriter irasymoFailas = new FileWriter(failoPavadinimas);
            BufferedWriter writer = new BufferedWriter(irasymoFailas);

            writer.write(pirmaEilute + "\n" + n);
            writer.close();
            for (int i = 0; i < naujosPrekes.length; i++) {
                issaugotiPrekeIFaila(naujosPrekes[i], failoPavadinimas);
            }
            System.out.println("Prekė išsaugota į failą.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Preke[] nuskaitytiPrekesIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);       // susikuriu failo objektą
        Preke[] prekes;     // susikuriu prekių masyvą prieš try
        // Try dalies reikia norint su skaneriu nuskaityti iš failo
        try {
            Scanner skaitytuvas = new Scanner(failas);      // scanner objektas
            skaitytuvas.nextLine();     // pirmą eilutę praleidžiu, nes ten tik tai antraštės
            int n = skaitytuvas.nextInt();      // nuskaitome kiek bus prekių
            prekes = new Preke[n];          // susikuriame prekių masyvą, kuris bus n dydžio
            skaitytuvas.nextLine();     // "nudeginu" eilutę, nes skaitome tekstą po skaičiaus

            // Einame su ciklu per visas eilutes tekstinio failo
            for (int i = 0; i < n; i++) {
                String prekesEilute = skaitytuvas.nextLine();       // nuskaitome eilutę
                String[] prekesEiluteIsskaldyta = prekesEilute.split(",");      // ją išskaldome į tekstinį masyvą
                // Iš tekstinio masyvo sudedame visas reikšmes į atitinkamus kintamuosius (id, pavadainimas, t.t.)
                int id = Integer.parseInt(prekesEiluteIsskaldyta[0]);
                String pavadinimas = prekesEiluteIsskaldyta[1];
                double kaina = Double.parseDouble(prekesEiluteIsskaldyta[2]);
                int kiekisSandelyje = Integer.parseInt(prekesEiluteIsskaldyta[3]);
                String kategorija = prekesEiluteIsskaldyta[4];

                // Sukuriame prekės objektą naudojant ką tik išsaugotus kintamuosius
                Preke preke = new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
                // Įdedame prekę į masyvą
                prekes[i] = preke;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tokio failo nėra.");
            throw new RuntimeException(e);
        }

        return prekes;
    }
}
