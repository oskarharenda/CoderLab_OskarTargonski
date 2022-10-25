package a_Zadania.a_Dzien_2.f_java_i_mysql;

import java.sql.*;

public class test {
    public static void main(String[] args) throws SQLException {
        String SQL_INSERT = "INSERT INTO categories VALUES (?,?)";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/products_ex?useSSL=false&characterEncoding=utf8", "root", "pasword");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            preparedStatement.setInt(1, Types.NULL);
            preparedStatement.setString(2, "dogs");

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}