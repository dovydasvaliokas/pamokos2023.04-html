import entity.Filmas;
import utility.FilmasFailaiUtility;
import utility.FilmasUtility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filmas> filmai = FilmasFailaiUtility.nuskaitytiFilmusIsFailo("filmai.csv");
        System.out.println("filmai = " + filmai);
        Filmas pelningiausias = FilmasUtility.pelningiausiasFilmas(filmai);
        System.out.println("pelningiausias = " + pelningiausias);
        String studijaIeskoma = "Independent";
        ArrayList<Filmas> independentFilmai = FilmasUtility.filtruotiPagalStudija(studijaIeskoma, filmai);
        FilmasUtility.isvestiFilmus(independentFilmai);
        Filmas saugojamasFilmas = FilmasFailaiUtility.nuskaitytiFilmaIsKonsoles();
        FilmasFailaiUtility.issaugotiFilmaFaile(saugojamasFilmas, "filmai.csv");
    }
}
