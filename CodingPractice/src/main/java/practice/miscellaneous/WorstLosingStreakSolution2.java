package practice.miscellaneous;
import java.util.ArrayList;
import java.util.List;

public class WorstLosingStreakSolution2 {

    /*
     * Complete the 'worstLosingStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY nums as parameter.
     */
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		//arr.add(6);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(5);
		arr.add(1);
		arr.add(7);
		
		System.out.println(worstLosingStreak(arr));
	}

    public static int worstLosingStreak(List<Integer> nums) {
    // Write your code here
    	
    	Integer[] arr = (Integer[])nums.toArray(new Integer[nums.size()]);
    	int worstStreak = 0;
    	int currWorstStreak = 0;
    	
    	for (int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]){
				
			}
		}
		return currWorstStreak;
    }

}