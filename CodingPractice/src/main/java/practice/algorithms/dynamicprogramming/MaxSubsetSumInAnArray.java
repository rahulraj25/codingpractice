package practice.algorithms.dynamicprogramming;

//Maximum Subset Sum within an array, constraint is subarray cannot have adjacent elements
//[1 2 4 5 7] -> Maximum subset of non adjacent elements -> [1 + 4 +7] = 12
public class MaxSubsetSumInAnArray {
	
/*HINT: To address with DP, work through the array, keeping track of the max at each position until you get to the last value of the array. You should start with the base cases defined before iterating through the remainder of the array.

max @ position 0: value @ 0

max @ position 1: either:

value @ 0
value @ 1
from that point forward, the max of the next position is either:

the current value at that position
the max value found so far
the max value from 2 positions back plus the current value
keep track of the max at each position until you get to the last position of the array*/
	
	static int maxSubsetSum(int[] arr) {
		
		int mem[] = new int[arr.length];
		
		mem[0] = arr[0];
		mem[1] = Math.max(arr[1],arr[0]);
		
		int max  = Math.max(mem[0], mem[1]);
		
		for (int i = 2; i < mem.length; i++) {
			max = Math.max(maxSubset(arr, i, mem),max);
		}
		
		return max;
	}
	
	
	
	private static int maxSubset(int[] arr, int index, int[] mem) {
		
		int previousTwo = mem[index - 2];
		int previousOne = mem[index - 1];
		
		return Math.max(Math.max(previousOne, previousTwo), Math.max(previousTwo + arr[index], arr[index]));
	}



	public static void main(String[] args) {
		System.out.println(maxSubsetSum(new int[]{3,7,4,5,6}));
	}
}
    /*// Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        
        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();
        
        for(int i=0 ;i<arr.length ;i++){
            if(i%2==0){
                listEven.add(arr[i]);
            }else{
                listOdd.add(arr[i]);
            }   
        }
        
        return Math.max(maxSubset(listEven, listEven.size()),maxSubset(listOdd,listOdd.size()));
    }
    
    private static int maxSubset(List<Integer> list, int length){
        
        //BaseCase
        
        for(int i=1 ;i<length ;i++){
            maxSubsetBySize(list, i);
        }
        
        return maxSubset(list, length - 1);
    }
    
    private static int maxSubsetBySize(List<Integer> list, int chunkSize){
        
        if(chunkSize == 1){
            int currMax  = Integer.MIN_VALUE;
            
            for(int i=0 ;i<list.size() ;i++){
                if(list.get(i) > currMax){
                    currMax = list.get(i);
                }
                
            }
            
            return currMax;
        }
        
        return -1;    
    }*/