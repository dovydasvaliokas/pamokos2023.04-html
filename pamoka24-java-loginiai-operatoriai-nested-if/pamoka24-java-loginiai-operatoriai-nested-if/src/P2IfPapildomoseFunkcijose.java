public class P2IfPapildomoseFunkcijose {
    public static void main(String[] args) {
        System.out.println("arIntervale(5, 10, 24) = " + arIntervale(5, 10, 24));
        System.out.println("arIntervale(10, -10, 20) = " + arIntervale(10, -10, 20));
        isvestiBruksniukus();

        System.out.println("kurisDidziausiasIsTriju(5, 8, 9) = " + kurisDidziausiasIsTriju(5, 8, 9));
        System.out.println("kurisDidziausiasIsTriju(8, 8, 5) = " + kurisDidziausiasIsTriju(8, 8, 5));
        System.out.println("kurisDidziausiasIsTriju(7, -2, -30) = " + kurisDidziausiasIsTriju(7, -2, -30));
        System.out.println("kurisDidziausiasIsTriju(5000, 50000, 5000) = " + kurisDidziausiasIsTriju(5000, 50000, 5000));
        isvestiBruksniukus();

        System.out.println("arDalinasiIsYIrZ(20, 5, 4) = " + arDalinasiIsYIrZ(20, 5, 4));
        System.out.println("arDalinasiIsYIrZ(12, 6, 3) = " + arDalinasiIsYIrZ(12, 6, 3));
        System.out.println("arDalinasiIsYIrZ(17, 3, 2) = " + arDalinasiIsYIrZ(17, 3, 2));
        System.out.println("arDalinasiIsYIrZ(20, 5, 0) = " + arDalinasiIsYIrZ(20, 5, 0));
        System.out.println("arDalinasiIsYIrZ(0, 20, 50) = " + arDalinasiIsYIrZ(0, 20, 50));

    }

    /**
     * Funkcija išveda brūkšniukus į konsolę
     */
    public static void isvestiBruksniukus() {
        System.out.println("--------------");
    }

    /**
     * Funkcija patikrina ar skaičius yra intervale nuo intervaloPradzia (neimtinai) iki intervaloPabaiga (neimtinai)
     * @param skaicius tikrinamas skaičius
     * @param intervaloPradzia intervalo pradžia
     * @param intervaloPabaiga intervalo pabaiga.
     * @return true, jeigu yra intervale, false, jeigu nėra.
     */
    public static boolean arIntervale(int skaicius, int intervaloPradzia, int intervaloPabaiga) {
        return skaicius > intervaloPradzia && skaicius < intervaloPabaiga;
    }

    /**
     * Patikrina, kuris skaičius yra didžiausias iš trijų
     * @param a pirmas skaičius
     * @param b antras skaičius
     * @param c trečias skaičius
     * @return 0, jeigu yra keli didžiausi, 1 - jeigu pirmas yra didžiausias,
     * 2 - jeigu antras didžiausias, 3 - jeigu trečias didžiausias
     */
    public static byte kurisDidziausiasIsTriju(int a, int b, int c) {
        if (a > b && a > c) {
            return 1;
        } else if (b > a && b > c) {
            return 2;
        } else if (c > a && c > b) {
            return 3;
        } else {
            return 0;
        }
    }

    /**
     * Funkcija patikrina ar skaičius dalinasi be liekanos iš dviejų kitų skaičių.
     * @param x skaičius, kurį dalinsim
     * @param y pirmas skaičius, iš kurio dalinam
     * @param z antras skaičius, iš kurio dalinam
     * @return false, jeigu nesidalina iš abiejų, true jeigu dalinasi iš abiejų
     * jeigu y arba z yra 0, tai iš karto grąžina false, kad nebandytų dalyti iš 0 ir neišmestų erroro
     */
    public static boolean arDalinasiIsYIrZ(int x, int y, int z) {
        if (y == 0 || z == 0) {
            return false;
        }
        return x % y == 0 && x % z == 0;
    }


}
