package practice.algorithms.recursion;

public class PrintAllPermutationsOfAString {

    public static void main(String[] args) {

        //String str = new String("abcde");
        String str = new String("ABC");
        permute(str.toCharArray(),0);
    }

    private static void permute(char[] str, int index) {

        //Base Case
        if (index == str.length) {
            System.out.println(str);
            return;
        }

        //regular case
        for(int i = 0; i < str.length ;i++){
            swap(str,index,i);
            permute(str, index + 1);
            swap(str,index,i);
        }
    }

    private static void swap(char[] charArray, int index, int i) {
        char temp = charArray[index];
        charArray[index] = charArray[i];
        charArray[i] = temp;
    }
}
