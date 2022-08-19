
public class Pushzero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {1,2,4,0,3,2,0,4,6};
		int arr1[] = new int[arr.length];
		
		int temp=0;
		
		for (int i=0; i<arr.length; i++) {
			
			if(arr[i]!=0) {
				
				arr1[temp]= arr[i];
				temp++;
			}
			

			
		}

		for (int j= temp; j<arr.length; j++) {
			
			arr1[temp]= 0;
			temp++;
			
			
		}
		
		for (Integer res: arr1) {
			
			System.out.println(res);
			
		}
	}

}
