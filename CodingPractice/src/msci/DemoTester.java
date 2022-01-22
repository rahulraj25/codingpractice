package msci;

public class DemoTester {

    public static void main(String[] args) {

        System.out.println(vowelsubstring("aeiouaekeiiaou"));
    }

    public static int vowelsubstring(String s) {

        int count = 0, beginIndex = 0;
        int endIndex = 5;
        while(endIndex <= s.length()){

            if(allVowelsPresent(s.substring(beginIndex, endIndex))){
                count++;
                endIndex++;
                while((endIndex <= s.length()) && isVowel(s.charAt(endIndex-1)) && allVowelsPresent(s.substring(beginIndex, endIndex))){
                    count++;
                    endIndex++;
                }

            }
            beginIndex = endIndex;
            endIndex = beginIndex + 5;
        }

        return count;

    }
    public static boolean isVowel(char s){

        if(s == 'a' || s == 'e' ||s == 'i' ||s == 'o' ||s == 'u'){
            return  true;
        }

        return false;
    }
    public static boolean allVowelsPresent(String s){
        System.out.println(s);
        int[] array = new int[26];
        char[] charArray = s.toCharArray() ;
        for(int i =0 ;i<charArray.length; i++){
            array[charArray[i] - 'a']++;
        }

        if(array[0] > 0 && array[4] > 0 && array[8] > 0 && array[14] > 0 && array[20] > 0)
            return true;

        return false;
    }
}
