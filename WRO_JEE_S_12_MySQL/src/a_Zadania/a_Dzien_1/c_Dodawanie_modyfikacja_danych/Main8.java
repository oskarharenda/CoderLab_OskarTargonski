package a_Zadania.a_Dzien_1.c_Dodawanie_modyfikacja_danych;

public class Main8 {

	//zapisz poniżej zapytania do bazy
    public static String query1 = "UPDATE cinemas SET adress=\"Stadion Narodowy\" WHERE adress LIKE \"&z\";";
    public static String query2 = "";
    public static String query3 = "UPDATE movies SET ratings = 5.4 WHERE LEN(discription) > 40;";
    public static String query4 = "UPDATE tickets SET price = price * 0.5 WHERE quantity > 10;";
}