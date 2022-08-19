
public class Shift3char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "abcdef";
		
	String newsub =	str.substring(1,3);
	String oldString  = str.substring(3,str.length());
	char c =str.charAt(0);
	
	String newString =  newsub+c;
	System.out.println(newString);
		

		
		 	
	}

}
`