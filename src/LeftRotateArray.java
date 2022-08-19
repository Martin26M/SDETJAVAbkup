
public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,3,4,5};
		 int temp=0;
		 int last= arr.length-1;
		 int first= 0;
		 temp = arr[first];
		for (int i =0 ; i<arr.length-1; i++) {
			
			
			
			arr[i]= arr[i+1];
			
			
		}
		arr[last]= temp;
		
		for (Integer arr1: arr) {
			
			System.out.println(arr1);
			
		}
	}

}
