package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main3Oskar {
    public static void addCinema(String name, String address){
        try (Connection conn = oskardbutil.Conetion()) {

            oskardbutil.insert(conn,"Insert into cinemas(name,address) values(?,?)",name,address);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
