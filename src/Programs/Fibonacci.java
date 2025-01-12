package Programs;

public class Fibonacci {
	public static void main(String[] args) {
		int fib1=1;
		int fib2=2;
		System.out.println(fib1+" "+fib2+" ");
		for(int i=1;i<=10;i++) {
		int fib3=fib1+fib2;
		
		System.out.print(fib3+" ");
		fib1=fib2;
		fib2=fib3;
		}
		
	}

}
