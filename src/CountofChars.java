import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountofChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "martin math  ew";
		String s1 ="";
		
	char[]  ch =	s.toCharArray();
				
	
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
				
	for (int i =0 ; i<s.length(); i++) {
		
		if ((ch[i]!=' ') ){
			
			
			
		
		if (map.containsKey(s.charAt(i))) {
			
			map.put(ch[i], (map.get(ch[i]))+1);
			
		}
		
		else  {
			
			map.put(ch[i], 1);
			
		}
		
	}

	}
	
//	Map<Character, Integer> tree = new TreeMap<>(map); if you want to find the count of char on Sorted
	
	
	


	
	for (Character val: map.keySet() ) {
		
		System.out.print(val);
		System.out.print(map.get(val));
		System.out.println("");
	}
	
	
	
}
	}