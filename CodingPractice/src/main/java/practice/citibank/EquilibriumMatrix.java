package practice.citibank;

public class EquilibriumMatrix {
	public static void main(String[] args) {
		
		int arr[][] ={{2,7,5},{3,1,1},{2,1,-7},{0,2,1},{1,6,8}};
		
		int col = arr[0].length;
		int rows = arr.length;
		
		System.out.println(col);
		System.out.println(rows);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				
				if(topRowSum(arr,j-1) == bottomRowSum(arr,j+1) && leftColSum(arr,i-1) == rightColSum(arr,i+1))
					System.out.println("Wohoo");
			}
		}
	}

	private static int rightColSum(int[][] arr, int pos) {
		int sum = 0;
		if(pos == arr[0].length)
			return 0;
		else{
		for (int i = pos; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				sum += arr[i][j];
			}
		}
		return sum;
		}
	}

	private static int leftColSum(int[][] arr, int pos) {
		int sum = 0;
		if(pos < 0)
			return 0;
		else{
		for (int i = 0; i <= pos; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				sum += arr[i][j];
			}
		}
		return sum;
		}
	}

	private static int bottomRowSum(int[][] arr, int pos) {
		int sum = 0;
		
		if(pos == arr.length)
			return 0;
		else{
		for (int i = pos ; i <= arr[0].length; i++) {
			for (int j = 0; j < arr.length ; j++) {
				
				sum += arr[i][j];
			}
		}
		return sum;
		}
	}

	private static int topRowSum(int[][] arr, int pos) {
		int sum = 0;
		
		if(pos < 0)
			return 0;
		else{
		for (int i = 0; i <= pos; i++) {
			for (int j = 0; j <= arr[0].length ; j++) {
				
				sum += arr[i][j];
			}
		}
		return sum;
		}
	}

		
}
