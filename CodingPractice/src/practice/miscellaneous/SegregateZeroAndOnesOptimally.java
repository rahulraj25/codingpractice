package practice.miscellaneous;

//You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.
//
//Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
//Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

public class SegregateZeroAndOnesOptimally {

	public static void main(String[] args) {
		
		int[] arr	= new int[]{1, 1, 1, 1, 0, 1, 1, 0, 1, 0};
		
		
		//int zeroPointer = arr.length-1;
		//int i = rr.length-1;
		//int onePointer = 0;
		int sum=0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}
		
		//int finalPos = zeroPointer - onePointer;
		
		for (int j = 0; j < arr.length; j++) {
			if(j<=sum-1)
				arr[j]=0;
			else
				arr[j]=1;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+ " ");	
		}
		
		
	}
}
