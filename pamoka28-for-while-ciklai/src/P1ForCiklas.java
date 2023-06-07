public class P1ForCiklas {
    public static void main(String[] args) {
        // 1 pvz
        String s1 = "Šiandien yra graži diena";
        for (int i = 0; i < 5; i++) {
            System.out.println("Tekstas: ");
            System.out.println(s1);
        }
        isvestiBruksnelius();

        // 2pvz
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        isvestiBruksnelius();

        // 3pvz
        int pradzia = 20;
        int pabaiga = 33;
        for (int i = pradzia; i < pabaiga; i++) {
            System.out.println("i = " + i);
        }
        isvestiBruksnelius();

        // 4pvz
        String s2 = "Pirmos eilutės tekstas";
        String s3 = "Antros eilutės tekstas";
        for (int i = 0; i < 10; i++) {
            System.out.println(s2);
            System.out.println(s3);
            isvestiBruksnelius();
        }



    }

    public static void isvestiBruksnelius() {
        System.out.println("-------------------");
    }
}
