package practice.citibank;

class Solution2 {
	int solution(int[] A) {
		int n = A.length;
		int[] L = new int[n + 1];
		L[0] = -1;
		for (int i = 0; i < n; i++) {
			L[i + 1] = A[i];
		}
		int count = 0;
		int pos = (n + 1) / 2;
		
		int candidate = L[1];
		
		
		for (int i = 1; i <= n; i++) {
			if (L[i] == candidate){
				count = count + 1;
			}else{
				if(count > pos && count > L[0]){
					L[0] = L[i-1];
				}
					
				else{
					candidate = L[i];
				}
				
				count = 0;
					
			}
				
		}
		
		return L[0];
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution2().solution(new int[]{1,1,1,1,50}));
		System.out.println(new Solution2().solution(new int[]{2,2,2,2,2,3,4,4,4,6}));
	}
}
