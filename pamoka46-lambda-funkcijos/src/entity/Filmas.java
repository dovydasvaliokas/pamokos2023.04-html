package entity;

public class Filmas {
    private String pavadinimas;
    private String zanras;
    private String studija;
    private int ziurovuIvertinimas;
    private double pelningumas;
    private int ekspertuIvertinimas;
    private double pajamos;
    private int isleidimoMetai;

    public Filmas() {
    }

    public Filmas(String pavadinimas, String zanras, String studija, int ziurovuIvertinimas, double pelningumas, int ekspertuIvertinimas, double pajamos, int isleidimoMetai) {
        this.pavadinimas = pavadinimas;
        this.zanras = zanras;
        this.studija = studija;
        this.ziurovuIvertinimas = ziurovuIvertinimas;
        this.pelningumas = pelningumas;
        this.ekspertuIvertinimas = ekspertuIvertinimas;
        this.pajamos = pajamos;
        this.isleidimoMetai = isleidimoMetai;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public String getStudija() {
        return studija;
    }

    public void setStudija(String studija) {
        this.studija = studija;
    }

    public int getZiurovuIvertinimas() {
        return ziurovuIvertinimas;
    }

    public void setZiurovuIvertinimas(int ziurovuIvertinimas) {
        this.ziurovuIvertinimas = ziurovuIvertinimas;
    }

    public double getPelningumas() {
        return pelningumas;
    }

    public void setPelningumas(double pelningumas) {
        this.pelningumas = pelningumas;
    }

    public int getEkspertuIvertinimas() {
        return ekspertuIvertinimas;
    }

    public void setEkspertuIvertinimas(int ekspertuIvertinimas) {
        this.ekspertuIvertinimas = ekspertuIvertinimas;
    }

    public double getPajamos() {
        return pajamos;
    }

    public void setPajamos(double pajamos) {
        this.pajamos = pajamos;
    }

    public int getIsleidimoMetai() {
        return isleidimoMetai;
    }

    public void setIsleidimoMetai(int isleidimoMetai) {
        this.isleidimoMetai = isleidimoMetai;
    }

    @Override
    public String toString() {
        return "Filmas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", zanras='" + zanras + '\'' +
                ", studija='" + studija + '\'' +
                ", ziurovuIvertinimas=" + ziurovuIvertinimas +
                ", pelningumas=" + pelningumas +
                ", ekspertuIvertinimas=" + ekspertuIvertinimas +
                ", pajamos=" + pajamos +
                ", isleidimoMetai=" + isleidimoMetai +
                '}';
    }

    public String toCsv() {
        return pavadinimas + "," + zanras + "," + studija + "," + ziurovuIvertinimas + "," + pelningumas + ","
                + ekspertuIvertinimas + "," + pajamos + "," + isleidimoMetai;

    }

    public boolean arPelningas() {
        return pelningumas > 0;
    }

    public boolean arPelningas(double pelnas) {
        return pelningumas > pelnas;
    }
}
