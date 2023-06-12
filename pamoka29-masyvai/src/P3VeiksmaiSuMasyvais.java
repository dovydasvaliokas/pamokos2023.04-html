import java.util.Scanner;

public class P3VeiksmaiSuMasyvais {
    public static void main(String[] args) {
        int[] skaiciai = nuskaitytiMasyvaIsKonsoles();
        isvestiBruksnelius();
        isvestiMasyva(skaiciai);
        isvestiBruksnelius();
        int suma = masyvoSuma(skaiciai);
        System.out.println("Įvesto masyvo suma yra: " + suma);
        isvestiBruksnelius();

        int[] skaiciaiKopija = skaiciai;
        isvestiMasyva(skaiciaiKopija);

        skaiciai[0] = 100;
        skaiciai[1] = 200;
        isvestiMasyva(skaiciai);
        isvestiBruksnelius();
        isvestiMasyva(skaiciaiKopija);


    }

    public static void isvestiBruksnelius() {
        System.out.println("------------------------");
    }

    public static void isvestiMasyva(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("masyvas[" + i + "] = " + masyvas[i]);
        }
    }

    public static int masyvoSuma(int[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            suma += masyvas[i];
        }
        return suma;
    }

    public static int[] filtruotiTeigiamus(int[] masyvas) {
        return new int[2];
    }

    public static int[] nuskaitytiMasyvaIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek skaičių bus masyve: ");
        int n = skaitytuvas.nextInt();
        int[] masyvas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį elementą");
            int elementas = skaitytuvas.nextInt();
            masyvas[i] = elementas;
        }
        return masyvas;
    }
}
