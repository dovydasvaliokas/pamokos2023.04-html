import java.util.Arrays;
import java.util.Scanner;

public class P2MasyvoNuskaitymas {
    public static void main(String[] args) {
        // 1 pavyzdys
        int[] masyvas = new int[8];
        System.out.println("masyvas = " + Arrays.toString(masyvas));
        masyvas[0] = 24;
        masyvas[1] = -17;
        masyvas[2] = 18;
        masyvas[3] = 57;
        masyvas[4] = 122;
        masyvas[5] = masyvas[0] + masyvas[3];
        masyvas[6] = masyvas[4] - masyvas[2];
        masyvas[7] = 27;
        System.out.println("masyvas = " + Arrays.toString(masyvas));

        // 2 pavyzdys
        int[] skaiciai = nuskaitytiMasyvaIsKonsoles();
        System.out.println("skaiciai = " + Arrays.toString(skaiciai));
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
