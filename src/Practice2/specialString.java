package Practice2;

public class specialString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "martin1123asAAda@#$@#";

		String s1 = "";
		String s2="";
		String s3="";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				s1 = s1 + str.charAt(i);

			}

			else if (Character.isAlphabetic(str.charAt(i))) {

				s2 = s2 + str.charAt(i);
			}

			else {

				s3 = s3 + str.charAt(i);
			}

		}

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
