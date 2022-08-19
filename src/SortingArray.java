
public class SortingArray {
	
	
	public static   int[] 	sorting(int[] arr){
		
		
		int temp=0;
		int i ;
		for (i =0;i<arr.length; i++) {
			
			for (int j=i+1; j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
			
		}
		return arr;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr= {1,32,4,67,34,9,20,0};
		int[] soo = sorting(arr);
		for(Integer sort: soo) {
			
			System.out.println(sort);
		}
		
	}

}
