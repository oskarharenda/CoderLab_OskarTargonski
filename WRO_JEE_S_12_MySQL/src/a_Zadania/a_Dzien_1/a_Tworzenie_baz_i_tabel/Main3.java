package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main3 {
    //Zapisz w poniższej zmiennej kod zapytania SQL
    public static String query =
            "CREATE TABLE movies\n" +
                    "(id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "title VARCHAR(50),\n" +
                    "description VARCHAR(200),\n" +
                    "rating DECIMAL(4, 2));\n" +
                    "CREATE TABLE clients\n" +
                    "(id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "name VARCHAR(50),\n" +
                    "surname VARCHAR(200));";

}
