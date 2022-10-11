package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        int avg = 0;
        for (int i = 0; i < args.length; i++){
            int table = Integer.parseInt(args[i]);
            avg = avg + table;
        }
        avg = avg / args.length;
        System.out.print(avg);


    }
}
