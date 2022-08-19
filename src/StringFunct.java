import java.util.Scanner;

public class StringFunct {
	
	public static void  checkval(String s , int flag) {
		

     String  charval="";
		
		
			for (int i =0; i<s.length(); i++) {
				
				if (flag==0 && i%2==0 ) 
				 
					{
						
								charval =  s.charAt(i)+"";
								System.out.print(charval);
							
								
					}
		          	
					
				
				
				
				else  if (flag==1 && i%2!=0) 
	             
	            		{
							
					charval =  s.charAt(i)+"";
					System.out.print(charval);
							
				}
							
			
		
			}
			
			

			
			
		}
		
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String Value");
		String ss = sc.next();
		System.out.println("Enter flag   Value");
		int flag = sc.nextInt();
		
		
		checkval(ss, flag);

	}

}
