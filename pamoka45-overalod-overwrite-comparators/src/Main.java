import comparators.FilmasByPavadinimas;
import comparators.FilmasByPelningumas;
import comparators.FilmasByStudija;
import entity.Filmas;
import utility.FilmasFailaiUtility;
import utility.FilmasUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filmas> filmai = FilmasFailaiUtility.nuskaitytiFilmusIsFailo("filmai.csv");
//        FilmasUtility.isvestiFilmus(filmai);

        // overload funkciju panaudojimas
        System.out.println("Ar filmas pelningas: " + filmai.get(1).arPelningas());
        System.out.println("Ar filmas yra pelningesnis už 2 " + filmai.get(1).arPelningas(2));

        Comparator<Filmas> pagalPelninguma = new FilmasByPelningumas();
        Collections.sort(filmai, pagalPelninguma);
        FilmasUtility.isvestiFilmus(filmai);
        System.out.println("----------------------------");
        Collections.sort(filmai, pagalPelninguma.reversed());
        FilmasUtility.isvestiFilmus(filmai);

        System.out.println("----------------------------------------------------");
        Comparator<Filmas> pagalStudija = new FilmasByStudija();
        Comparator<Filmas> pagalPavadinimaPriesingai = new FilmasByPavadinimas().reversed();
        Comparator<Filmas> pagalStudijaTadaPagalPavadinimaPriesingai = pagalStudija.thenComparing(pagalPavadinimaPriesingai);
        Collections.sort(filmai, pagalStudijaTadaPagalPavadinimaPriesingai);
//        Collections.sort(filmai, pagalStudija.thenComparing(pagalPavadinimaPriesingai));
        FilmasUtility.isvestiFilmus(filmai);
    }
}
