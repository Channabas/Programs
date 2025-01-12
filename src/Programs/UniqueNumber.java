package Programs;

public class UniqueNumber {
	public static void main(String[] args) {
		int no=1971547999;
		String str=String.valueOf(no);
		int[]arr1=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			arr1[ch]++;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==1) {
				System.out.println((char)i+""+i+""+arr1[i]);
			}
		}
	}

}
