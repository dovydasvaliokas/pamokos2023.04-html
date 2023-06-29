public class Preke {
    private int id;
    private String pavadinimas;
    private double kaina;
    private int kiekisSandelyje;
    private String kategorija;

    public Preke(int id, String pavadinimas, double kaina, int kiekisSandelyje, String kategorija) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekisSandelyje = kiekisSandelyje;
        this.kategorija = kategorija;
    }

    public Preke() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public int getKiekisSandelyje() {
        return kiekisSandelyje;
    }

    public void setKiekisSandelyje(int kiekisSandelyje) {
        this.kiekisSandelyje = kiekisSandelyje;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "id=" + id +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                ", kiekisSandelyje=" + kiekisSandelyje +
                ", kategorija='" + kategorija + '\'' +
                '}';
    }

    public String toStringCsvFormatu() {
        return id + "," + pavadinimas + "," + kaina + "," + kiekisSandelyje + "," + kategorija;
    }


}
