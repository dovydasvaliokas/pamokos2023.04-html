import java.util.Arrays;

public class PrekeHelper {
    public static double prekiuKainuSuma(Preke[] prekes) {
        double suma = 0;
        for (int i = 0; i < prekes.length; i++) {
            suma += prekes[i].getKaina();
        }
        return Math.floor(Math.round(suma * 100)) / 100;
    }

    public static Preke surastiBrangiausia(Preke[] prekes) {
        Preke max = prekes[0];
        for (int i = 1; i < prekes.length; i++) {
            if (prekes[i].getKaina() > max.getKaina()) {
                max = prekes[i];
            }
        }
        return max;
    }

    public static Preke[] filtruotiPagalKategorija(Preke[] prekes, String ieskomaKategorija) {
        Preke[] prafiltruotos = new Preke[prekes.length];
        int n = 0;

        for (int i = 0; i < prekes.length; i++) {
            if (prekes[i].getKategorija().equals(ieskomaKategorija)) {
                prafiltruotos[n++] = prekes[i];
            }
        }
        return Arrays.copyOf(prafiltruotos, n);
    }

    public static void isvestiPrekiuMasyvaEilutemis(Preke[] prekes) {
        for (int i = 0; i < prekes.length; i++) {
            System.out.println(prekes[i]);
        }
    }

}
