public class P2SalyginiaiSakiniai {
    public static void main(String[] args) {
        // if pavyzdys
        if (5 > 3) {
            System.out.println("Penki yra daugiau uŽ tris");
        }

        // if else pavyzdys
        int x = 20;
        int y = 10;
        int rezultatas;
        if (x > y) {
            rezultatas = x - y;
        }
        else {
            rezultatas = y - x;
        }
        System.out.println("rezultatas = " + rezultatas);

        // if else if pavyzdys
        int sk1 = 80;
        int sk2 = 80;
        if (sk1 > sk2) {
            System.out.println("Pirmas skaičius didesnis");
        } else if (sk2 > sk1) {
            System.out.println("Antras skaičius didesnis");
        } else {
            System.out.println("Skaičiai lygūs");
        }

        // switch pavyzdys
        int skaicius = 2;
        switch (skaicius) {
            case 1:
                System.out.println("Skaičius yra vienetas");
                break;
            case 2:
                System.out.println("Skaičius yra dvejetas");
                break;
            case 3:
                System.out.println("Skaičius yra trejetas");
                break;
            case 4:
                System.out.println("Skaičius yra ketvertas");
                break;
            case 5:
                System.out.println("Skaičius yra penketas");
                break;
            default:
                System.out.println("Skaičius nėra tarp vieneto ir penkių");
        }

        // galima nedaryti riestiniu skliaustu, jeigu yra tik vienas veiksmas
        int sk3 = -25;
        if (sk3 > 0) System.out.println("Skaičius yra teigiamas");

    }
}
