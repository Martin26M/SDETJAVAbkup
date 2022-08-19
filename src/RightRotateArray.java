
public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MartinMAAAA";
	char []  ch =	str.toCharArray();
	char temp;
	int last = str.length()-1;
    temp = ch[last];
	//System.out.println(ch[0]);
	for (int i =str.length()-1; i>0;i--) {
		
		
		ch[i]=ch[i-1];
		
		
		
	}

	ch[0]=temp;
	
for(int k=0; k<str.length(); k++) {
	
	System.out.print(ch[k]);
}
	}

}
