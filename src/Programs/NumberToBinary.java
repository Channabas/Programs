package Programs;

import java.util.Scanner;

public class NumberToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		while(n!=0) {
			int rem=n%2;
			str=rem+str;
			n/=2;
		}
		System.out.println(str);
	}

}
