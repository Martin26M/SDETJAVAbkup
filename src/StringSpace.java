
public class StringSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "    My name   is   Martin              Mathew";
		s.trim();
		System.out.println(s);

String newss= 	s.replaceAll(" +", " ").trim();
	
System.out.println(newss);
	}

}
