
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int num = 123456;
		 int sumnum=0;
		 
		 while (num>0) {
			 
			 int newnum = num%10;
			 
			 sumnum	=sumnum+newnum;
			 
			 num= num/10;
			 
		 }
		 
		
		 System.out.println(sumnum);
	}

}
