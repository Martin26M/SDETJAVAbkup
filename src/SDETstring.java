
public class SDETstring {

	public static String reverseMe(String str) {
		
		
		String temp="";
		
		int  len = str.length();
		
		for (int i =len-1; i>=0; i--) {
			
			temp = temp+str.charAt(i);
		}
		
		return temp;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Martin";
		
	String check =	reverseMe( str);
    System.out.println(check);
	}

}
