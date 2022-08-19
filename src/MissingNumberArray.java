
public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 4, 5, 3, 7, 8, 6};
		int len =8;
		
		int correctsum = (len*(len+1))/2;
		
		int arraySum=0;
		
		for (int i=0; i<arr.length;i++) {
			
			arraySum = arraySum+arr[i];
			
			
		}
		
		int num  = correctsum-arraySum;
		System.out.println(num);

	}

}
