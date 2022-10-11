package pl.coderslab.dtablice;

public class Main05 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, -69};
		int min = 0;
		for (int i = 0; i < numbers.length - 1; i++){

			if (numbers[i] > numbers[i + 1])
				min = numbers[i + 1];
			else {
				min = numbers[i];
			}
		}
		System.out.print("MIN: " + min);
	}

}
