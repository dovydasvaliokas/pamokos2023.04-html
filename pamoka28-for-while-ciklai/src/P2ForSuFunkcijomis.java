import java.util.Scanner;

public class P2ForSuFunkcijomis {
    public static void main(String[] args) {
        // 1.1 pvz
        isvestiIntervaloSkaicius(5, 20);
        isvestiBruksnelius();

        // 1.2 pvz
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite pradžią: ");
        int pradzia = skaitytuvas.nextInt();
        System.out.println("Įveskite pabaigą: ");
        int pabaiga = skaitytuvas.nextInt();
        isvestiIntervaloSkaicius(pradzia, pabaiga);
        isvestiBruksnelius();

        // 2 pvz
        int suma = intervaloSuma(5, 10);
        System.out.println("suma = " + suma);
        isvestiBruksnelius();

        // 3pvz
        isvestiIntervaloTrejetoIrPenketoKartotinius(11, 112);
        isvestiBruksnelius();

        // 4 pvz
        String tekstas = "Šiandien yra trečiadienis";
        char raide = 'a';
        int kiekKartojasi = kiekKartuKartojasiSimbolis(tekstas, raide);
        System.out.println("kiekKartojasi = " + kiekKartojasi);
    }

    public static void isvestiBruksnelius() {
        System.out.println("-------------------");
    }

    // 1 pavyzdys
    public static void isvestiIntervaloSkaicius(int pradzia, int pabaiga) {
        for (int i = pradzia; i < pabaiga; i++) {
            System.out.println(i);
        }
    }

    // 2pavyzdys
    public static int intervaloSuma(int pradzia, int pabaiga) {
        int suma = 0;
        for (int i = pradzia; i < pabaiga; i++) {
            suma += i;
        }
        return suma;
    }


    // 3 pavyzdys
    public static boolean arTrejetoIrPenketoKartotinis(int skaicius) {
        if (skaicius % 3 == 0 && skaicius % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 3 pavyzdys
    public static void isvestiIntervaloTrejetoIrPenketoKartotinius(int pradzia, int pabaiga) {
        for (int i = pradzia; i < pabaiga; i++) {
            if (arTrejetoIrPenketoKartotinis(i)) {
                System.out.println(i);
            }
        }
    }

    // 4 pavyzdys
    public static int kiekKartuKartojasiSimbolis(String s1, char simbolis) {
        int kiekis = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == simbolis) {
                kiekis++;
            }
        }
        return kiekis;
    }
}
