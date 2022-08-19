
public class ReverseWords {
	
	public static String[] reverseWords(String str){
		
		
		String[] word  = str.split(" ");
		
		String  temp;
		int start=0;
		int end =word.length-1;
		
		while (start<end) {
			
			temp= word[start];
			word[start]= word[end];
			word[end]= temp;
			
			start++;
			end--;
			
		}
		
		return word;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "My Name is Martin";
		
	String[] rev= 	reverseWords(str);
	for (String  val : rev ) {
		
		
		System.out.print(val+" "); 
		
		
	}
	}

}
