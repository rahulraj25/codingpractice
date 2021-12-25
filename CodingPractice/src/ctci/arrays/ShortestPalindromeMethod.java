package ctci.arrays;

public class ShortestPalindromeMethod {

    /*
     * Complete the 'shortestPalindrome' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int shortestPalindrome(String s) {
        int l =0;
        int h = s.length()-1;

        return shortestPalindromeMethod(s,l,h);
    }

    public static int shortestPalindromeMethod(String s, int l, int h) {

        if(l > h) return Integer.MAX_VALUE;
        if(l == h) return 0;
        if(l==h-1) return (s.indexOf(l) == s.indexOf(h)) ? 0 : 1;

        return (s.indexOf(l) == s.indexOf(h))?
                shortestPalindromeMethod(s, l+1, h-1):
                (Integer.min(shortestPalindromeMethod(s,l,h-1),
                shortestPalindromeMethod(s,l+1,h) + 1)); 

    }
}