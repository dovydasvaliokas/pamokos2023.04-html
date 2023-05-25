public class P1KintamiejiIsvedimaiDuomenuTipai {
    public static void main(String[] args) {
        // Išvedimas į konsolę
        System.out.println("tekstas");
        System.out.println(58);

        // Susikuriame tekstinį ir loginį kintamuosius
        String tekstinisKintamasis = "Cia yra tekstas";
        boolean loginisKintamasis = true;

        // Skaitiniai kintamieji
        // Sveikieji skaiciai
        int x = 25;
        // nuo maziausio sveikojo iki didziausio tipo
        byte b = 14;        // nuo -128 iki 127
        short s = 2587;     // nuo 32768 to 32767
        int i = 154154;     // nuo -2147483648 to 2147483647
        long l = 15417771451545788L;  // nuo -9223372036854775808 to 9223372036854775807
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);

        // Realieji skaiciai
        float f = 51558.21665F;
        double d = 155154154451.256;

        // Skaiciu konvertavimas
        // Widening casting (automatiskai)
        byte b1 = 58;
        short s1 = b1;
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);

        short s2 = 5474;
        int i2 = s2;
        System.out.println("s2 = " + s2);
        System.out.println("i2 = " + i2);

        // Narrowing casting
        int i3 = 5025;
        short s3 = (short) i3;
        System.out.println("i3 = " + i3);
        System.out.println("s3 = " + s3);

        int i4 = 2500;
        byte b4 = (byte) i4;
        System.out.println("i4 = " + i4);
        System.out.println("b4 = " + b4);

        double d5 = 52515.41456;
        int i5 = (int) d5;
        System.out.println("d5 = " + d5);
        System.out.println("i5 = " + i5);

    }
}
