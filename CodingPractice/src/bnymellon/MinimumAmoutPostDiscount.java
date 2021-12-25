package bnymellon;

import java.util.ArrayList;
import java.util.List;

public class MinimumAmoutPostDiscount {
	
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(2); integers.add(5); integers.add(1); integers.add(4);
		System.out.println(calculateAmount(integers));
	}
	
	public static long calculateAmount(List<Integer> prices) {
	    
		int[] disc = new int[prices.size()];
		disc[0] = 0;
		int prevMin = prices.get(0);
		for (int i = 1; i < prices.size(); i++) {
			
			if(prices.get(i) < prevMin){
				disc[i] = prices.get(i);
				prevMin = prices.get(i);
			}else{
				disc[i] = prevMin;
			}
		}
		
		int sum=0;
		int orgSum=0;
		for (int i = 0; i < disc.length; i++) {
			sum += disc[i];
			orgSum += prices.get(i);
		}
		
		return orgSum - sum;
	}
}

