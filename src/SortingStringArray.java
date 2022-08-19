
public class SortingStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []  arr = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"  };

		String temp="";
		for (int i =0; i<arr.length; i++) {
			
			
			for (int j=i+1; j<arr.length; j++) {
			 {
					if((arr[i].compareTo(arr[j])>0)) {
						temp = arr[i];
						arr[i]= arr[j];
						arr[j]= temp;
						
						
						
					}
					
					
				}
				
				
			}
		}
		
		for (String res: arr) {
			
			System.out.println(res);
			
		}
	}

}
