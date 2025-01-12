package Programs;

import java.util.Arrays;

public class AddTwoUnsortedArray {
	public static void main(String[] args) {
		int[]arr1= {2,4,3,5,7,8};
		int[]arr2= {4,6,8,3,2,5};
		int[]res=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			res[i]=arr1[i]+arr2[i];
			
		}
		Arrays.sort(res);
		System.out.println(Arrays.toString(res));
	}

}
