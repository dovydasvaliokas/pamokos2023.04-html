package p3datastructures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = new ArrayList<>();
        // add funkcija (prideti elementus i arraylista)
        skaiciai.add(57);
        skaiciai.add(-140);
        skaiciai.add(0);
        skaiciai.add(25);

        // isvesti arraylista
        System.out.println("skaiciai = " + skaiciai);

        // pasaliname antra elementa
        skaiciai.remove(2);
        System.out.println("skaiciai = " + skaiciai);

        // pasaliname elementa, kurio reiksme yra 57
        skaiciai.remove((Integer)57);
        System.out.println("skaiciai = " + skaiciai);

        skaiciai.add(15);
        skaiciai.add(27);
        System.out.println("skaiciai = " + skaiciai);

        // pakeisti elementa
        skaiciai.set(3, -17);
        System.out.println("skaiciai = " + skaiciai);

        // gauti elementa
        System.out.println(skaiciai.get(0));


        //---------- max suradimo panaudojimas
        int didziausias = surastiDidziausia(skaiciai);
        System.out.println("didziausias = " + didziausias);

        // sumos panaudojimas
        int skSuma = suma(skaiciai);
        System.out.println("skSuma = " + skSuma);
    }

    public static int surastiDidziausia(ArrayList<Integer> skaiciai) {
        int max = skaiciai.get(0);
        for (int i = 0; i < skaiciai.size(); i++) {
            if (skaiciai.get(i) > max) {
                max = skaiciai.get(i);
            }
        }
        return max;
    }

    public static int suma(ArrayList<Integer> skaiciai) {
        int sum = 0;
        for (Integer skaicius : skaiciai) {
            sum += skaicius;
        }
        return sum;
    }
}
