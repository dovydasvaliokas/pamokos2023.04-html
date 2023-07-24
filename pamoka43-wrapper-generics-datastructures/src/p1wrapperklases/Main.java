package p1wrapperklases;

public class Main {
    public static void main(String[] args) {
        int i1 = 5;
        Integer i2 = 5;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        i2 = null;
//        i1 = null;        // šitas jau mes errorą

        int i3 = Integer.parseInt("26");
        System.out.println("i3 = " + i3);

        double d1 = 5.41566;
        Double d2 = 5.84116;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // byte -> Byte, short -> Short, long - Long, float -> Float
        boolean b1 = true;
        Boolean b2 = true;
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);

        char c1 = 'a';
        Character c2 = 'a';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);


    }
}
