package practice.druva;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseSubArraysInAnArray {

    //[1,2,3,4,5]  -> [3, 2, 1, 5, 4]
	//[1,2,3,4,5,6,7,8] -> [3, 2, 1, 6, 5, 4, 8, 7]
    public static void main(String[] args) {
    // int[] arr = new int[]{1,2,3,4,5};
       int[] arr = new int[]{1,2,3,4,5,6,7,8};
       
       int span = 3;
       reverseArrayInSpansUsingStack(arr, span);
    }

    private static void reverseArrayInSpansUsingStack(int[] arr, int span) {
    	int begin = 0;
    	int end =  begin + span - 1; 
    	List<Integer> nums = new ArrayList<>();
    	Stack<Integer> stack = new Stack<>();
    	
    	while(begin < arr.length && end < arr.length){
    		
    		for(int i=begin ; i<=end ; i++){
    			stack.push(arr[i]);
    		}
    		
    		while(!stack.isEmpty())
    			nums.add(stack.pop());
    		
    		begin = end + 1 ;
    		end = (begin + span - 1) <= arr.length -1 ? (begin + span -1) : arr.length - 1;   
    	}
    	
    	System.out.println(nums);
    }

}