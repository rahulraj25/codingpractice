package practice.druva;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubArraysInAnArray {

    //[1,2,3,4,5]  2 -> 2 1 4 3 5

//    5 4 3 2 1
//
//    //1 2 3 4 5 6 , 3-> 321 654
//    214365
//
//    654321
//    ->
//    563412
//    ->
//    214365
//            654 321
//    // j =2
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
       // int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] arr2 = new int[arr.length];
        int pos = 3;
        //int pos =3;
        //check condition

        reverseArrayInSpans(arr, arr2, pos);
        reverseArrayInSpansUsingStack(arr, arr2, pos);

    }

    private static void reverseArrayInSpansUsingStack(int[] arr, int[] arr2, int span) {

        List<List<Queue>> lists = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Stack<Integer> integers = new Stack<>();
            integers.push(arr[i]);
        }
    }

    private static void reverseArrayInSpans(int[] arr, int[] arr2, int pos) {
        int k =0;
        for (int i = 0; i < arr.length- pos; i = i+ pos) {
            for (int j = i+ pos -1; j >= i; j--) {
                arr2[k++] = arr[j];
            }
        }

        int temp = k;
        //reverse the last chunk

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

