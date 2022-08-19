import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,7,6,5,4));
		
		LinkedHashSet<Integer> link = new	LinkedHashSet<Integer>(arr);	
		
		for (Integer res:link) {
			
			System.out.println(res);
			
		}

	}

}
