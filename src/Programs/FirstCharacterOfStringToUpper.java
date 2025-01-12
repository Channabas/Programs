package Programs;

public class FirstCharacterOfStringToUpper {
	public static void main(String[] args) {
		String str="java is programming language";
		String[]s1=str.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ");
		}
	}

}
