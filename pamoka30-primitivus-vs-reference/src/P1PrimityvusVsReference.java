import java.util.Arrays;

public class P1PrimityvusVsReference {
    public static void main(String[] args) {
        // 1 pavyzdys
        int x = 15;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 25;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 2 pavyzdys
        int[] a = {2, 8, 3, 9};
        int[] b = a;
        int[] c = kopijuotiMasyva(a);
        int[] d = Arrays.copyOf(a, a.length);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
        a[3] = 37;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
        System.out.println("d = " + Arrays.toString(d));
    }

    public static int[] kopijuotiMasyva(int[] masyvas) {
        int[] naujasMasyvas = new int[masyvas.length];
        for (int i = 0; i < masyvas.length; i++) {
            naujasMasyvas[i] = masyvas[i];
        }
        return naujasMasyvas;
    }
}
