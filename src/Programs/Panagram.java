package Programs;

import java.util.Set;
import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
		String str="The Quick Brown Fox Jumps Over The Lazy Dog";
		str=str.toLowerCase().replaceAll(" ","");
		
		Set<Character>s1=new TreeSet<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			s1.add(ch);
		}
		if(s1.size()==26) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not a Panagram");
		}
		
	}

}
