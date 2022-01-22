package ctci.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IsGivenStringAPermutationOfAPalindrome {
	
	public static void main(String[] args) {
		System.out.println(isPermutationOfPalindrome("tacocatii"));
		System.out.println(isPermutationOfPalindromeWithoutHashMap("tacocati"));
	}
	
	private static boolean isPermutationOfPalindrome(String string) {
		Map<Character,Integer> charactersWithOccurences = new HashMap<>();
		
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(!charactersWithOccurences.containsKey(charArray[i])){
				charactersWithOccurences.put(charArray[i], 1);
			}
			else{
				charactersWithOccurences.put(charArray[i], charactersWithOccurences.get(charArray[i])+1);
			}
		}
		
		return charactersWithOccurences.values().stream().filter(a->a%2 == 1).collect(Collectors.toList()).size() == 1;
		
	}

	//Assumption all characters are lower case
	private static boolean isPermutationOfPalindromeWithoutHashMap(String string) {
		
		int[] hashTable = new int[26];
		char[] charArray = string.toCharArray();
		
		for(int i=0; i<charArray.length; i++){
			int pos = (int)charArray[i] - 'a';
			++hashTable[pos];
		}
		
		boolean foundOdd = false;
		
		for (int i = 0; i < hashTable.length; i++) {
			if(hashTable[i]%2 == 1){
				if(foundOdd){
					return false;
				}
			foundOdd = true;	
			}
		}
		
		return true;
	}


}
