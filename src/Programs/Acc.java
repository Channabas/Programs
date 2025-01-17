package Programs;

import java.util.Scanner;

public class Acc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String acc=sc.nextLine();
		
		String Maskedacc=maskedAccountNumber(acc);
		System.out.println(Maskedacc);
		}
	
	static String maskedAccountNumber(String acc) {
		int length=acc.length();
		
		String maskedPart="x".repeat(length-4);
		String visiblepart=acc.substring(length-4);
		return maskedPart+visiblepart;
	}

}
