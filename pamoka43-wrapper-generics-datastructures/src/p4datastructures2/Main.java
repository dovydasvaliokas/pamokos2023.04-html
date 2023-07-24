package p4datastructures2;

public class Main {
    public static void main(String[] args) {
        ManoArrayList<Integer> sk = new ManoArrayList<>();
        sk.prideti(17);
        sk.prideti(20);
        System.out.println("sk = " + sk);
        sk.prideti(14);
        sk.prideti(-10);
        sk.prideti(-25);
        sk.prideti(13);
        sk.prideti(20);
        sk.prideti(17);
        sk.prideti(27);
        sk.prideti(14);
        sk.prideti(188);
        System.out.println("sk = " + sk);

    }
}
