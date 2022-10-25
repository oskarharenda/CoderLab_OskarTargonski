package a_Zadania.a_Dzien_1.d_Relacje_1_wiele;


public class Main2 {
    //zapisz poniżej zapytania tworzące odpowiednie tabele

    public String queryAddCategories = "CREATE TABLE categories(\n" +
            "id INT NOT NULL AUTO_INCREMENT,\n" +
            "PRIMARY KEY (id),\n" +
            "name VARCHAR(40));\n" +
            "\n" +
            "CREATE TABLE categories_sub(\n" +
            "id INT NOT NULL AUTO_INCREMENT,\n" +
            "main_id INT NOT NULL,\n" +
            "name VARCHAR(40),\n" +
            "PRIMARY KEY(id),\n" +
            "FOREIGN KEY(main_id) REFERENCES categories(id));\n";

    public String queryAddCategoriesSub = "";

}
