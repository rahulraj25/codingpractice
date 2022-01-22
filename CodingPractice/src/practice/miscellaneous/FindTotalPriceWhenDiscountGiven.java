package miscellaneous;

import java.util.Arrays;

public class FindTotalPriceWhenDiscountGiven {
	public static void main(String[] args) {
		
		System.out.println(findTotalPriceAfterDiscount(new int[]{50, 10 ,10}, 10));
	}

	private static int findTotalPriceAfterDiscount(int[] arr, int discount) {
		
		Arrays.sort(arr);
		
		double discountInFloat = (1 - ((double)discount/100));
		double price= arr[arr.length-1]*discountInFloat;
		
		for (int j = 0; j < arr.length-1; j++) {
			price = price + arr[j];
		}
		
		return (int)price;
	}
	

}
