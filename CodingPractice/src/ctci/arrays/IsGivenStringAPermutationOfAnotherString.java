package ctci.arrays;

import java.util.Arrays;

public class IsGivenStringAPermutationOfAnotherString {
	
	public static void main(String[] args) {
		System.out.println(isPermutation("AABBPPPPPPPPP","PAPAPPBPPPPPB"));
		System.out.println(isPermutationWithBetterApproach("AABBPPPPPPPPP","PAPAPPBPPPPPB"));
		System.out.println(isPermutationWithEvenBetterApproach("AABBPPPPPPPPP","PAPAPPBPPPPPB"));
	}

	private static boolean isPermutation(String string1, String string2) {
		if(string1.length() != string2.length())
			return false;
		else{
			
			char[] chararray1 = string1.toCharArray();
			char[] chararray2 = string2.toCharArray();
			
			Arrays.sort(chararray1); // should be replaced with merge sort O(n log n)
			Arrays.sort(chararray2); // should be replaced with merge sort  O(n log n) 
			return Arrays.equals(chararray1, chararray2); //O(n) 
		}
	}
	
	//This approach will continue running even if the permutation check fails while running for the second string
	//Check third approach
	private static boolean isPermutationWithBetterApproach(String string1, String string2) {
		if(string1.length() != string2.length())
			return false;
		else{
			
			int[] charFlags1 = new int[256];
			int[] charFlags2 = new int[256];
			
			for (int i = 0; i < string1.length(); i++) { //O(n)
				int charAscii = string1.charAt(i);
				int charAscii2 = string2.charAt(i);
				charFlags1[charAscii] = charFlags1[charAscii]+1;
				charFlags2[charAscii2] = charFlags2[charAscii2]+1;
			}
			
			return Arrays.equals(charFlags1, charFlags2); //O(n) 
		}
	}
	
	private static boolean isPermutationWithEvenBetterApproach(String string1, String string2) {
		if(string1.length() != string2.length())
			return false;
		else{
			
			int[] charFlags = new int[256];
			
			for (int i = 0; i < string1.length(); i++) { //O(n)
				int charAscii = string1.charAt(i);
				++charFlags[charAscii];
			}
			
			for (int i = 0; i < string2.length(); i++) {
				int charAscii = string2.charAt(i);
				--charFlags[charAscii];
				
				if(charFlags[charAscii]<0)
					return false;
			}
			
			return true;
		}
	}
}
