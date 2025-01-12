package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		removeDuplicates(str);
	}
	
	static void removeDuplicates(String str) {
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		char[]ch=str.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(str+":"+map);
	}

}
