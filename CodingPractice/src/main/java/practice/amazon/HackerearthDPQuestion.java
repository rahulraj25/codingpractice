package practice.amazon;

public class HackerearthDPQuestion {
	public static void main(String[] args) {
		long[] k_step_sum = K_step_sum(2,new int[]{4,5},2,new int[][]{{1,1,2},{1,2,1}});
		System.out.println("------------");
		for (int i = 0; i < k_step_sum.length; i++) {
			System.out.print(k_step_sum[i]+ " ");
		}
	}
	
	 static long[] K_step_sum(int N, int[] A, int Q, int[][] queries){
	        long[] result = new long[queries.length];

	        for (int i = 0; i < queries.length; i++) {
	            int L = queries[i][0];
	            int R = queries[i][1];
	            int K = queries[i][2];
	            
	            System.out.println("L:" + L);
	            System.out.println("R:" + R);
	            System.out.println("K:" + K);
	            
	            int[] F = new int[A.length];
	            computeResultF(F, K, A, A.length -1);
	            
	            System.out.println("F:");
	            for (int j = 0; j < F.length; j++) {
					System.out.print(F[j] + " ");
				}
	            System.out.println();
	            
	            int[] B = computeResultB(K, A, F);
	        
	            System.out.println("B:");
	            
	            for (int j = 0; j < B.length; j++) {
					System.out.print(B[j] + " ");
				}
	            System.out.println();

	            int sum = 0;	            
	            for(int j = L-1 ; j<R; j++){
	            	sum += B[j];	
	            }
	            result[i] = sum;
	            
	        }
	        
	        return result;
	    
	    }

	    static int computeResultF(int[] F, int K,int[] A,int i){
	        
	        if( i == 0 ){
	        	F[0] = A[0];
	        	return F[0];
	        }else{
	        	F[i] = computeResultF(F, K, A, i-1) + A[K * (int)Math.floor(i/K)];
	        	return F[i];
	        }
	    }
	        	
	    static int[] computeResultB(int K, int[] A, int[] F){
	        int[] B = new int[A.length];
	        
	        for (int i = 0; i < B.length; i++) {
				B[i] = A[0] + F[i];
			}
	        
	        return B;
	    }
}
