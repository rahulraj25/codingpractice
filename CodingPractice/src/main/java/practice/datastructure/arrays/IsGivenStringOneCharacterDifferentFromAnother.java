package practice.datastructure.arrays;

public class IsGivenStringOneCharacterDifferentFromAnother {

	public static void main(String[] args) {
		System.out.println(areStringsOneCharacterOperationApart("pall","ball"));
		System.out.println(areStringsOneCharacterOperationApart("pall","palls"));
		System.out.println(areStringsOneCharacterOperationApart("pales","pale"));
		System.out.println(areStringsOneCharacterOperationApart("pale","bake"));
		System.out.println(areStringsOneCharacterOperationApart("ple","pale"));
	}

	//Should return true when pall, ball
	//Should return true when pall, palls
	//Should return true when pales, pale
	//Should return false when pale, bake
	private static boolean areStringsOneCharacterOperationApart(String stringOne, String stringTwo) {

		int stringOneLength = stringOne.length();
		int stringTwoLength = stringTwo.length();
		
		if(stringOneLength != stringTwoLength){
			if(stringOneLength - stringTwoLength == 1){
				return areStringsOneCharacterOperationApartWhenLengthDiffer(stringOne, stringTwo);
			}else if(stringOneLength - stringTwoLength == -1){
				return areStringsOneCharacterOperationApartWhenLengthDiffer(stringTwo, stringOne);
			}else{
				return false;
			}
		}
		else{
			int mismatchCounter=0;
			for(int i=0;i<stringOne.length() ; i++){
				if(stringOne.charAt(i) != stringTwo.charAt(i)){
					if(++mismatchCounter > 1)
						return false;
				}
			}
			
			return true;
		}
	}


	private static boolean areStringsOneCharacterOperationApartWhenLengthDiffer(String largerString, String smallerString) {
		int mismatchCounter=0;
		for(int i=0, j= 0;i<smallerString.length() ; i++ ,j++){
			if(smallerString.charAt(i) != largerString.charAt(j)){
				j++;
				if(++mismatchCounter > 1)
					return false;
			}
		}
		return true;
	}


}
