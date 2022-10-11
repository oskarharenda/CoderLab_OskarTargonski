package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {
		int n = 6;
	for (int i = 0; i <= n; i = i + 1) {

		if (i % 2 == 0) {
			System.out.println(i + " - parzysta");
		} else {
			System.out.println(i + " - nieparzysta");
		}
		}
		int i = 0;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i + " - parzysta");
				i++;
			} else {
				System.out.println(i + " - nieparzysta");
				i++;

			}
		}
	}
}

