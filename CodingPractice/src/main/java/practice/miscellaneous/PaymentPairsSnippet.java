package practice.miscellaneous;
import java.util.ArrayList;
import java.util.List;

public class PaymentPairsSnippet {

	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		/*arr.add(50);
		arr.add(60);
		arr.add(150);
		arr.add(50);
		arr.add(40);
		*/
		arr.add(100); arr.add(100);  arr.add(100);  
		System.out.println(paymentPairs(arr));
	}

    public static int paymentPairs(List<Integer> nums) {
    // Write your code here
    	
    	Integer[] arr = (Integer[])nums.toArray(new Integer[nums.size()]);
    	int pairs = 0;
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j){
					continue;
				}
				else{
					if(((arr[i] + arr[j]) % 100) == 0)
						pairs++;
				}
			}
		}
    	
    	return pairs/2;
    	
    	
    }

}