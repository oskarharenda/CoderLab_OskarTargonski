package pl.coderslab.eparametrystartowe;

public class Main02 {

    public static void main(String[] args) {
        int x = args.length;
        System.out.print(x);
        for (int i = x; i < 1; --i) {
            System.out.print(args[i] + " ");
            System.out.print(x);
        }
    }


    }


