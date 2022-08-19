
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a= 1;
		int b=0;
		int sum=0 ;
		for (int i =0 ; i<10 ; i++)
		{
			
			sum= a+b;
			
			b= a;
			a= sum;
		
			System.out.println(sum);
		
		}		
		

	}

}
