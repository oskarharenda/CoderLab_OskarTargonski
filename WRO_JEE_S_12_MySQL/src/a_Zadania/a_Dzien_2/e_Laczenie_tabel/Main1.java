package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    public static void main(String[] args) {
        String sql ="insert into cinemas (name, address) values ('Oskar Harenda','ul.Pułaskiego 53')";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8"
                ,
                "root"
                ,
                "coderslab");
             Statement stat = conn.createStatement()) {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    //zapisz poniżej zapytania do bazy
    public String query1 = "";
    public String query2 = "";

}
