
public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "My name is Martin Mathew";
		s.toLowerCase();
		
       String []  split = s.split(" ");		
		
		
		int max=0;
		for (int i =0 ; i<s.length()-1; i++) {
			
      int l1=	split[i].length();
     
			for (int j=0; j<s.length();j++) {
				
				
				if (split[i].length()>split[j].length()) {
					
			split[i]= split[j];
				}
				
			}
		}

	}

}
