package Programs;

public class RangeofPrimeWithReturntype {
	public static void main(String[] args) {
		 prime(3,50);
	}
	
	
	static void prime(int a, int b) {
		for(int j=a;j<b;j++) {
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(no+" is a Prime");
			}
			
		}
	}

}
