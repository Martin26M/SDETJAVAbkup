import java.util.Scanner;

public class dynamicfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numner for fibo");
	int n =	sc.nextInt();
	
	int a =0; 
	int b=1;
	int sum=0;
	
	for (int i =0 ; i<n ; i++) {
		
		
		sum= a+b;
		a=b;
		b=sum;
		System.out.println(sum);
		if (sum==13) {
			
			break;
		}
		
		
	}
	
	
	
	
	
	}

}
