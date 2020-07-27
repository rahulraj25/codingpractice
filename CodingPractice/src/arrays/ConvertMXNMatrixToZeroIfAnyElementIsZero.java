package arrays;

import java.util.Arrays;

/*If an element in an M x N Matrix is 0, its entire row and column are set to 0.
 * 1.7 on Arrays and Strings
 */
public class ConvertMXNMatrixToZeroIfAnyElementIsZero {
	
	public static void main(String[] args) {
		printArray(returnZeroMatrixIfAnyElementIsZero(new int[][]{{1, 2, 3, 4}, {4, 5, 2, 6}, {7, 8, 9, 0}}));
		printArray(returnZeroMatrixIfAnyElementIsZero(new int[][]{{1, 2, 3, 4}, {4, 5, -9, 11}, {7, 8, 9, 12}}));
	}

	private static int[][] returnZeroMatrixIfAnyElementIsZero(int[][] arr) {
		int rowsLength = arr.length;
		int colLength = arr[0].length;
		
		for (int i = 0; i < rowsLength; i++) {
			for (int j = 0; j < colLength; j++) {
				if(arr[i][j] == 0){
					return new int[rowsLength][colLength];
				}
			}
		}
		return arr;
	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
	
}
