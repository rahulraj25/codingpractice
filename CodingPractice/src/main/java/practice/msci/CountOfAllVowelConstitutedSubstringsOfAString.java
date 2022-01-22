package practice.msci;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfAllVowelConstitutedSubstringsOfAString {

    public static void main(String[] args) {

        //String s = new String("aeioukaeioiikooiekeku");

        String s = new String("aeiouaekeiiaou");
        String[] strings = s.split("[bcdfghjklmnpqrstvwxyz]");
        List<String> stringList = Arrays.stream(strings).collect(Collectors.toList());

        List<Integer> as = stringList.stream().filter(a-> a.length() > 5).map(a -> getCountOfVowelSubstrings(a)).collect(Collectors.toList());

        System.out.println(as);

    }

    private static int getCountOfVowelSubstrings(String s) {
        HashSet<Character> characters = new HashSet<>();
        int end = 5, count=0;
        for(int i=0 ;end <= s.length() ;i++){
            String temp = s.substring(i,end);
            System.out.println(temp);
            for (int k = 0; k < temp.length(); k++) {
                characters.add(temp.charAt(k));
            }

            if(characters.size() ==5){
                count++;
            }
            characters.clear();
            end++;
        }

        return count;
    }
}
