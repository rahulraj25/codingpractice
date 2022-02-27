package practice.algorithms.greedy;

import java.util.Arrays;

public class GreedyFloristHackerrank {

    public static void main(String[] args) {
        //int[] c = new int[]{1, 3, 5, 7, 9};
        int[] c = new int[]{390225,426456,688267,800389,990107,439248,240638,15991,874479,568754,729927,980985,132244,488186,5037,721765,251885,28458,23710,281490,30935,897665,768945,337228,533277,959855,927447,941485,24242,684459,312855,716170,512600,608266,779912,950103,211756,665028,642996,262173,789020,932421,390745,433434,350262,463568,668809,305781,815771,550800};
        System.out.println(getMinimumCost(3, c));
    }

    static long getMinimumCost(int k, int[] c) {
        if(k >= c.length)
            return sum(c);
        else{
            Arrays.sort(c);
            return getCostOfLastKelements(k,c) + getMinimumCost(k,c,c.length);
        }
    }

    private static long getCostOfLastKelements(int k, int[] c) {
        long sum = 0;
        for (int i = c.length - k ; i < c.length ; i++) {
            sum +=  c[i];
        }

        return sum;
    }

    private static long getMinimumCost(int k, int[] c, int length){
        long sum =0;
        for (int i = 0; i < c.length - k; i++) {
            sum +=  (2 * c[i]);
        }

        return sum;
    }


    static int sum(int[] arr){
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

}
