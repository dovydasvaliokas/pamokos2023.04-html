package pavyzdys1;

public class Preke {
    String pavadinimas;
    double kaina;
    int kiekisSandelyje;
    int id;
    String kategorija;

    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                ", kiekisSandelyje=" + kiekisSandelyje +
                ", id=" + id +
                ", kategorija='" + kategorija + '\'' +
                '}';
    }
}
