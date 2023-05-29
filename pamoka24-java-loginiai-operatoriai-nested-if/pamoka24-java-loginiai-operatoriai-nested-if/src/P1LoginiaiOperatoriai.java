public class P1LoginiaiOperatoriai {
    public static void main(String[] args) {
        // AND operatorius (&&)
        // 1 and pvz
        boolean b1 = 5 > 3 && 10 > 4;
        System.out.println("b1 = " + b1);

        // 2 and pvz
        if (20 < 5 && 10 < 30) {
            System.out.println("Jungtinė sąlyga yra teisinga");
        }
        else {
            System.out.println("Bendra sąlyga nėra teisinga");
        }

        // 3 pavyzydys
        if (20 > 10 && -100 > -200 && 15 > 10) {
            System.out.println("Skaičiai didesni pagal sąlygą");
        }

        // OR operatorius (||)
        // 1 pvz
        boolean b2 = 5 < -5 || 5 >= 5;
        System.out.println("b2 = " + b2);

        // 2 pavyzdys
        int x = 8;
        if (x > 10 || x < -10) {
            System.out.println("Skaičius nėra intervale tarp -10 ir 10");
        }
        else {
            System.out.println("skaičius intervale nuo -10 iki 10");
        }

        // 3 pavyzdys
        int a = 5;
        int b = 8;
        int c = 10;
        if ((a < b && b > c || a + b > c) && (12 > 10 || 5 > 8)) {
            System.out.println("Šitas IF yra tiesa");
        }
    }
}
