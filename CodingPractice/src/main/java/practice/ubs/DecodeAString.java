package practice.ubs;

public class DecodeAString {

	public static void main(String[] args) {
		System.out.println(decodeString(3, "mnes__ya_____mi"));
		//System.out.println(decodeString(2, "hlowrd_el_ol"));
	}
	 public static String decodeString(int numberOfRows, String encodedString) {
		 
		    int len = encodedString.length();
		    int step = len / numberOfRows;
		    
		    StringBuilder builder = new StringBuilder();
		    int pos = 0;
		    int init= 0;
		    while(builder.length()<=len){
		    	
		        builder.append(encodedString.charAt(pos)=='_'? ' ': encodedString.charAt(pos));
		        pos = pos + step + 1;
		        
		        if(pos >= len){
		        	init++;
		        	pos = init;
		        }
		    }
		    
		    int buildLength = builder.length();
		    return builder.toString().substring(0,buildLength-step).trim();
	}
}
