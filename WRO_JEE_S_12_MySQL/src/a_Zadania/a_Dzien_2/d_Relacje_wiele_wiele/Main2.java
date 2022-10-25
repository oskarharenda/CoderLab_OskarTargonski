package a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main2 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "" +
            "CREATE TABLE cinemas_movies(\n" +
            "cm_id INT AUTO_INCREMENT,\n" +
            "PRIMARY KEY (cm_id),\n" +
            "cinemas_id INT NOT NULL,\n" +
            "MOVIES_id INT NOT NULL,\n" +
            "FOREIGN KEY(cinemas_id) REFERENCES cinemas_ex(id),\n" +
            "FOREIGN KEY(movies_id) REFERENCES movies(id));\n";

}
