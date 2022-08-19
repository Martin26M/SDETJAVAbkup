package Practice2;

public class StarPattern1Eshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		for (int row = 0 ; row <= 6 ; row ++) {
			
			for (int col=0 ; col<5; col++) {
				
				if (row==0 || row ==3|| row==6|| col==1) {
					
					System.out.print("*");
					
				}
				
				
				
			}
			
			System.out.println("");
		}
		
		
		
		
		
		
		
	}
}
