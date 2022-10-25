package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main4 {
    public static void main(String[] args) {
        String[] column = {"id", "title"};

        try (Connection conn = DBUtil.connect()) {
            DBUtil.printData(conn, "SELECT * FROM movies", column);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
