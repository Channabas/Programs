package Programs;

import java.util.TreeSet;

public class MissingNumbersInArray {
	public static void main(String[] args) {
		int[]arr= {1,3,5,9,11,15,21,30};
		
		TreeSet<Integer>t1=new TreeSet<>();
		int start=arr[0];
		int end=arr[arr.length-1];
		for(int no:arr) {
			t1.add(no);
		}
		for(int i=start;i<=end;i++) {
			if(!t1.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
