public class P1TernaryOperatorius {
    public static void main(String[] args) {
        // 1 Pavyzdys priskiriant prie kintamojo
        int x = 5;
        String zinute = x > 10 ? "X yra daugiau už 10" : "X yra mažiau arba lygu 10";
        System.out.println("zinute = " + zinute);

        // 2 pvz
        System.out.println("arTeigiamas(5) = " + arTeigiamas(5));
        System.out.println("arTeigiamas(-20) = " + arTeigiamas(-20));
    }

    public static String arTeigiamas(int x) {
        return x > 0 ? "Teigiamas" : "Neigiamas arba nulis";
    }

    public static int palygintiSkaicius(int x, int y) {
        return x > y ? -1 : x == y ? 0 : 1;
    }
}
