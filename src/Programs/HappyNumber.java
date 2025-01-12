package Programs;

public class HappyNumber {
	public static void main(String[] args) {
		int no=10;
		while(no>9) {
			no=sum(no);
		}
		if(no==1||no==7) {
			System.out.println(no+" is Happy number");
		}
		else {
			System.out.println(no+" is not a Happy Number");
		}
	}
	
	static int sum(int no) {
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem*rem;
			no=no/10;
		}
		return sum;
	}

}
