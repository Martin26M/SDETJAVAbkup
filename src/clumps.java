
public class clumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,2,3,4,5,5,6,6};
		int count =0;
		
		for (int i =0; i<arr.length-1; i++) {
			
			if (arr[i]==arr[i+1]) {
				
				count ++;
				
			}
			
		
			
		}
System.out.println(count);
	}

}
