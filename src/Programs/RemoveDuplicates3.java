package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates3 {
	public static void main(String[] args) {
		String str="Programming";
		StringBuilder sb1=new StringBuilder();
		Set<Character>s1=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			s1.add(ch);
			
		}
		for(Character c:s1) {
			sb1.append(c);
		}
		System.out.println(sb1);
		
		
		
		
		
	}

}
