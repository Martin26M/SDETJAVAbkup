package Practice2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String m = "Martin";

String temp = "";
for (int i =m.length()-1; i>=0;i--) {
	
	temp =temp+m.charAt(i);
	
}

System.out.println(temp);
	}

}
