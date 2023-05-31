public class P1Char {
    public static void main(String[] args) {
        // 1 pvz susikuriam char
        char raide = 'a';
        System.out.println("raide = " + raide);

        // 2 pvz
        char c1 = 'd';
        char c2 = 'D';
        char c3 = '.';
        char c4 = '6';

        int i1 = c1;
        int i2 = c2;
        int i3 = c3;
        int i4 = c4;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        // 3 pvz
        System.out.println(c1 + "=" + (int) c1);
        System.out.println(c2 + "=" + (int) c2);
        System.out.println(c3 + "=" + (int) c3);
        System.out.println(c4 + "=" + (int) c4);

        // 4 pvz
        char c5 = 'a';
        char c6 = 'b';
        System.out.println(c5 + c6);

        // 5 pvz
        boolean b1 = 'a' > 'd';
        System.out.println("b1 = " + b1);

        boolean b2 = 'D' > 'a';
        System.out.println("b2 = " + b2);

        // 6 pvz
        char c7 = 'ą';
        System.out.println(c7 + " = " + (int) c7);

        char c8 = 'č';
        char c9 = 'Ą';
        System.out.println(c8 + " = " + (int) c8);
        System.out.println(c9 + " = " + (int) c9);

        // 7 pvz
        System.out.println("ar y skaičius: " + Character.isDigit('y'));
        System.out.println("ar 8 skaičius: " + Character.isDigit('8'));

        System.out.println("ar h yra raidė: " + Character.isAlphabetic('h'));
        System.out.println("ar . yra raidė: " + Character.isAlphabetic('.'));
        System.out.println("ar 7 yra raidė: " + Character.isAlphabetic('7'));
        System.out.println("ar ą yra raidė: " + Character.isAlphabetic('ą'));
    }
}
