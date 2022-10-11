package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 4; i < n; i++){
            String row = "";
            for (int j = 1; j <=n; j++){
                row += "*";
                System.out.print(row + "\n");
            }

        }
    }
}
