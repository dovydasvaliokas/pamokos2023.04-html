package duombaze;

import entity.Produktas;

import java.sql.*;
import java.util.ArrayList;

public class DbVeiksmai {

    public static final String DB_NUORODA = "jdbc:mysql://localhost:3306/java_2023_04_p41_uzduotis2";
    private static final String DB_USER = "root";
    private static final String DB_PSW = "";
    private static final String Q_GAUTI_PRODUKTA_PAGAL_ID = "select * from produktai where id = ?;";
    private static final String Q_GAUTI_PRODUKTUS_BRANGESNIUS_UZ = "select * from produktai where kaina > ?;";
    private static final String DEL_PRODUKTAS_ID = "delete from produktai where id = ?;";
    private static final String INS_PRODUKTAS = "INSERT INTO produktai(pavadinimas, kaina) VALUES (?, ?);";
    private static final String UPD_PRODUKTAS = "update produktai set pavadinimas = ?, kaina = ? where id = ?";

    public static Connection prisijungtiPrieDb() {
        Connection jungtis;
        try {
            jungtis = DriverManager.getConnection(DB_NUORODA, DB_USER, DB_PSW);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return jungtis;
    }

    public static Produktas gautiProduktaPagalId(Connection jungtis, long id) {
        Produktas produktas = new Produktas();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_PRODUKTA_PAGAL_ID);
            paruostukas.setLong(1, id);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                produktas.setId(resultSet.getLong("id"));
                produktas.setPavadinimas(resultSet.getString("pavadinimas"));
                produktas.setKaina(resultSet.getDouble("kaina"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produktas;
    }

    public static ArrayList<Produktas> gautiProduktusBrangesniusUz(Connection jungtis, double kaina) {
        ArrayList<Produktas> produktai = new ArrayList<>();
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(Q_GAUTI_PRODUKTUS_BRANGESNIUS_UZ);
            paruostukas.setDouble(1, kaina);
            ResultSet resultSet = paruostukas.executeQuery();
            while (resultSet.next()) {
                Produktas produktas = new Produktas();
                produktas.setId(resultSet.getLong("id"));
                produktas.setPavadinimas(resultSet.getString("pavadinimas"));
                produktas.setKaina(resultSet.getDouble("kaina"));
                produktai.add(produktas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produktai;
    }

    public static int istrintiProduktaPagalId(Connection jungtis, long id) {
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(DEL_PRODUKTAS_ID);
            paruostukas.setLong(1, id);
            return paruostukas.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int pridetiProdukta(Connection jungtis, Produktas produktas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(INS_PRODUKTAS);
            ps.setString(1, produktas.getPavadinimas());
            ps.setDouble(2, produktas.getKaina());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int atnaujintiProdukta(Connection jungtis, Produktas produktas) {
        try {
            PreparedStatement ps = jungtis.prepareStatement(UPD_PRODUKTAS);
            ps.setString(1, produktas.getPavadinimas());
            ps.setDouble(2, produktas.getKaina());
            ps.setLong(3, produktas.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
