package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Main2 {
    public static void main(String[] args) throws SQLException {

        String [] params = {"ładne", "kroto"};

        try (Connection conn = DBUtil.connect()) {
            DBUtil.insert(conn, "INSERT INTO cinemas VALUES (?,?,?)", params);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
