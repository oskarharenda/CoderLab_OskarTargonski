package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main5 {
    public static void main(String[] args) {

        try (Connection conn = DBUtil.connect()){
            DBUtil.remove(conn, "movies", 10);
        }
        catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
