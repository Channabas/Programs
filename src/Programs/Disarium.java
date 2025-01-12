package Programs;

import java.util.Scanner;

public class Disarium {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int n=no;
		int copy=no;
		int count=0;
		int sum=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		while(no!=0) {
			int rem=no%10;
			sum+=Math.pow(rem, count);
			count--;
			no=no/10;
		}
		if(copy==sum) {
			System.out.println(sum+" is disarium number");
		}
		else {
			System.out.println(sum+" is not a disarium number");
		}
	}

}
