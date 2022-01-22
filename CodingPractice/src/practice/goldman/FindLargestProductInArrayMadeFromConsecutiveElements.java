package goldman;

import java.util.ArrayList;
import java.util.List;

public class FindLargestProductInArrayMadeFromConsecutiveElements {
    public static void main(String[] args) {

    List<Integer> nums = new ArrayList<>();
     // Test Case 1
     // nums.add(2); nums.add(2); nums.add(-5); nums.add(0); nums.add(-6); nums.add(-4);

     // Test Case 2
     nums.add(2); nums.add(2); nums.add(5); nums.add(0); nums.add(6); nums.add(4);

     int product = Integer.MIN_VALUE;

        for(int i=1;i<nums.size();i++){
            product = calculateProdWithSpan(product,nums,i);
        }

    System.out.println(product);
    }

    private static int calculateProdWithSpan(int product, List<Integer> nums , int x){
        for(int i=0 ; i<nums.size()-x; i++){
            int tempProduct = 1;
            for(int j=0 ; j<=x; j++){
                tempProduct = tempProduct * nums.get(i + j);
            }
            product = Math.max(tempProduct, product);
        }
        return product;
    }

}
