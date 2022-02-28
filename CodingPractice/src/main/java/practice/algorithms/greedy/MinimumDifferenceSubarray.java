package practice.algorithms.greedy;

import java.util.Comparator;
import java.util.List;

//HackerRank Question
//arr = [ 1 , 4, 7, 2] k =2, Minimum of [max(arr') - min(arr')] where arr' = subarray of size k from arr
public class MinimumDifferenceSubarray {
	
	public static int maxMin(int k, List<Integer> arr) {
        arr.sort(Comparator.comparingInt(a -> a));
        
        int currentRes = Integer.MAX_VALUE;
        
        int begin = 0;
        int end = k - 1;

        while(begin < arr.size() && end < arr.size()){
            
            if(currentRes > (arr.get(end)  - arr.get(begin))){
                currentRes =  (arr.get(end)  - arr.get(begin));
            }
            
            begin = begin + 1;
            end = end+1;
        }
        
        return currentRes;
    }
	
	public static void main(String[] args) {
		
	}

}
