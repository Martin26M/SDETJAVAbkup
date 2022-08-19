package Practice2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0 ;
		int b = 1;
		int sum =0; ;
		
		for (int i =0 ; i< 20; i++) {
			
			a= sum;
			sum = a+b;
			
			b= a;
			
			System.out.println(sum);
			
		}
		
		
		
		
		
		

	}

}
