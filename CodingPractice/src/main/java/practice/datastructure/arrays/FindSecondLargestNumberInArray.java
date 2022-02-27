package practice.datastructure.arrays;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6};
        //Arrays.sort(arr);
        System.out.println(findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }//end of for-loop

        return secondmax;
    }
}
