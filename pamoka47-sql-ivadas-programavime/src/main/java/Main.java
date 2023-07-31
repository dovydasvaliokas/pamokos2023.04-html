import duombaze.DbVeiksmai;
import entity.Produktas;

import java.sql.Connection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        ArrayList<Produktas> produktai = DbVeiksmai.gautiVisusProduktus(jungtis);
        produktai.forEach(p -> System.out.println(p));
    }
}
