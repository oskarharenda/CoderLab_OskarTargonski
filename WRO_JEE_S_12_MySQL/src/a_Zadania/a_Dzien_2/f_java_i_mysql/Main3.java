package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main3 {

    static void addCinema(String name, String address) {
        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "INSERT INTO cinemas (name, address) VALUES (?,?,?)", name, address);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}

