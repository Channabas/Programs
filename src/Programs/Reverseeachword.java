package Programs;

public class Reverseeachword {
	public static void main(String[] args) {
		String str="Hello world";
		String[]s1=str.split(" ");
		for(int i=0;i<s1.length;i++) {
			reverse(s1[i]);
		}
		
	}
	
	static void reverse(String s1) {
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.print(reverse+" ");
	}

}
