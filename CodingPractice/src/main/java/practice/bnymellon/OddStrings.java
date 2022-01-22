package practice.bnymellon;

import java.util.ArrayList;
import java.util.List;

public class OddStrings {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("aceace");
		arr.add("ceceaa");
		arr.add("abdbdbdbakjkljhkjh");
		 System.out.println(solve(50, arr));
	}
	
	public static String solve(int m, List<String> s){
		
		int oddCount = 0;
		
		for (String string : s) {
			
			char[] charArray = string.toCharArray();
			boolean[] squaredEven = new boolean[charArray.length];
			
			for (int i = 0; i < charArray.length; i++) {
					boolean isEven = (charArray[i] % 2) == 0;
					if(isEven){
						squaredEven[i] = true;
					}else{
						squaredEven[i] = false;
					}
			}
			
			
			for (int i = 0; i < squaredEven.length; i++) {
				if(!squaredEven[i])
					oddCount++;
			}
			
			
		}			
			
			if(oddCount%2==0)
				return "EVEN";
			else
				return "ODD";
		
		
	}
}
