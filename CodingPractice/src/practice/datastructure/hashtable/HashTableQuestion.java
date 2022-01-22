package hackerrank.hashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableQuestion {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> magTable = new Hashtable<>();
        
        for (int i = 0; i < magazine.length; i++) {
			if(magTable.containsKey(magazine[i])){
				magTable.put(magazine[i], magTable.get(magazine[i])+1);
			}else{
				magTable.put(magazine[i], 1);
			}
		}
        
        magTable.entrySet().forEach(System.out::print);
        int count=0;
        
        for (int i = 0; i < note.length; i++) {
			if(magTable.containsKey(note[i]) && magTable.get(note[i])>0){
				magTable.put(note[i],magTable.get(note[i])-1);
				count++;
			}
		}
        
        if(count==note.length)
        	System.out.println("Yes");
        else
        	System.out.println("No");
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
