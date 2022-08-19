package Practice2;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int factorial =1;
// 
// 
// for (int i=1; i<10; i++) {
//	 
//	 factorial= factorial*i;
//	 
// }
//	
//	System.out.println(factorial);
//	
//	}

		
		int a=0;
		int b=1;
		int sum=0;
		
		for (int i =0; i<10; i++) {
			a=sum;
			
		
			sum= a+b;
			b=a;
			System.out.println(sum);
		}
		
		

}}