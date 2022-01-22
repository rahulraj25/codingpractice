package miscellaneous;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(fibonacciUsingRecursion(i) + " ");
		}
	}
	
		
	public static int fibonacciUsingRecursion(int n){
		
			if(n == 0 || n == 1){
				return n;
			}
			
			else 
				return fibonacciUsingRecursion(n-1)  + fibonacciUsingRecursion(n-2);
		}
}
	

