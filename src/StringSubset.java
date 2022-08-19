
public class StringSubset {

	public static  void findSubSet(String str) {
		
		int len = str.length();
		int temp=0;
		String[] arr = new String[len*(len+1)/2];
		
		
		for (int i=0;i<str.length(); i++) {
			
			
			for (int j=i;j<str.length(); j++) 
			{
				
				
				arr[temp]= str.substring(i, j+1);
				temp++;
			}
			
		}
		
		
		for (int i =0; i<arr.length; i++) {
			
			
	System.out.println(arr[i]);
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str ="Martin";
	findSubSet(str);
	
		
	}

}
