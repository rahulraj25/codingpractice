package bnymellon;

import java.util.ArrayList;
import java.util.List;

public class CorrespondingStringSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();

		a.add("ab"); a.add("cd");  a.add("ef");
		b.add("af"); b.add("ee");  b.add("ef"); 
				a.add("hello"); a.add("hi");
				b.add("world"); b.add("bye"); 

		commonSubstring(a, b);
	}

	public static void commonSubstring(List<String> a, List<String> b) {

		for (int i = 0; i < a.size(); i++) {

			System.out.println(isSubString(a.get(i),b.get(i)));
			System.out.println(isSubStringBetterApproach(a.get(i),b.get(i)));
			System.out.println("---");
		}

	}

	private static String isSubString(String string1, String string2) {

		for (int i = 0; i < string1.length(); i++) {
			for(int j=i+1 ; j< string1.length() ; j++){
				if(string2.contains(string1.substring(i, j))){

					return "YES";
				}
			}

		}

		return "NO";
	}
	private static String isSubStringBetterApproach(String string1, String string2) {

		for (int i=0; i < string1.length(); i++) {
			
			if(string2.indexOf(string1.charAt(i)) != -1){
				return "YES";
			}
			
		}

		return "NO";
	}

}
