package Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Charrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "martinm";
		
		Map<Character , Integer> map = new HashMap <Character,Integer>();
		
		for (int i =0; i< str.length(); i++) {
			
			if (map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
				
			}
			else {
				
				
				map.put(str.charAt(i), 1);
			}
			
			
		}
		
		Set<Character> set =	map.keySet();
		
		for (Character res:set) {
			
			System.out.println(res+">>>"+map.get(res));
			
		}
	}

}
