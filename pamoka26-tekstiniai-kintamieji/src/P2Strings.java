import java.text.Collator;
import java.util.Locale;

public class P2Strings {
    public static void main(String[] args) {
        // 1 pvz paimame konkretu String simboli
        String s1 = "Treci8adienis";
        char c1 = s1.charAt(4);
        System.out.println("c1 = " + c1);
        System.out.println("ar 4 pagal indeksa yra raide: " + Character.isAlphabetic(s1.charAt(4)));
        System.out.println("ar 5 pagal indeksa yra raide: " + Character.isAlphabetic(s1.charAt(5)));
        isvestiBruksniukus();

        // 2 tekstinio kintamojo ilgis
        String s2 = "kelmas";
        int s2Ilgis = s2.length();
        System.out.println("s2Ilgis = " + s2Ilgis);
        System.out.println("s2.length() = " + s2.length());
        // gaunu paskutini simboli
        char paskutinis = s2.charAt(s2.length() - 1);
        System.out.println("paskutinis = " + paskutinis);
        isvestiBruksniukus();

        // 3 pvz didziosios mazosios
        String s3 = "ĄsotIS ŽąsIS";
        String s4 = s3.toLowerCase();
        String s5 = s3.toUpperCase();
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        isvestiBruksniukus();

        // 4 pvz paieska ar egzistuoja tekstas tekste
        String s6 = "Čia yra kažkoks tekstas";
        String s7 = "kažkoks";
        String s8 = "bet kas";
        System.out.println("s6.contains(s7) = " + s6.contains(s7));
        System.out.println("s6.contains(s8) = " + s6.contains(s8));
        isvestiBruksniukus();

        // 5 pvz palyginimas ar tekstai lygus
        String s9 = "namas";
        String s10 = "namas";
        String s11 = "NAMAS";
        System.out.println("s9.equals(s10) = " + s9.equals(s10));
        System.out.println("s9.equals(s11) = " + s9.equals(s11));
        System.out.println("s9.equalsIgnoreCase(s11) = " + s9.equalsIgnoreCase(s11));
        isvestiBruksniukus();

        // 6 pvz paimame teksto tik dali substring
        String s12 = "Šiandien mokinamės tekstinius kintamuosius";
        String s13 = s12.substring(9, 18);
        System.out.println("s12 = " + s12);
        System.out.println("s13 = " + s13);
        String s14 = s12.substring(25);
        System.out.println("s14 = " + s14);
        String s15 = s12.substring(s12.length() - 5);
        System.out.println("s15 = " + s15);
        isvestiBruksniukus();

        // 7 pvz konvertavimas primityviu i String
        int x = 25;
        String s16 = String.valueOf(x);
        System.out.println("s16 + s16 = " + s16 + s16);
        isvestiBruksniukus();

        // 8 pvz su String.format()
        String s17 = "%s tarp skaičių %d ir %1.3f yra lygu %1.3f";
        String s18 = "Sudėtis";
        int i1 = 14;
        double d2 = 18.57;
        double suma = i1 + d2;
        System.out.println(String.format(s17, s18, i1, d2, suma));
    }

    public static void isvestiBruksniukus() {
        System.out.println("---------------");
    }
}
