package bnymellon;

public class CountClosedPaths {
	public static void main(String[] args) {
		
		int num = 630;
		
		System.out.println(closedPaths(num));
	}
	
	public static int closedPaths(int number){
		int closedPathsSum = 0 ;
		while(number != 0){
			closedPathsSum += countClosedPath(number%10);
			number = number/10;
		}
		return closedPathsSum;
	}

	private static int countClosedPath(int i) {
		switch(i){
		case 8:
			return 2;
		case 6:
		case 9:
		case 4:
		case 0:
			return 1;
		default:
			return 0;
		}
			
	}
}
