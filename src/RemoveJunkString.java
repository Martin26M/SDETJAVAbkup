
public class RemoveJunkString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="@@#$@$%^^&*%^&*%!#@#@MartinMatherw";
		
		str=	str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
