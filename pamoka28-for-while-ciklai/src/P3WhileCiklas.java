public class P3WhileCiklas {
    public static void main(String[] args) {
        // 1pavyzdys
        isvestiIntervala(5, 10);
        isvestiBruksniukus();

        // 2pavyzdys
        int suma = skaitmenuSuma(25784);
        System.out.println("suma = " + suma);

    }

    public static void isvestiBruksniukus() {
        System.out.println("-------------------");
    }

    // 1 pavyzdys
    public static void isvestiIntervala(int pradzia, int pabaiga) {
        while (pradzia < pabaiga) {
            System.out.println(pradzia);
            pradzia++;
        }
    }

    // 2 pavyzdys
    public static int skaitmenuSuma(int skaicius) {
        int suma = 0;
        while (skaicius > 0) {
            int skaitmuo = skaicius % 10;
            skaicius /= 10;
            suma += skaitmuo;
        }
        return suma;
    }
}
