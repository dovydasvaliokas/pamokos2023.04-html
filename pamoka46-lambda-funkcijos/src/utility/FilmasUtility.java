package utility;

import entity.Filmas;

import java.util.ArrayList;

public class FilmasUtility {
    public static Filmas pelningiausiasFilmas(ArrayList<Filmas> filmai) {
        Filmas maxPelningiausias = filmai.get(0);
        for (Filmas filmas : filmai) {
            if (filmas.getPelningumas() > maxPelningiausias.getPelningumas()) {
                maxPelningiausias = filmas;
            }
        }
        return maxPelningiausias;
    }

    public static ArrayList<Filmas> filtruotiPagalStudija(String studija, ArrayList<Filmas> filmai) {
        ArrayList<Filmas> prafiltruoti = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getStudija().equalsIgnoreCase(studija)) {
                prafiltruoti.add(filmas);
            }
        }
        return prafiltruoti;
    }

    public static void isvestiFilmus(ArrayList<Filmas> filmai) {
        for (Filmas filmas : filmai) {
            System.out.println("filmas = " + filmas);
        }
    }
}
