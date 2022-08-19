import java.util.ArrayList;
import java.util.Arrays;



public class ArrayLists {


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =  new ArrayList<String>(Arrays.asList("Hello", "Hello", "Martin"));
		Object[] arr =list.toArray();
		
	for (int i =0 ; i<arr.length; i++) {
		
		
		for (int j =i+1 ; j<arr.length ; j++) {
			
			
			if (arr[i]== arr[j]) {
				
				System.out.println(arr[i]);
				
			}
		}
	}
		
		
		

	}

}
