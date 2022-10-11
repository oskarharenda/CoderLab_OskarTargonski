package pl.coderslab.eparametrystartowe;

public class Main07 {

    public static void main(String[] args) {
        int n = Integer.parseInt (args[0]);
        int factorial = 1;
       /* for (int i = 1; i < n + 1; i++){
            factorial = factorial * i;
        }
        System.out.print (factorial);

        */
        int i = 1;
        while (i < n + 1){
            factorial = factorial * i;
            i++;
        }
        System.out.print (factorial);
    }

}
