package Programs;

import java.util.Scanner;

public class AccountNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String AccountNumber=sc.nextLine();
	String MaskedAccountNumber=MaskedAccountNumber(AccountNumber);
	System.out.println(MaskedAccountNumber);
}


static String MaskedAccountNumber(String AccountNumber) {
	int length=AccountNumber.length();
	String maskedPart="x".repeat(length-4);
	String visiblePart=AccountNumber.substring(length-4);
	return maskedPart+visiblePart;
	
}
}
