package a_Zadania.a_Dzien_2.e_Laczenie_tabel;


public class Main3 {
    //zapisz poniżej zapytania do bazy
    public String query1 = "SELECT * FROM products WHERE description is NOT NULL;";
    public String query2 = "SELECT * FROM products;";
    public String query3 = "SELECT * FROM opinions JOIN products ON opinions.id=products.id WHERE opinions.id = 1;";

}
