public class P2Funkcijos {
    public static void main(String[] args) {
        isvestiBruksniukus();

        int rezultatas = pakeltiKvadratu(5);
        System.out.println("rezultatas = " + rezultatas);
        int x = 15;
        int rezultatas2 = pakeltiKvadratu(x);
        System.out.println("rezultatas2 = " + rezultatas2);
        System.out.println("pakeltiKvadratu(10) = " + pakeltiKvadratu(10));
        System.out.println("X kvadratas yra: " + pakeltiKvadratu(x));

        isvestiBruksniukus();

        double a1 = 15.212;
        double b1 = 215.15;
        double plotas1 = staciakampioPlotas(a1, b1);
        System.out.println("plotas1 = " + plotas1);

        int a2 = 15;
        int b2 = 20;
        int plotas2 = (int) staciakampioPlotas(a2, b2);
        System.out.println("plotas2 = " + plotas2);

        isvestiBruksniukus();

        String s1 = "Medis";
        String s1Pakartotinai = zodisTrisKartusAtskirtasTarpais(s1);
        System.out.println("s1Pakartotinai = " + s1Pakartotinai);
    }

    public static void isvestiBruksniukus() {
        System.out.println("--------------------");
    }

    public static int pakeltiKvadratu(int skaicius) {
        return skaicius * skaicius;
    }

    public static double staciakampioPlotas(double a, double b) {
        return a * b;
    }

    public static String zodisTrisKartusAtskirtasTarpais(String zodis) {
        return zodis + " " + zodis + " " + zodis;
    }
}
