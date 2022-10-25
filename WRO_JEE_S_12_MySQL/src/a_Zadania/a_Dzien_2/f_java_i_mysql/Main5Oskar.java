package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main5Oskar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id=scanner.nextInt();

        try (Connection conn = oskardbutil.Conetion()) {

            oskardbutil.remove(conn,"cinemas",id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
