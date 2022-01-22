package practice.datastructure.arrays;

import java.util.Arrays;

public class ReplaceAllSpacesWithPercentile20WithoutStringReplace {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString("Mr John Smith    ".toCharArray()));
		System.out.println(Arrays.toString(urlify("Mr John Smith    ",13)));
	}

	private static char[] urlify(String string, int trueLength) {
		char[] arr = string.toCharArray();
		
		int frontPointer = trueLength -1;
		int backPointer = string.length() -1;
		
		while(frontPointer != backPointer){
			for (int i = frontPointer ; arr[i] !=' '; i--) {
				arr[backPointer] = arr[frontPointer];
				frontPointer--;
				backPointer--;
			}
			arr[backPointer--]='0';
			arr[backPointer--]='2';
			arr[backPointer--]='%';
			frontPointer--;
		}
		
		return arr;
		
	}
	
	
}
