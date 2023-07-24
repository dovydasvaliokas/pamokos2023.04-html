package p2generics;

public class Main {
    public static void main(String[] args) {
        Apskritimas<Double> a1 = new Apskritimas<>(27.147);
        System.out.println("a1 = " + a1);
        System.out.println("a1.plotas() = " + a1.plotas());
    }
}
