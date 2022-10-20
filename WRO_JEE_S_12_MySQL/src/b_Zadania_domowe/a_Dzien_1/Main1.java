package b_Zadania_domowe.a_Dzien_1;


public class Main1 {
    public String query1 = "select * from users where name like 'julia%'";

    public String query2 = "select email from users order by email desc limit 5";

    public String query3 = "select * from users where email like '%yahoo.com' and  name like 'l%'";

    public String query4 = "";

    public String query5 = "select id, title from offers where price>500000";

    public String query6 = "select id, price from offers where activation_token ='' and price between 2000 and 400000";

    public String query7 = "select title, price, phone,expire from offers where expire>date_add(CURRENT_DATE(),interval 10 day )";

    public String query8 = "select * from offers where description like '%violent%' and phone like '%2%' and price>50000";

    public String query9 = "select * from offers where title like '%llc' and price<300000 and status=0";

    public String query10 = "select * from offers where price*2<50000 and promoted_to>=current_date";

    public String query11 = "SELECT COUNT(*) from offers where expire>current_date and status=1";

    public String query12 = "SELECT owner, COUNT(*) FROM offers where status=1 and expire>current_date GROUP By  owner ;";

    public String query13 = "SELECT status, COUNT(*) FROM offers where status=1 or status=0 GROUP By status";

    public String query14 = "select sum(price) from offers where expire<current_date and status=1";

    public String query15 = "select round(avg(price),2)  from offers where expire>current_date and promoted=1 and price>44645.04";

}
