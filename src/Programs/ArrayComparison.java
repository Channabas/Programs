package Programs;

public class ArrayComparison {
	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5,6};
		int[]arr2= {4,7,8,3,1};
		int[]arr3=new int[128];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}

}
