package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main4 {
    public static void main(String[] args) {
        SoutAllMovies();
    }


    static void SoutAllMovies(){
        try (Connection conn = DBUtil.Conetion()) {
            DBUtil.printData(conn,"SELECT * FROM cinemas","name","address");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
