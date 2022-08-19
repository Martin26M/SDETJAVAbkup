
public class insertstrings {
	
	public static String  appendText(){
		
	String	str1=  "xcxcx";
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "Martin";
		
		for (int i =0 ; i<str.length(); i++) {
			
			if (str.charAt(i)=='t') {
				
				
			String newstr =	appendText();
				
				System.out.println(str.substring(0, str.indexOf('t'))+newstr+str.substring(str.indexOf('t'), str.length()));
			}
			
			
			
		}
			
		
		
		}
	

}
