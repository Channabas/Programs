package Programs;

import java.util.Scanner;

public class MaskedAccountNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String AccountNumber=sc.nextLine();
		String Masked=maskedAcccountNumber(AccountNumber);
		System.out.println(Masked);
		
		
	}
	
	static String  maskedAcccountNumber(String AccountNumber) {
		int length=AccountNumber.length();
		String maskedpart="x".repeat(length).substring(0,length-4);
		String visiblePart=AccountNumber.substring(length-4);
		return maskedpart+visiblePart;
	}

	
}
