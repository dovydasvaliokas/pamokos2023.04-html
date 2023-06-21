package pavyzdys2klasiumetodai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Trikampis trikampis1 = new Trikampis(14, 5, 10);
        System.out.println("trikampis1 = " + trikampis1);
        System.out.println("trikampis1.perimetras() = " + trikampis1.perimetras());
        System.out.println("trikampis1.plotas() = " + trikampis1.plotas());

        Trikampis trikampis2 = new Trikampis(11, 5.44, 13);
        System.out.println("trikampis2.plotas() = " + trikampis2.plotas());

        System.out.println("Kuris didesnis trikampis: " + trikampis1.palygintiTrikampi(trikampis2));


        // papildomas priminimas
        String s1 = "belekas";
        String s2 = "antras";
        System.out.println("s1 = " + s1.compareTo(s2));

        Trikampis trikampis3 = new Trikampis(7, 2.5, 5);
        System.out.println("Ar panašūs: " + trikampis1.arPanasus(trikampis3));

    }
}
