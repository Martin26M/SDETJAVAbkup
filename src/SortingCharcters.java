
public class SortingCharcters {
	
	public static char[] sortChar(char[] str) {
		
		char  temp;
		
		for (int i =0; i<str.length; i++) {
			
			
			for (int j = i+1; j<str.length; j++) {
				
				if (Character.compare(str[i], str[j])>0) {
					
					
					
					temp = str[i];
					str[i]= str[j];
					str[j]=temp;
					
				}
				
				
				
				
			}
		
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Martin";
	String	str1 =	str.toLowerCase();  
		
       char[]  ch =   str1.toCharArray();
	

       sortChar(ch);
       System.out.println(ch);
	}

}
