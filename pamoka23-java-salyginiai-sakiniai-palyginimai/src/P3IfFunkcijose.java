public class P3IfFunkcijose {
    public static void main(String[] args) {
        boolean rez1 = arTeigiamas(20);
        System.out.println("rez1 = " + rez1);

        System.out.println(arTeigiamas(-200));

        int sk1 = 57;
        boolean rez2 = arTeigiamas(sk1);
        System.out.println("rez2 = " + rez2);

        int sk2 = 101;
        System.out.println("arLyginis(sk2) = " + arLyginis(sk2));

        int sk3 = 54;
        int sk4 = 60;
        System.out.println("palygintiDuSkaicius(sk3, sk4) = " + palygintiDuSkaicius(sk3, sk4));
        System.out.println(Integer.compare(sk3, sk4));

        savaitesDienosIsvedimas(5);
        int savaitesDiena = 7;
        savaitesDienosIsvedimas(savaitesDiena);
        savaitesDienosIsvedimas(100);
    }

    public static boolean arTeigiamas(int skaicius) {
        boolean teigiamas;
        if (skaicius > 0) {
            teigiamas = true;
        }
        else {
            teigiamas = false;
        }
        return teigiamas;
    }

    public static boolean arLyginis(int skaicius) {
        return skaicius % 2 == 0;
    }

    public static int palygintiDuSkaicius(int sk1, int sk2) {
        if (sk1 > sk2) {
            return -1;
        } else if (sk2 > sk1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void savaitesDienosIsvedimas(int skaicius) {
        switch (skaicius) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Trečiadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Šeštadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Blogas skaičius");
                break;
        }
    }
}
