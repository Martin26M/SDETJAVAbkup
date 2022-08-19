import java.util.Scanner;

public class Lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//double no = 	Math.random();
	//System.out.println(no);
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter A");
	String A= sc.next();
	System.out.println("Enter B");
	String B= sc.next();
	
int a =	A.length();
	int b= B.length();
	int sum = a+b;
	System.out.println(sum);
	if (A.compareTo(B)>0) {
		
		System.out.println("Yes");
		
	}
	else {
		System.out.println("No");
	}
	
  char first= 	A.charAt(0);
  char newfisrt =Character.toUpperCase(first);
  
  char second = B.charAt(0);
  char newsecond  =  Character.toUpperCase(second);
  
String newA=   A.replace(A.charAt(0), newfisrt);
  String newB= B.replace(B.charAt(0), newsecond);

  System.out.println(newA+" "+newB);
  

	}

}
