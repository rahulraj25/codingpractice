package practice.miscellaneous;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorstLosingStreakSolution1 {

    /*
     * Complete the 'worstLosingStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY nums as parameter.
     */
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		//arr.add(6);
		/*arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(5);
		arr.add(1);
		arr.add(7);*/
		Integer[] is = new Integer[]{256, -235, 678, 50, 134, 136, 481, 457,
				829, 714, 745, 543, 621, 410, 81, 28, 830, 753, 438, 711, 228, 631,
				328, 952, 215, 256, 407, 959, 351, 718, 699, -28, 494, 764, 151, 579, 782, 704,
				976, 22, 216, -175, 626, 838, 744, 530, 303, 365, -18, -7, 178, 163, -5, 628, 662, 757, -154,
				324, 720, 844, 259, 842, 902, 489, 412, 282, 28, 131, -73, 494, 618, 912, 534, 603, 865, -246,
				937, 182, 833, 675, -84, 781, -156, 845, 697, 646, 335, 821, -58, 334, 15,
				307, 311, 311, 413, 547, 433, -166, 877, -129};
		arr.addAll(Arrays.asList(is));
		System.out.println(worstLosingStreak(arr));
	}

    public static int worstLosingStreak(List<Integer> nums) {
    // Write your code here
    	
    	Integer[] mainArr = (Integer[])nums.toArray(new Integer[nums.size()]);
    	int[] diffArr =  new int[nums.size()];
    	
    	for (int i = 1; i < mainArr.length; i++) {
			diffArr[i-1] = mainArr[i] - mainArr[i-1];
		}
    	for(int i = 0; i < diffArr.length; i++){
    		System.out.println(i + " : "+ diffArr[i]);
    	}
    	
    	int worstStreak = 0;
    	int currentWorstStreak = 0;
    	for(int i = 0; i < diffArr.length; i++){
    			if(diffArr[i] < 0){
    				currentWorstStreak += Math.abs(diffArr[i]);
    			}
    			else{
    				if(worstStreak < currentWorstStreak){
    					worstStreak = currentWorstStreak;
    				}
    				
    				currentWorstStreak = 0;
    			}
    		
    	}
    	
    	return currentWorstStreak > worstStreak ? currentWorstStreak : worstStreak;
    }

}