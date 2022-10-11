package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        int points = Integer.parseInt (args[0]);
        if (points < 0) {
            System.out.print("BADVALUE");
        }
        else if (points > 100) {
            System.out.print("BADVALUE");
        }
        if (points >= 0 && points <= 50){
            System.out.print ("F");
        }
        else if (points >= 51 && points <= 70){
            System.out.print ("E");
        }
        else if (points >= 71 && points <= 90){
            System.out.print ("C");
        }
        else if (points >= 91 && points <= 100){
            System.out.print ("A");
        }
    }


}

