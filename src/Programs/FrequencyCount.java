package Programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		String str="Hello World";
		getCharCount(str);
		
		
	}
	
	static void getCharCount(String str) {
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		char[]ch=str.toCharArray();
		for(char c:ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			
			else {
				map.put(c,1);
			}
		}
		System.out.print(str+":"+map+" ");
		
		
	}


}
