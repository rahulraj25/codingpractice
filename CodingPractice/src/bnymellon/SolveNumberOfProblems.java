package bnymellon;

public class SolveNumberOfProblems {
	public static void main(String[] args) {
		System.out.println(minNum(3,5,1));
	}
	
	public static int minNum(int A, int K, int P){
		int totalK = 0;
		int totalA = P;
		int count=0;
		
		if( A > K)
			return -1;
		else if( A == K && P >= 1)
			return -1;
		else{
			
			while(totalK <= totalA){
				totalK += K;
				totalA += A;
				count++;
			}
			
			return count;
		}
		
		
		
		
		
		
		
		
		
	}
}
