import java.util.HashMap;
import java.util.Set;

public class FreqofDigtis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] digit = {1,2,3,4,5,6,6,7,8,99,9,9,9,9,9};

		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		
		for (int i =0; i <digit.length; i++) {
			
			if (map.containsKey(digit[i])) {
				
				map.put(digit[i], map.get(digit[i])+1);
				
				
			}
			
			else {
				
				
				map.put(digit[i], 1);
			}
			
				
			
		}
		
		Set<Integer> set = map.keySet();
		
		
	 for (Integer val: set) {
		 
		 System.out.println(val+"...."+ map.get(val));
		 
	 }
		
		
	}

}
