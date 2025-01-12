package Programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount3 {
	public static void main(String[] args) {
		String str="hellojava";
		
		frequencyCount(str);
		
	}
	
	static void frequencyCount(String str) {
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		
			char[]ch=str.toCharArray();
			for(char c:ch) {
				if(map.containsKey(c)) {
					map.put(c,map.get(c)+1);
					
				}
				else {
					map.put(c, 1);
				}
			}
			System.out.println(str+":"+map+" ");
			
		}
		
	

}
