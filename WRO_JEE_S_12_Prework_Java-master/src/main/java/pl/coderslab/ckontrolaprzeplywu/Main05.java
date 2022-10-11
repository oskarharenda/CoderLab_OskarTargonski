package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		for (int result1 = 1; result1 <= 10; result1 = result1 + 1){
			resultFor = resultFor  + result1;
		}
		System.out.print(resultFor);
		System.out.print("\n");
		int result2 = 1;
		int resultWhile = 0;
		while (result2 <= 10) {
			resultWhile = resultWhile + result2;
			result2++;
		}
		System.out.print(resultWhile);
	}

}
