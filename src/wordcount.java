
public class wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="my name is martin check  ";
		
		String []  word =s.split(" ");
		String newword  = "123nsdmf456@!#";
		String  ss="";
		
		for (int i =0; i<newword.length(); i++) {
			
			if (Character.isDigit(newword.charAt(i))) {
				
				ss=  ss+newword.charAt(i);
				System.out.print(ss);
				
			}
		
			
		
		}

	}

}
