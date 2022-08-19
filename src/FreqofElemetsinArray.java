import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FreqofElemetsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []  arr = {1,2,3,4,55,5,6,7,7,8,8,8,8};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<arr.length; i++) {
			
			if (map.containsKey(arr[i]))
			{
				
				map.put(arr[i], map.get(arr[i])+1);
			}
			
			else {
				
				map.put(arr[i], 1);
			}
			
			

		
			
		}
		
	
		Set<Integer> set = 	map.keySet();
		
		
		for (Integer keyVal: set) {
			
			System.out.println(keyVal +"......"+ map.get(keyVal));
		
		}
	
		

	}

}
