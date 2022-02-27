package practice.datastructure.arrays;

//Brute force -> find all subarray sums starting from that position -> max of that -> O(n*n)
public class FindMaximumSubArrayInAnArray {
    public static void main(String[] args) {
        //int[] arr = {-7,6,-2};
        //int[] arr = {-5,-13,-2,-4};
        int[] arr = {5,1,-4,2,3};
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.print(findMaxSumSubArray(arr));
    }
    public static int findMaxSumSubArray(int[] arr) {
        int globalMax = arr[0], localMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
                localMax = arr[i];
            }else{
                localMax = localMax + arr[i];
            }
            if(localMax > globalMax)
                globalMax = localMax;
        }
        return globalMax;
    }

//    public static int findMaxSumSubArray(int[] arr, int index, int len, int currMax) {
//        if(index == len)
//            return arr[len];
//        int maxSumSubArray =0;
//
//        if(arr[index] < 0)
//            maxSumSubArray = currMax;
//        else{
//            currMax = arr[index];
//            maxSumSubArray = arr[index] + findMaxSumSubArray(arr, index + 1, len, currMax);
//        }
//        return maxSumSubArray;
//    }
}
