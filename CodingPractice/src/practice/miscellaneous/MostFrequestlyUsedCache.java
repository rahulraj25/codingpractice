package miscellaneous;
public class MostFrequestlyUsedCache {

	public static void main(String[] args) {
		
		System.out.println(maxSubstring("baca"));
	}
	
	
public static String maxSubstring(String s) {
        
        String maxSubString = "A";
        String str = "A";
        
        for(int i=0;i< s.length();i++){
            for(int j=i;j< s.length();j++){
                str = s.substring(i, j+1);
                
                //System.out.println(str);
                
                if(str.compareTo(maxSubString) > 0){
                    maxSubString = str;
                }
            }
        }
        
        return maxSubString;

    }
	
	
	
}
