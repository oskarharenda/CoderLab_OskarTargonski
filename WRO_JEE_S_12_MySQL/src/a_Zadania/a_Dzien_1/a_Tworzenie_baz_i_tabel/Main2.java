package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main2 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableProducts =
            "CREATE TABLE products\n" +
                    "(\n" +
                    "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "name VARCHAR(30),\n" +
                    "description VARCHAR(200),\n" +
                    "price DECIMAL (8, 2));";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableOrders =
            "CREATE TABLE orders\n" +
            "(\n" +
            "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
            "description VARCHAR(200));\n";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableClients =
            "CREATE TABLE clients\n" +
                    "(\n" +
                    "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "name VARCHAR(200),\n" +
                    "surname VARCHAR (200));\n";
}
