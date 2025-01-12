package Programs;

public class NextPrime {
	public static void main(String[] args) {
		int n=7;
		for(int j=n+1;j<1000;j++) {
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
			
		}
	}

}
