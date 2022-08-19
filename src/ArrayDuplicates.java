
public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {1,2,3,4,5,5,6,7,8,8,1};
		
		
		for(int i =0; i<arr.length; i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				
			if(arr[i]==arr[j]) {
				
				
				System.out.println(arr[i]);
			}
				
				
			}
			
		}
	}

}
