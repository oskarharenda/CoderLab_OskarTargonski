package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.*;

public class Main1 {
    public static void main(String[] args) {
        String name = "kino70";
        String address = "przekatna 13";

        try (Connection conn = DBUtil.Conetion()) {

            DBUtil.insert(conn,"Insert into cinemas(name,address) values(?,?)",name,address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
