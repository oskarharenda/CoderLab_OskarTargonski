package a_Zadania.a_Dzien_1.b_Metody;


public class Main10 {

    public static void main(String[] args) {
        String result = footballWin (2, 0, 2, 0);
        System.out.print (result);

    }

    static String footballWin(int aScrHome, int aScrAway, int bScrHome, int bScrAway) {
        if (aScrHome + aScrAway > bScrHome + bScrAway) {
            return "1";
        } else if (bScrHome + bScrAway > aScrHome + aScrAway) {
            return "2";
        } else if (bScrHome + bScrAway == aScrHome + aScrAway && bScrAway > aScrAway) {
            return "2";
        } else if (aScrHome + aScrAway == bScrHome + bScrAway && aScrAway > bScrAway) {
            return "1";
        } else {
            return "x";
        }

    }
}
