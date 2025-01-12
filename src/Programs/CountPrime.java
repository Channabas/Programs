package Programs;

public class CountPrime {
	public static void main(String[] args) {
		int count=0;
		for(int j=3;j<100;j++) {
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					flag=false;
					break;
					
				}
			}
			if(flag) {
				count++;
			}
			
		}
		System.out.println("The total Prime numbers are: "+count);
	}

}
