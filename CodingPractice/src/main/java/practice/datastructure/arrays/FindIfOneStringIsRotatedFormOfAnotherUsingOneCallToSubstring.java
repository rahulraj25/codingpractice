package practice.datastructure.arrays;

/*ERBOTTLEWAT is a rotated form of WATERBOTTLE.
 *return true if one substring is rotated form of Another using only one call to isSubstring method
 */
public class FindIfOneStringIsRotatedFormOfAnotherUsingOneCallToSubstring {

	public static void main(String[] args) {
		System.out.println(areStringsRotatedFormOfAnother("ERBOTTLEWAT","WATERBOTTLE"));
		System.out.println(areStringsRotatedFormOfAnother("WATERBOTTLE","ERBOTTLEWAT"));
		System.out.println(areStringsRotatedFormOfAnother("ERBOTTLEWAT","WATERBOTTLES"));
		System.out.println(areStringsRotatedFormOfAnother("XOXOX","OXOXO"));
		System.out.println(areStringsRotatedFormOfAnother("XOXOX","OXOXX"));
	}

	private static boolean areStringsRotatedFormOfAnother(String string1, String string2) {
		return isSubstring(string1 + string1,string2);
	}

	private static boolean isSubstring(String s1, String s2) {
		if(s1.length() < s2.length()){
			return false;
		}

		if(s1.length() == s2.length()){
			return s1.equals(s2);
		}

		for(int i=0;i<=s1.length()-s2.length();i++){
			if(s1.charAt(i)==s2.charAt(0)){
				int matchLength=1;
				for(int j=1; j<s2.length(); j++){
					if(s1.charAt(i+j)!=s2.charAt(j)){
						break;
					}
					matchLength++;
				}
				if(matchLength==s2.length()) 
					return true;
			}
		}
		return false;
	}

}
