package pavyzdys2klasiumetodai;

public class Trikampis {
    private double a;
    private double b;
    private double c;

    public Trikampis() {
    }

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double perimetras() {
        return a + b + c;
    }

    public double plotas() {
        double p = perimetras() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int palygintiTrikampi(Trikampis t1) {
        if (plotas() > t1.plotas()) {
            return -1;
        } else if (plotas() < t1.plotas()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean arPanasus(Trikampis t1) {
        if (a / t1.a == b / t1.b && a / t1.a == c / t1.c) {
            return true;
        }
        else {
            return false;
        }
    }
}
