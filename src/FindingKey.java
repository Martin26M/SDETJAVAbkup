
public class FindingKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7,8};
		
		int key = 5;
		int first = 0;
		int last = arr.length-1;
		
		
	 
			while (first<last) {
				
				int mid = (arr[first]+arr[last])/2;
				
				if (mid==arr[key]) {
					
					System.out.println("teh element  at "+key+" postions is "+mid);
					break;
				}
				
				else if(mid<arr[key]) {
					
					
				first = mid+1;
					
					
				}
				
	     else if(mid>arr[key]) {
						
					last = mid-1;
					
					
				}
				
	 
				
			}
			
			
			
			
		}
 
	}


