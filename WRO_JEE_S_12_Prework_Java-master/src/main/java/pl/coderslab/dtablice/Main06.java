package pl.coderslab.dtablice;

public class Main06 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, -69};
		int x = numbers.length - 1;
			for (int i = 0; i < numbers.length; i++){
				System.out.println(numbers[x]);
				x = x - 1;
			}

	}

}