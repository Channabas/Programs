package Programs;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
				
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			}
			System.out.println(arr[i]+" ");
		}
		
	}

}
