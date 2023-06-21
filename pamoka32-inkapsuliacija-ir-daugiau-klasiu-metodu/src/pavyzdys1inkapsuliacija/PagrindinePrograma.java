package pavyzdys1inkapsuliacija;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Trikampis trikampis1 = new Trikampis(14.15, 17.45, 18.94);
        System.out.println("trikampis1 = " + trikampis1);

        System.out.println("trikampis1.getA() = " + trikampis1.getA());
        trikampis1.setA(20.78);
        System.out.println("trikampis1.getA() = " + trikampis1.getA());
        System.out.println("trikampis1 = " + trikampis1);

        System.out.println("trikampis1.getB() = " + trikampis1.getB());

        trikampis1.setC(trikampis1.getC() * 2);
        System.out.println("trikampis1.getC() = " + trikampis1.getC());
    }
}
