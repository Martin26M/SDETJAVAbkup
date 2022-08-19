import java.util.HashSet;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,2,2,4,5,6,63,3};
		
		HashSet <Integer> set = new HashSet<Integer>();
		
		for (int res : arr) {
			
			
			set.add(res);
			
		}
		

		for (Integer  res : set ) {
			
			
			System.out.println(res);
			
		}

	}

}
