import duombaze.DbVeiksmai;
import entity.Produktas;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        // 1 pavyzdys gauname produkta pagal id
        Produktas produktas = DbVeiksmai.gautiProduktaPagalId(jungtis, 5);
        System.out.println(produktas);

        // 2 pavyzdys gauname visus produktus kurie yra brangesni uz 300
        ArrayList<Produktas> brangesniUz300 = DbVeiksmai.gautiProduktusBrangesniusUz(jungtis, 300);
        System.out.println("Brangesni uz 300");
        brangesniUz300.forEach(p -> System.out.println(p));

        // 3 pavyzdys ištriname produktą, kurio id yra 27
        int kiekIstryne = DbVeiksmai.istrintiProduktaPagalId(jungtis, 27);
        System.out.println("Buvo ištrinta " + kiekIstryne + " įrašų");

        // 4 pavyzdys idedame produkta i duombaze
        Produktas naujasProduktas = new Produktas();
        naujasProduktas.setPavadinimas("Kompiuteris");
        naujasProduktas.setKaina(789.99);
        int kiekPridejo = DbVeiksmai.pridetiProdukta(jungtis, naujasProduktas);
        System.out.println("Buvo pridėta " + kiekPridejo + " įrašų");

        // 5 pavyzdys atnaujiname 5 produkta
        Produktas atnaujinamasProd = new Produktas(5, "Rašomasis stalas", 399.79);
        int kiekAtnaujino = DbVeiksmai.atnaujintiProdukta(jungtis, atnaujinamasProd);
        System.out.println("Buvo atnaujinta " + kiekAtnaujino + " įrašų");

    }
}
