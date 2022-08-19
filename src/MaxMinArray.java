
public class MaxMinArray {
	
	
	public static int 	CheckMax(int[] arr) {
		
		int max=arr[0];
		for (int i=0; i<arr.length; i++) {
			
			 
			if (arr[i]>max) {
				
				
				max= arr[i];
				
			}
			
		}
		
		return max;
		
		
	}
	

	public static int 	CheckMin(int[] arr) {
		
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			
			 
			if (arr[i]<min) {
				
				
				min = arr[i];
				
			}
			
		}
		
		return min;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,3,4,5,3,87,100,5,8,9};
		
		int  checker =CheckMax(arr);
		int checker2 = CheckMin(arr);
      System.out.println(checker);
      System.out.println(checker2);
	}
	 	
}
