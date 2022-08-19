import java.util.Scanner;

public class CheckCode {

	
	public static int[] chekout(int []  arr) {
		
		for (int i =0;i<arr.length-1;i++) {
			
			 {
				 
					
				int a = arr[i+1]-arr[i];
				
				int b= arr[i+2]-arr[i+1];
				int c= arr[i+1]/arr[i];
				int d= arr[i+2]/arr[i+1];
				
				
				
               if (a==b) { 
					
					System.out.println("arithmetic");
					
				}
               
               else if (c==d) {
               	
               	System.out.println("geometric");
               	
               	
               }
               
               else {
               	
               	System.out.println("-1");
               }
           	break;
			 }
				
				
			}
			
			return arr;
		}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter values in array");
    int i =	sc.nextInt();
	
    int [] arrnew = new int [i];
	
    for (Integer insert: arrnew) {
    	
    	
    	
    }
	
    chekout(arrnew);
	
	}
	}

