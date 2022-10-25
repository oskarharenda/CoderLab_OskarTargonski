package b_Zadania_Domowe.a_Dzien_1;

import java.util.regex.Pattern;

public class Main2 {

	String reg1= "";
	String reg2= "";
	String reg3= "";
	String reg4= "";

	public static void main(String[] args) {
		System.out.println(verifyEmail("Oskarharenda"));
	}



	static boolean verifyEmail(String email){
		Pattern patter = Pattern.compile("[A-Z]+[a-z]+.{10,15}");
		return patter.matcher(email).matches();
	}

}
