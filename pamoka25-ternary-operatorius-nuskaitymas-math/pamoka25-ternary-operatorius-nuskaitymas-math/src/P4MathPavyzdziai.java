public class P4MathPavyzdziai {
    public static void main(String[] args) {
        // 1 abs() modulio pavyzdys
        int x1 = -17;
        int rez1 = Math.abs(x1);
        System.out.println("rez1 = " + rez1);

        // 2 sqrt kvadratinės šaknies funkcij
        int x2 = 45;
        double rez2 = Math.sqrt(x2);
        System.out.println("rez2 = " + rez2);

        // 3 pow() skaiciaus pakelimas laipsniu
        int x3 = 8;
        int x4 = 3;
        double rez3 = Math.pow(x3, x4);
        System.out.println("rez3 = " + rez3);

        // 4 cbrt() kubinė šaknis
        int x5 = 125;
        double rez4 = Math.cbrt(x5);
        System.out.println("rez4 = " + rez4);

        // 5 max() grąžina didžiausią iš dviejų
        int x6 = 14;
        int x7 = 18;
        int rez5 = Math.max(x6, x7);
        System.out.println("rez5 = " + rez5);

        // 6 min() grazina maziausia is dvieju
        double d1 = 2.057;
        double d2 = 1.958;
        double rez6 = Math.min(d1, d2);
        System.out.println("rez6 = " + rez6);

        // 7 ceil() lubos, grazina artimiausia aukstesni sveika skaiciu
        double d3 = 5;
        double d4 = 5.12;
        double rez7 = Math.ceil(d3);
        double rez8 = Math.ceil(d4);
        System.out.println("rez7 = " + rez7);
        System.out.println("rez8 = " + rez8);

        // 8 floor() grindys, grazina artimiausia zemesni sveika skaiciu
        double d5 = 5;
        double d6 = 4.97;
        double rez9 = Math.floor(d5);
        double rez10 = Math.floor(d6);
        System.out.println("rez9 = " + rez9);
        System.out.println("rez10 = " + rez10);

        // 9 round() apvalina, grazina artimiausia sveika skaiciu
        double d7 = 3.42;
        double d8 = 3.57;
        double rez11 = Math.round(d7);
        double rez12 = Math.round(d8);
        System.out.println("rez11 = " + rez11);
        System.out.println("rez12 = " + rez12);

    }
}
