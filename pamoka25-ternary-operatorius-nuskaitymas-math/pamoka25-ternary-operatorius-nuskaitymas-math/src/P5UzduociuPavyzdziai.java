import java.util.Scanner;

public class P5UzduociuPavyzdziai {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite apskritimo spindulį");
        double r = skait.nextDouble();
        System.out.println("Plotas su " + r + " spinduliu yra: " + apskritimoPlotas(r));

        System.out.println("Įveskite pirmą trikampio kraštinę");
        double a = skait.nextDouble();
        System.out.println("Įveskite antrą trikampio kraštinę");
        double b = skait.nextDouble();
        System.out.println("Įveskite trecią trikampio kraštinę");
        double c = skait.nextDouble();

        double plotas = trikampioPlotas(a, b, c);
        System.out.println("Trikamio plotas su " + a + ", " + b + ", " + c + " kraštinėmis yra: " + plotas);

    }

    public static double apskritimoPlotas(double r) {
        return Math.PI * r * r;
    }

    public static double trikampioPerimetras(double a, double b, double c) {
        return a + b + c;
    }

    public static double trikampioPlotas(double a, double b, double c) {
        double p = trikampioPerimetras(a, b, c);
        double plotas = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return plotas;
    }
}
