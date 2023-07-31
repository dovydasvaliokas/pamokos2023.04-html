package duombaze;

import entity.Produktas;

import java.sql.*;
import java.util.ArrayList;

public class DbVeiksmai {
    public static final String DB_NUORODA = "jdbc:mysql://localhost:3306/java_2023_04_p41_uzduotis2";
    private static final String DB_USER = "root";
    private static final String DB_PSW = "";
    private static final String Q_SELECT_PRODUKTAI = "select * from produktai";
    public static Connection prisijungtiPrieDb() {
        Connection jungtis;
        try {
            jungtis = DriverManager.getConnection(DB_NUORODA, DB_USER, DB_PSW);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return jungtis;
    }

    public static ArrayList<Produktas> gautiVisusProduktus(Connection jungtis) {
        ArrayList<Produktas> visiProduktai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_SELECT_PRODUKTAI);
            ResultSet rs = paruostukas.executeQuery();
            while (rs.next()) {
                Produktas produktas = new Produktas();
                produktas.setId(rs.getLong("id"));
                produktas.setPavadinimas(rs.getString("pavadinimas"));
                produktas.setKaina(rs.getDouble("kaina"));
                visiProduktai.add(produktas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return visiProduktai;
    }
}
