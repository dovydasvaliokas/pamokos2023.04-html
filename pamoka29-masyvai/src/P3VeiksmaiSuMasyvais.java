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

        // 18:55 masyvų klonavimas negalimas per lygybę, nes tada nusikopijuoja tik adresas atmintyje
//        int[] skaiciaiKopija = skaiciai;
//        isvestiMasyva(skaiciaiKopija);
//
//        skaiciai[0] = 100;
//        skaiciai[1] = 200;
//        isvestiMasyva(skaiciai);
//        isvestiBruksnelius();
//        isvestiMasyva(skaiciaiKopija);

        System.out.println("Masyve teigiamų skaičių yra: " + kiekTeigiamu(skaiciai));
        isvestiBruksnelius();
        int[] teigiamiSkaiciai = filtruotiTeigiamus(skaiciai);
        isvestiMasyva(teigiamiSkaiciai);


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
        int[] prafiltruotas = new int[kiekTeigiamu(masyvas)];
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                prafiltruotas[j] = masyvas[i];
                j++;
            }
        }
        return prafiltruotas;
    }

    public static int kiekTeigiamu(int[] masyvas) {
        int kiekis = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                kiekis++;
            }
        }
        return kiekis;
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
