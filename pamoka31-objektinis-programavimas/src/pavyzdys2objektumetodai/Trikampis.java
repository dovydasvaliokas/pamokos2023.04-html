package pavyzdys2objektumetodai;

public class Trikampis {
    double a;
    double b;
    double c;

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Trikampis() {
    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
//                ", perimetras = " + perimetras() +
                '}';
    }

    public double perimetras() {
        return a + b + c;
    }

    public void padidintiTrikampi(int santykis) {
        a *= santykis;
        b *= santykis;
        c *= santykis;
    }
}
