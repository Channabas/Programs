package Programs;

public class Fizzbuzz {
	public static void main(String[] args) {
		int no=6;
		if(no%3==0 && no%5==0) {
			System.out.println(no+" is a Fizzbuzz");
		}
		else if(no%3==0) {
			System.out.println(no+" is Fizz");
		}
		else if(no%5==0) {
			System.out.println(no+" is Buzz");
		}
		
		
		
	}

}
