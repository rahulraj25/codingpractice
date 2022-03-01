package practice.datastructures.stackqueues;

import java.util.LinkedList;
import java.util.Queue;

/*
 *
 It must return an array of integers representing the maximum minimum value for each window size from 1 to n.
Sample Input : 2 6 1 12
Sample Output :12 2 1 1
Explanation 
 
window_size | window1 | window2 | window3 | window4 | maximum of all windows
	1			2			6		 1			12		12
	2			2			1		 1					2
	3			1			1		 					1
	4			1										1
 */
public class QueuePuzzleQuestion {
	// Complete the riddle function below.
	    static long[] riddle(long[] arr) {
	        
	        Queue<Long> q1 = new LinkedList<>();
	        Queue<Long> q2 = new LinkedList<>();
	        
	        //2 6 1 12
	        long[] result = new long[arr.length];
	        long currMax = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < arr.length ; i++) {
	                q1.add(arr[i]);
	                currMax = Math.max(arr[i], currMax);
	        }
	        
	        result[0] =currMax;
	        //13 3 1 1 1 1 1
	
	        //13 3 2 1 1 1 1
	        for (int i = 1; i < arr.length; i++) {
	           currMax = Integer.MIN_VALUE;
	           while(q1.size()>=2){
	               Long l = q1.poll();
	               Long b = q1.peek();
	               
	               Long temp = Math.min(l,b);
	               q2.add(temp);
	               
	               if(temp > currMax){
	                currMax = temp; 
	               }
	           }
	           result[i] = currMax;
	           q1.clear();
	           q1.addAll(q2);
	           q2.clear();
	          // System.out.println(q1);
	        } 
	        
	        return result;
	    }
}

