package practice.datastructure.arrays;

public class FindShortenedVersionOfStringAAABBToA3B2 {
	
	public static void main(String[] args) {
		System.out.println(shortenedVersionOfStringIfPossible("AAAABBBCCCCCCCC"));
		System.out.println(shortenedVersionOfStringIfPossible("ABBBCCCAACCCCC"));
		System.out.println(shortenedVersionOfStringIfPossible("RAHUL"));
	}

	private static String shortenedVersionOfStringIfPossible(String inputString) {
		
		StringBuilder shortenedString = new StringBuilder();
		int j = 0;
		int counter = 0;
		char[] charArray = inputString.toCharArray();
		
		for (int i = 0; i < charArray.length-1; i=j+1) {
			shortenedString.append(charArray[i]);
			j=i;
			counter=1;
			
			while(j!= charArray.length-1 && charArray[j+1] == charArray[j]){
				counter++;
				j++;
			}
			shortenedString.append(counter);
		}
		
		 
		return (shortenedString.toString().length() > inputString.length() )? inputString : shortenedString.toString();
	}

}
