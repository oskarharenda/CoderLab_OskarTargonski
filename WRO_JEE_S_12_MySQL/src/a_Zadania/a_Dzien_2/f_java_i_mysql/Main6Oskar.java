package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.*;

public class Main6Oskar {
    public static void main(String[] args) throws SQLException {

        MoviesMoreAvg(Average(oskardbutil.Conetion()));
    }
    static void MoviesMoreAvg(String average) throws SQLException {
        oskardbutil.printData(oskardbutil.Conetion(), "Select *from movies where rating>"+average,"title");
    }


    static String Average(Connection conn) throws SQLException {
        String average="";
        try (PreparedStatement statement = conn.prepareStatement("Select avg(rating) from movies;");
             ResultSet resultSet = statement.executeQuery();) {
            if (resultSet.next()) {
                average=resultSet.getString(1);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return average;
    }

}
