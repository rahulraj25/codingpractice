package practice.miscellaneous;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDistinctElements {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(findDistinctElements(new int[]{4,5,6,6,6,8,5,7,1,9})));
	}

	private static int[] findDistinctElements(int[] arr) {
		
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		int[] result = new int[set.size()];
		
		int i=0;
		for(Integer num : set){
			result[i++] = num; 
		}
		
		return result;
	}
}
