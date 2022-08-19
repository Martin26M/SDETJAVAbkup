
public class Swapwithout {
	
	
	public static int swapper(int a , int b ) {
		
		a = a+b;
		 b = a-b;
		 a= a-b;
		
		 return a;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int outPut= 	swapper(10,20 );
	System.out.println(outPut);
	}

}
