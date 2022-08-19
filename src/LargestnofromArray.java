
public class LargestnofromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {4,1,2,6,8,5,3,7,9};
		
		int start = 0;
		int end = arr.length;
		int temp;
		
		for (int i =0 ; i<arr.length ; i++) {
			
			
			for (int j = i+1; j<arr.length; j++) {
				
				
				
				if (arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					
					
				}
				
				
			}
			
		
			
			
		}
	    
		for (int arr1: arr) {
			
			System.out.print(arr1);
			
			
		}
		
		
		
		
		
		
	}

}
