import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class charrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s  ="martinmathew";
		
	char []  arr =	s.toCharArray();
	HashMap<Character, Integer> map  = new HashMap<Character , Integer>();
	
	for (int i =0; i<arr.length; i++) {
		
		
		if (map.containsKey(arr[i])) {
			
			map.put(arr[i], map.get(arr[i])+1);
			
		}
		else {
			
			map.put(arr[i], 1);
		}
		
	}
	
Set<Character> res =map.keySet();

for (Character ff : res) {
	
	System.out.println(ff+">>>"+ map.get(ff));
	
}
	
	}

}
