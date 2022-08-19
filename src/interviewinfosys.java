
public class interviewinfosys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s ="martin$mm";
		String  ss="";
		String sss="";
		for (int i =0; i<s.length(); i++) {
			
			if (s.charAt(i)=='$') {
				
				
				s= s.replace('$', ' ');
				s=s.replace(s.charAt(i-1), ' ');
				ss= s.substring(0, i-1);
				sss = s.substring(i, s.length());
				
			}
			
		}

		System.out.println(ss+sss);
	}

}
