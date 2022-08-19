
public class PushZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		
		
		int []  arr = {1,0,1,0,1,0,0,0,1,2,0};
		
		int temp=0;
		for (int i =0; i<arr.length;i++) {
			
			if (arr[i]!=0) {
				
				arr[temp]= arr[i];
				temp++;
				
				
			}
		}
			
			for (int j =temp; j<arr.length; j++) {
				
				arr[temp]= 0;
				temp++;
				
			}
			
		
		
		
		for(int k=0;k<arr.length;k++)
		{
	          System.out.print(arr[k]);
		}
		
	
	
	}
		
		
		

	}


