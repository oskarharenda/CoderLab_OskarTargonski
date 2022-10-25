package a_Zadania.a_Dzien_2.d_Relacje_wiele_wiele;


public class Main1 {
    //poniżej zapisz zapytanie tworzące tabele i łączące je.
    public String query1 = "CREATE TABLE products_orders(\n" +
            "P_O_id INT AUTO_INCREMENT,\n" +
            "id INT NOT NULL,\n" +
            "id INT NOT NULL,\n" +
            "PRIMARY KEY(P_O_id),\n" +
            "FOREIGN KEY(id) REFERENCES orders(id),\n" +
            "FOREIGN KEY(id) REFERENCES products(id));";

    //zapytania łączące produkty z zamówieniami
    public String query2 = "";
    public String query3 = "";
    public String query4 = "";
    public String query5 = "";

}
