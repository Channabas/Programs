package Programs;

public class Stringpalindrome {
	public static void main(String[] args) {
		String str="Level";
		boolean res=palindrome(str);
		if(res==true) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}
		
	}
	
	static boolean palindrome(String str) {
		int si=0;
		int ei=str.length()-1;
		while(si<ei) {
			if(str.charAt(si)!=str.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
		
	}

}
