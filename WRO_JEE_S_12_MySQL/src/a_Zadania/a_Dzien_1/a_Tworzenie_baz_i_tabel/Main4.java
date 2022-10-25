package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

public class Main4 {
//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
	public static String queryCreateTableCinemas =
		"";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
	public static String queryCreateTableMovies = "";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
	public static String queryCreateTableTickets =
		"CREATE TABLE tickets\\n\" +\n" +
				"\t\t\t\t\"(id INT AUTO_INCREMENT PRIMARY KEY,\\n\" +\n" +
				"\t\t\t\t\"quantity INT,\\n\" +\n" +
				"\t\t\t\t\"price DECIMAL(5, 2),\\n\" +\n" +
				"\t\t\t\t\"status INT,\\n\" +\n" +
				"\t\t\t\t\"CHECK (status = 0 OR 1));";

//Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
	public static String queryCreateTablePayments =
		"CREATE TABLE payments\n" +
				"(id INT AUTO_INCREMENT PRIMARY KEY,\n" +
				"type VARCHAR(20),\n" +
				"CHECK (type = \"cash\" OR \"card\" OR \"transfer\"),\n" +
				"payment_date date);";
}
