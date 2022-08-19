
public class pushevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		int start = 0;
	   int temp=0;
	   int end = arr.length-1;
	   
	   for(int i =0 ; i<arr.length; i++) {
		   
		   if (arr[i]%2==0) {
			   
			   arr[temp]= arr[i];
			   temp++;
			   
		   }
		   
	   }
	   
	   for (int j=temp ; j<arr.length; j++) {
		   
		   if (arr[j]%2!=0) {
			   arr[temp]= arr[j];
			   temp++;
			   
			   
		   }
		 
		   
		   
	   }
	  
	   for (Integer res: arr){
		   
		   System.out.println(res);
	   }
	   {
		   
		   
		   
	   }
		   
		 
	}}
		

