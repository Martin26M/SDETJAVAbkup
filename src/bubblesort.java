
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {1,2,4,5,6,7,3};
		int temp=0;
		for (int i=0; i<arr.length; i++ ) {
			
			for (int j=0; j<arr.length-1; j++ ) {
				
				if (arr[j]>arr[j+1]) {
					
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
					
				}
				
			}
			for (Integer res: arr) {
				
				System.out.println(res);
				
			}
			
			
		}
	}

}
