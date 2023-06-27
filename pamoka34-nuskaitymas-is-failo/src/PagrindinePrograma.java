import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke[] prekes = nuskaitytiPrekesIsFailo("prekes.csv");
        System.out.println("prekes = " + Arrays.toString(prekes));
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
