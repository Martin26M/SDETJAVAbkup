import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,2));
		
		
		int len =list.size();
		
		HashSet <Integer> set = new HashSet<Integer>();
		
		
		for (Integer res: list) {
			
			
			if (!(set.add(res))) {
				
				
				System.out.println(res);
				
			}
		}
	}
		

}
