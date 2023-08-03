import duombaze.DbVeiksmai;
import utility.MenuUtility;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection jungtis = DbVeiksmai.prisijungtiPrieDb();
        MenuUtility.vykdytiMeniu(jungtis);
    }
}
