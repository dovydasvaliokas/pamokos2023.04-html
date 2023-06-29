import java.util.Scanner;

public class MenuHelper {
    public static void menu() {
        String failoPav = "prekes.csv";
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite, kurį norite rinktis");
        System.out.println("1 - įvesti naują prekę");
        System.out.println("2 - apskaičiuoti visų prekių sumą");
        System.out.println("3 - surasti brangiausią prekę");
        System.out.println("4 - prafiltruoti pagal pasirinktą kategoriją");
        System.out.println("5 - išvesti visas prekes");
        int pasirinkimas = skaitytuvas.nextInt();
        switch(pasirinkimas) {
            case 1:
                Preke preke = PrekeIOHelper.nuskaitytiPrekeIsKonsoles();
                PrekeIOHelper.issaugotiVisasPrekesIFaila(preke, failoPav);
                break;
            case 2:
                Preke[] prekes = PrekeIOHelper.nuskaitytiPrekesIsFailo(failoPav);
                System.out.println("Visų prekių suma yra: " + PrekeHelper.prekiuKainuSuma(prekes));
                break;
            case 3:
                prekes = PrekeIOHelper.nuskaitytiPrekesIsFailo(failoPav);
                Preke brangiausiaPreke = PrekeHelper.surastiBrangiausia(prekes);
                System.out.println("Brangiausia prekė yra: ");
                System.out.println(brangiausiaPreke);
                break;
            case 4:
                System.out.println("Įveskite kategoriją: ");
                skaitytuvas.nextLine();
                String kategorija = skaitytuvas.nextLine();
                prekes = PrekeIOHelper.nuskaitytiPrekesIsFailo(failoPav);
                Preke[] prafiltruotos = PrekeHelper.filtruotiPagalKategorija(prekes, kategorija);
                System.out.println("Kategorijos " + kategorija + " prekės: ");
                PrekeHelper.isvestiPrekiuMasyvaEilutemis(prafiltruotos);
                break;
            case 5:
                System.out.println("Visos prekės: ");
                prekes = PrekeIOHelper.nuskaitytiPrekesIsFailo(failoPav);
                PrekeHelper.isvestiPrekiuMasyvaEilutemis(prekes);
                break;
            default:
                System.out.println("Įvestas neteisingas pasirinkimas");
        }

    }
}
