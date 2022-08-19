
public class NumberPalindrome {
	public static boolean palindrome(String str) {
		
		int end  =str.length()-1;
		
			 	int temp;
			 	int start=0;
			 	
			 	while (start<end) {
			 		
			 		if (str.charAt(start)!=str.charAt(end)) {
			 			
			 			
			 			return false;
			 		}
			 		
			 		start++;
			 		end--;
			 	}
			
			return true;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 123321;
		
		String num1 = 	String.valueOf(num);
		boolean check = palindrome( num1 );
		System.out.println(check);
		
	}

}
