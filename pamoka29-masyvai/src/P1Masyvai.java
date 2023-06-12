import java.util.Arrays;

public class P1Masyvai {
    public static void main(String[] args) {
        // 1 pavyzdys
        int[] masyvas = {3, 5, 7, -14, -7, 8, 25, 9};
        System.out.println(masyvas);        // toks išvedimas išves tik tai masyvo hashcode (adresą kompiuterio atmintyje), o ne pačius elementus
        // Sekantis išvedimas masyvą jau išves normaliai suformatuotą.
        System.out.println(Arrays.toString(masyvas));

        // 2 pavyzdys
        String[] zodziai = {"bet kas", "tekstas", "pirmadienis", "diena", "Dar kazkoks tekstas"};
        System.out.println(Arrays.toString(zodziai));

        // 3 pavyzyds
        double[] skaiciai = {12.75, 15.27, 18, 14, -10.257, 251112.257};
        System.out.println(Arrays.toString(skaiciai));

        // 4 pavyzdys
        int[] mas = {17, 25, 69, 7, 58, 25, 74};
        System.out.println("mas = " + Arrays.toString(mas));
        System.out.println("mas[2] = " + mas[2]);

        // 5 pavyzdys
        System.out.println("mas.length = " + mas.length);
        System.out.println("mas[mas.length] = " + mas[mas.length - 1]);

        // 6 pavyzdys
        int suma1 = mas[3] + mas[5];
        System.out.println("suma1 = " + suma1);
        int suma2 = mas[0] + mas[mas.length - 1];
        System.out.println("suma2 = " + suma2);

        // 7 pavyzdys
        System.out.println("mas[mas.length / 2] = " + mas[mas.length / 2]);

    }
}
