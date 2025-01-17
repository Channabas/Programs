package Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IterationDemo {
	public static void main(String[] args) {
		
		Map<String,String>map=new HashMap<>();
		map.put("Name", "Channa");
		map.put("age", "twenty-four");
		
		
		for(Map.Entry<String,String>entry:map.entrySet()) {
			System.out.println("Key="+entry.getKey()+" Value="+entry.getValue());
			
		}
	}
  
}
