package pavyzdys2objektumetodai;

public class PagrindinePrograma {
    public static void main(String[] args) {
        // Sukuriu trikampį naudojant pilną konstruktorių
        Trikampis t1 = new Trikampis(10.25, 18, 17);
        System.out.println("t1 = " + t1);       // jį išvedu

        // Sukuriu trikmapį naudojant tuščią konstruktorių ir užpildant savybių reikšmes atskirai
        Trikampis t2 = new Trikampis();
        t2.a = 17.47;
        t2.b = 20.374;
        t2.c = 18.99;
        System.out.println("t2 = " + t2);

        // išvedų trikampių perimetrus
        System.out.println("t1.perimetras() = " + t1.perimetras());
        System.out.println("t2.perimetras() = " + t2.perimetras());

        // panaudoju padidinimo funkciją
        t1.padidintiTrikampi(5);
        System.out.println("t1 = " + t1);
        System.out.println("t1.perimetras() = " + t1.perimetras());

    }
}
