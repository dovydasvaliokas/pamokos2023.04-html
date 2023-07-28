import entity.Filmas;
import utility.FilmasFailaiUtility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filmas> filmai = FilmasFailaiUtility.nuskaitytiFilmusIsFailo("filmai.csv");
        filmai.forEach(f -> System.out.println(f));
        System.out.println("---------------------------------------------");
        // rikiuojam didėjančia tvarka
        Collections.sort(filmai, (f1, f2) -> Double.compare(f1.getPelningumas(), f2.getPelningumas()));
        filmai.forEach(f -> System.out.println(f));
        // rikiuojam mažėjančia tvarka
        Collections.sort(filmai, (f1, f2) -> Double.compare(f2.getPelningumas(), f1.getPelningumas()));
        System.out.println("-------------------------------------------------------------");

        // rikiuojam pagal kelias savybes
        Comparator<Filmas> pagalMetus = (f1, f2) -> Double.compare(f1.getIsleidimoMetai(), f2.getIsleidimoMetai());
        Comparator<Filmas> pagalZiurovuVertinimas = (f1, f2) -> Double.compare(f1.getZiurovuIvertinimas(), f2.getZiurovuIvertinimas());
        Collections.sort(filmai, pagalMetus.thenComparing(pagalZiurovuVertinimas.reversed()));
        filmai.forEach(f -> System.out.println(f));

        // Surikiuokime pagal ekspertu ivertinimus mazejancia tvarka ir isveskime i faila
        Collections.sort(filmai, (f1, f2) -> Integer.compare(f2.getEkspertuIvertinimas(), f1.getEkspertuIvertinimas()));
        filmai.forEach(f -> FilmasFailaiUtility.issaugotiFilmaFaile(f, "filmaiSurikiuotiPagalEskerptuVertinima.csv"));

        System.out.println("-----------------------------------------------");
        // Pasidarome filmu listo kopija ir toje kopijoje isfiltruojame tik tuos filmus, kurie yra pelningesni nei 10
        ArrayList<Filmas> pelningesniNei10 = new ArrayList<>(filmai);
        pelningesniNei10.removeIf(f -> f.getPelningumas() < 10);
        pelningesniNei10.forEach(f -> System.out.println(f.getPavadinimas() + " " + f.getPelningumas()));
        filmai.forEach(f -> System.out.println(f));
    }
}
