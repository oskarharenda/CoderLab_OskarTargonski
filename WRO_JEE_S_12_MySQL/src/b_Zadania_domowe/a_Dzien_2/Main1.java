package b_Zadania_domowe.a_Dzien_2;


public class Main1 {

    public String query1 = "UPDATE offers\n" +
            "join users u on offers.owner = u.id\n" +
            "SET price =price+100\n" +
            "where u.id between 20 and 25;";

    public String query2 = "delete from offers\n" +
            "where expire between current_date and DATE_ADD(current_date,INTERVAL 1 DAY);";

    public String query3 = "delete * from offers\n" +
            "where phone like '+48%' and status=1 and promoted = 1 and expire>=current_date;";

    public String query4 = "update offers\n" +
            "set promoted_to=DATE_ADD(current_date,INTERVAL 23 DAY),promoted=1\n" +
            "where substring(phone,3,4)=48 and promoted = 0;";

    public String query5 = "";
}
