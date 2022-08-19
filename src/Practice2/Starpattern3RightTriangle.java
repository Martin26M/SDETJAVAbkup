package Practice2;

public class Starpattern3RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int row =1;row <6; row++) {
			for (int col =4; col>=row ; col--) {
				
				System.out.print(" ");
			}
			for (int i=row; i>0; i--) {
				
				System.out.print("*");
				
			}
			System.out.println("");
			
		}

	}

}
