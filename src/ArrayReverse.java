
public class ArrayReverse {

	
	public  static int[] reversearray(int [] arr){
		
		int len = arr.length-1;
		
		
		int temp;
		int start=0;
		int end = len;
		
		while (start<end) {
			
			
			temp = arr[start];
			arr[start]= arr[end];
			
			arr[end]= temp;
			start++;
			end--;
			
			
			
		}

		
		return arr;
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6};
		
		int[]  srr=  reversearray(arr);
		for (Integer val : srr ) {
			
			
			System.out.print(val+" ");
			
			
		}

	}

}
