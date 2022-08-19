import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []  arr  = {1,2,3,4,2,4,5,3,5,6};
	List<int[]> aee =	Arrays.asList(arr);
	        List<Integer> list =    new  ArrayList<Integer>(Arrays.asList(4,5,2,4)) 	;

		
		
		HashSet<Integer>  set = new HashSet<Integer>();
		
		set.addAll(list);
		
		for (Integer res: set ) {
			
			
			System.out.println(res);
		}
		
		
	}

}
