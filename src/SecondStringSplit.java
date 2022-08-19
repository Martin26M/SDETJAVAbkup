
public class SecondStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is martin";
		
		int space=0;
		for (int i=0; i<s.length(); i++) {
			
			if (s.charAt(i)==' ') {
				
				space++;
				
			}
		
		}

		
		String[] arr = new String[space+1];
		String word= "";
		int j=0;
		
		for (int i =0; i<s.length(); i++) {
			
			
			if (s.charAt(i)==' ') {
				j++;
				word="";
				
			}
			
			else {
				word = word+s.charAt(i);
				
			}
			arr[j]= word;
		}
		
		
		for (String words: arr) {
			System.out.println(words);
			
		}
	}

}
