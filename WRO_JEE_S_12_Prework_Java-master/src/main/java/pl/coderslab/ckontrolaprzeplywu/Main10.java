package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {

        int n = 8;
        int k = (n / 2);

        for (int i = 0; i < n; i++) {
            String row = "";
            if (i < k + 1) {
                for (int j = 0; j < k; j++) {
                    if (j <= i) {
                        row += "*";
                    } else {
                        row += j + 1;
                    }
                }
            }
            else {
                int d = n - 1;
                for (int m = n; m > k; m--) {
                    if (m > i) {
                        row += "*";
                    } else {
                        row += m - d;
                    }
                    d = (d - 2);
                }

            }
                    System.out.print(row + "\n");
        }

    }
}