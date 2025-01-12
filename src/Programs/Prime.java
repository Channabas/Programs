package Programs;

public class Prime {
	public static void main(String[] args) {
		for(int j=101;j<200;j++) {
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(no+" is prime");
			}
			else {
				System.out.println(no+" is not prime");
			}
		}
	}

}
