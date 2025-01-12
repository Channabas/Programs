package Programs;

public class CharFrequency {
	public static void main(String[] args) {
		char[]ch= {'p','r','o','G','r','a','M','M','i','n','g'};
		String s="";
		for(int i=0;i<ch.length;i++) {
			s+=ch[i];
		}
		int[]arr=new int[128];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			arr[c]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print((char)i+""+i+""+arr[i]+" ");
			}
		}
	}

}
