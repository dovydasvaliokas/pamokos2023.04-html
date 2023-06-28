package belekas;

public class Trikampis {

    double a;
    double b;
    double c;

    public Trikampis() {
    }

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (arTrikampis(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            apskaiciuotiKampa(a, b, c);
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                '}';
    }

    public double trikampioPerimetras() {
        return a + b + c;
    }

    public void sumazintiTrikampi(int santykis) {
        a /= santykis;
        b /= santykis;
        c /= santykis;
    }

    public double trikampioPlotas() {
        double p = trikampioPerimetras() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public char kuriDidziausia() {
        if (a > b && a > c) {
            return 'a';
        } else if (b > a && b > c) {
            return 'b';
        } else {
            return 'c';
        }
    }

    public boolean arTrikampis(double a, double b, double c) {
        if (a + b >= c || a + c >= b || b + c >= a)
            return true;
        else
            return false;
    }


    double ab;
    double bc;
    double ca;


    public void apskaiciuotiKampa (double a, double b, double c) {
        ab = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        bc = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
        ca = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * c * a)));

    }
}