package practice.datastructure.arrays;

//Input -> 1 2 3 4 5 6 7 8 9
//Output -> 9 1 8 2 7 3 6 4 5
class ReArrangeSortedArrayInMaxMinForm {

  public static void main(String[] args) {
    //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] arr = {1, 2, 3, 4};
    System.out.print("Array before min/max: ");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
   // maxMin(arr);
    maxMinBetterApproach(arr);

    System.out.print("Array after min/max: ");
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  public static void maxMin(int[] arr) {
    int[] arr1 = new int[arr.length];
    int front=0, j=0;
    int back = arr.length-1;

    while(j<arr.length && front != back){
        arr1[j++] = arr[back--];
        arr1[j++] = arr[front++];
    }
    if(front == back)
      arr1[j] = arr[front];

    for(int i=0;i<arr.length;i++){
      arr[i] =arr1[i];
    }

  }
  public static void maxMinBetterApproach(int[] arr) {
    int maxIdx = arr.length - 1;
    int minIdx = 0;
    int maxElem = arr[maxIdx] + 1; // store any element that is greater than the maximum element in the array
    for( int i = 0; i < arr.length; i++) {
      // at even indices we will store maximum elements
      if (i % 2 == 0){
        arr[i] += (arr[maxIdx] % maxElem ) * maxElem;
        maxIdx -= 1;
      }
      else { // at odd indices we will store minimum elements
        arr[i] += (arr[minIdx] % maxElem ) * maxElem;
        minIdx += 1;
      }
    }
    // dividing with maxElem to get original values.
    for( int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / maxElem;
    }
  }
}