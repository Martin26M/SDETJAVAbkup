
public class sortevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,3,4,5,6};
		int start=0;
		int end = arr.length-1;
		int temp;
		
		while (start<end) {
			{
				
				if(arr[start]%2==0) {
					
					start++;
					
				}

				if(arr[end]%2!=0) {
					
					end--;
					
				}
				
				temp= arr[start];
				arr[start]=arr[end];
				arr[end]= temp;
				
				start++;
				end--;
						
				
			}
			
			
			
			
		}
		for (int res:arr) {
			
			System.out.println(res);
			
			
		}
		

	}

}
