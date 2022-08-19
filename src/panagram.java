
public class panagram {

	public static boolean checkPanagram(String str) {
	    String ss ="The quick brown fox  over the lazyc dog";
	    ss.toLowerCase();
		char ch;
		for (ch='a'; ch<='z'; ch++) {
			
			if (ss.indexOf(ch)<0) {
				
				return false;
				// Its pending 
			}
			
			
		}
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Martin is Mathew";
		
	boolean check =	checkPanagram(str);
	System.out.println(check);
	}

}
