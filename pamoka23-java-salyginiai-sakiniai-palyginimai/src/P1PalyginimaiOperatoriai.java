public class P1PalyginimaiOperatoriai {
    public static void main(String[] args) {
        // Sudėtis
        int suma = 25 + 37;
        System.out.println("suma = " + suma);
        String tekstas = "bet kas" + " kažkas";
        System.out.println("tekstas = " + tekstas);

        // Atimtis
        double atimtis = 25 - 10.254854;
        System.out.println("atimtis = " + atimtis);

        // Daugyba
        int daugyba = 2 * 50;
        System.out.println("daugyba = " + daugyba);

        // Dalyba
        int x = 20;
        int y = 3;
        double dalyba = (double) x / y;
        System.out.println("dalyba = " + dalyba);

        // Liekana
        int liekana = 20 % 3;
        System.out.println("liekana = " + liekana);

        // Daugiau
        boolean daugiau = 5 > 3;
        System.out.println("daugiau = " + daugiau);

        // Mažiau
        boolean maziau = 5 < 3;
        System.out.println("maziau = " + maziau);

        // Daugiau arba lygu
        boolean daugiauLygu = 5 >= 5;
        System.out.println("daugiauLygu = " + daugiauLygu);

        // Mažiau arba lygu
        boolean maziauLygu = 5 <= 3;
        System.out.println("maziauLygu = " + maziauLygu);

        // Lygu
        boolean arLygu1 = 5 == 5;
        boolean arLygu2 = 7 == 3;
        System.out.println("arLygu1 = " + arLygu1);
        System.out.println("arLygu2 = " + arLygu2);

        boolean tekstaiLygu1 = "tekstas" == "tekstasasdasdasd";     // TOKIO LYGINIMO SU TEKSTINIAIS KINTAMAISIAS DERĖTŲ VENGTI
        System.out.println("tekstaiLygu1 = " + tekstaiLygu1);
        boolean tekstaiLygu2 = "tekstas".equals("tekstas");
        System.out.println("tekstaiLygu2 = " + tekstaiLygu2);

        String s1 = "sekmadienis";
        String s2 = "sekmadienis23";
        boolean tekstaiLygu3 = s1.equals(s2);
        System.out.println("tekstaiLygu3 = " + tekstaiLygu3);

        // += operatorius (pridėti)
        int sk1 = 5;
        sk1 += 20;
        System.out.println("sk1 = " + sk1);

        String s3 = "Šiandien";
        s3 += " yra sekmadienis";
        System.out.println("s3 = " + s3);

        // -= operatorius (atimti)
        int sk2 = 10;
        sk2 -= 7;
        System.out.println("sk2 = " + sk2);

        // *= operatorius (padauginti)
        int sk3 = 10;
        sk3 *= 4;
        System.out.println("sk3 = " + sk3);

        // /= operatorius (padalina)
        int sk4 = 80;
        sk4 /= 10;
        System.out.println("sk4 = " + sk4);

        // ++ operatorius (padidinti vienetu)
        int sk5 = 10;
        sk5++;
        System.out.println("sk5 = " + sk5);

        int sk6 = 200;
        System.out.println("sk6 = " + sk6++);
        System.out.println("sk6 = " + sk6);

        int sk7 = 200;
        System.out.println(++sk7);

        // -- operatorius (sumazinti vienetu)
        int sk8 = 50;
        System.out.println(sk8--);
        System.out.println(sk8);
        System.out.println(--sk8);
    }
}
