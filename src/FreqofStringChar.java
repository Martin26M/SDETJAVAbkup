import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FreqofStringChar {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str ="mmmaaaartin";
		
	char []  ch =	str.toCharArray();
	
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	

	for (int i =0; i<ch.length; i++) {
		
		
		
		if (map.containsKey(ch[i])) {
			
			
			map.put(ch[i], map.get(ch[i])+1);
			
		}
		
		else {
			
			map.put(ch[i], 1);
		}
		
		
		}
	
	Set <Character> set = map.keySet();
	
	
//	
//	for (Entry<Character, Integer> val: map.entrySet()) {
//		
//		
//		val.getKey();
//		val.getValue();
//		
//	}
	
	for (Character val : set) {
		
		
		System.out.println(val+"......"+ map.get(val));
	}
	

	}

}
