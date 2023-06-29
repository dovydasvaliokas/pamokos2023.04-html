import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PrekeIOHelper {
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
            writer.append("\n");
            writer.append(preke.toStringCsvFormatu());
            writer.close();
        } catch (IOException e) {
            System.out.println("Nepavyko išvesti į failą.");
            e.printStackTrace();
        }
    }

    public static Preke[] nuskaitytiPrekesIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        Preke[] prekes;
        try {
            Scanner skaitytuvas = new Scanner(failas);
            skaitytuvas.nextLine();
            int n = skaitytuvas.nextInt();
            prekes = new Preke[n];
            skaitytuvas.nextLine();
            for (int i = 0; i < n; i++) {
                String prekesEilute = skaitytuvas.nextLine();
                String[] prekesEiluteIsskaldyta = prekesEilute.split(",");
                int id = Integer.parseInt(prekesEiluteIsskaldyta[0]);
                String pavadinimas = prekesEiluteIsskaldyta[1];
                double kaina = Double.parseDouble(prekesEiluteIsskaldyta[2]);
                int kiekisSandelyje = Integer.parseInt(prekesEiluteIsskaldyta[3]);
                String kategorija = prekesEiluteIsskaldyta[4];

                Preke preke = new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
                prekes[i] = preke;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tokio failo nėra.");
            throw new RuntimeException(e);
        }
        return prekes;
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



}
