package miscellaneous;

public class FibonacciUsingRecursion {
	public static void main(String[] args) {
		
		fibonacciUsingRecursion(5);
	}
	
		
	public static int fibonacciUsingRecursion(int n){
		System.out.println(n);
			if(n == 0 || n == 1)
				return n;
					
			else
				return fibonacciUsingRecursion(n-1)  + fibonacciUsingRecursion(n-2);
		}
}
	

