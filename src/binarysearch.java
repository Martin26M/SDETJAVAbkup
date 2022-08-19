
public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {10,11,12,13,14};
		
		int key = 3;
		
		int start = arr[0];
		int end = arr[(arr.length)-1];
		
	
		
			
			
			while (start<end) {
				
				int mid = (start+end)/2;
				
				if(mid==arr[key]) {
					
					System.out.println("Element found " + mid);
					break;
					
				}
				else if (mid<arr[key]) {
					
					start = mid+1;
								
					
				}
				else  if (mid>arr[key]) {
					
					
					end = mid-1;
					
					
				}
                else {
                	
                	System.out.println("Element not found");
                	
                }
				
					
			
		}
		
		
		

	}

}
