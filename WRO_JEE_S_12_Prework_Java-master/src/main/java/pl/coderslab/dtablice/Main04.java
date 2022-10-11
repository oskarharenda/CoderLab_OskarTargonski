package pl.coderslab.dtablice;

public class Main04 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, 69};
		int sumOdd = 0;
		for (int i = 0; i < numbers.length; i++) {
			int test = 0;
			test = numbers[i] % 2;
			if (test == 0) {
				System.out.println(numbers[i]);
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			int test = 0;
			test = numbers[i] % 2;
			if (test == 1) {
				sumOdd = sumOdd + numbers[i];
			}
		}
		System.out.println ("SUMA: " + sumOdd);
	}
}