package ctci.arrays;

import java.util.Arrays;

public class RotateNXNMatrixBy90Degrees {
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1, 2, 3, 10},{4, 5, 6, 11}, {7, 8, 9, 12}, {13, 14, 15, 16}};
		printArray(arr);
		System.out.println("----------------");
		printArray(rotateMatrixBy90Degrees(arr));
	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	private static int[][] rotateMatrixBy90Degrees(int[][] arr) {
		int rowSize = arr.length;
		
		int[][] newArray = new int[rowSize][rowSize];
		int l=0;
		
		for (int i = rowSize-1; i >= 0; i--) {
			for (int j = 0; j < rowSize; j++) {
				newArray[l][j] = arr[j][i]; 
			}
			l++;
		}
		
		return newArray;
		
	}
	
}
