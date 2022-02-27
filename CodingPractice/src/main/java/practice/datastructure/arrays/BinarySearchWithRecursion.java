package practice.datastructure.arrays;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {

    }

    static int binarySearchRec(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return binarySearchRec(a, key, low, mid - 1);
        } else {
            return binarySearchRec(a, key, mid + 1, high);
        }
    }
    static int binSearch(int[] a, int key) {
        return binarySearchRec(a, key, 0, a.length - 1);
    }

}
