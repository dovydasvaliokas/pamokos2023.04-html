import java.util.Scanner;

public class P2NuskaitymasIsKonsoles {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);

        // 1 Pavyzdys nuskaitome įvairius kintamuosius su scanneriu iš konsolės
        System.out.println("Įveskite tekstą eilutėje");
        String s1 = skait.nextLine();
        System.out.println("s1 = " + s1);

        System.out.println("Įveskite sveiką skaičių: ");
        int x1 = skait.nextInt();
        System.out.println("x1 = " + x1);

        System.out.println("Įveskite realųjį skaičių:");
        double d1 = skait.nextDouble();
        System.out.println("d1 = " + d1);

        System.out.println("Įveskite boolean reikšmę:");
        boolean b1 = skait.nextBoolean();
        System.out.println("b1 = " + b1);

        // 2 pavyzdys
        System.out.println("------------");
        System.out.println("Įveskite skaičių: ");
        int x2 = skait.nextInt();
        System.out.println("x2 = " + x2);

        System.out.println("Įveskite tekstą: ");
        skait.nextLine();           // po skaičiaus bandant skaityti tekstą, būtinai reikia "nudeginti" vieną eilutę
        String s2 = skait.nextLine();
        System.out.println("s2 = " + s2);

        System.out.println("Įveskite skaičių: ");
        short x3 = skait.nextShort();
        System.out.println("x3 = " + x3);

    }


}
