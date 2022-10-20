package b_Zadania_domowe.a_Dzien_1;


public class Main2 {
    public String createTableImagesQuery = "CREATE TABLE image (\n" +
            "    user_id INT AUTO_INCREMENT,\n" +
            "    offer_id int,\n" +
            "    src varchar(100),\n" +
            "    dimension varchar(10),\n" +
            "    PRIMARY KEY(user_id)\n" +
            ");";

    public String createTableUsersCompaniesQuery = "CREATE TABLE user_companies (\n" +
            "    id INT AUTO_INCREMENT,\n" +
            "    user_id int,\n" +
            "    name varchar(30),\n" +
            "    nip int,\n" +
            "    street varchar(10),\n" +
            "    street_nr mediumint,\n" +
            "    phone char(9),\n" +
            "    post_code char(6),\n" +
            "    capital decimal (7,2),\n" +
            "    rate decimal(5,4),\n" +
            "    created_ad datetime,\n" +
            "    PRIMARY KEY(id)\n" +
            ");";
}
