
public class StringPalindrome {

	
	public static void  palindrome(String str) {
		
		int end  =str.length()-1;
		boolean flag= false;
			 	
			 	int start=0;
			 	
			 	while (start<end) {
			 		
			 		if (str.charAt(start)!=str.charAt(end)) {
			 			
			 			flag= true;
			 			break; 
			 		}
			 		
			 		start++;
			 		end--;
			 	}
			if (flag ) {
				
				System.out.println("Palindrome Not");
			}
			else {
				
				System.out.println("Palindrome");
			}
			
		}
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str ="mam";
		
	 palindrome( str );
		
	}

}
