
public class Merge2Arrays {

	
	public static int[]  mergeArrays(int [] resarr,int[] arr1, int[] arr2 ) {
		int temp=0;
		
		for (Integer arrfirst :arr1) {
			
			
			resarr[temp]=arrfirst;
			temp++;
		}
		
for (Integer arrSecond :arr2) {
			
			
			resarr[temp]=arrSecond;
			temp++;
		}
		
		return resarr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []  arr1 = {1,2,3,4,5};
		int []  arr2 = {5,6,7,8,9,10};

		
		int reslength = arr1.length+ arr2.length;
		
		int [] resarray = new int [reslength];
		
		mergeArrays(resarray, arr1,arr2);
		
		for (Integer res: resarray) {
			
			
			System.out.println(res);
		}

	}

}
