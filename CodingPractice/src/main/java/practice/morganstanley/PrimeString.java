package practice.morganstanley;

public class PrimeString {
	public static int countPrimeStrings(String s) {
			int length = s.length();
			return recursivelyCountPrimeSplits(s,length);
	    }
	
	private static int recursivelyCountPrimeSplits(String s, int length) {
		if(length == 0)
			return 1;
		int counter = 0;
		
		for(int i=1; i<=6;i++){
			
			if(length - i >=0 && s.charAt(length - i) != '0' && isPrimeNumber(s.substring(length-i,length))){
				counter += recursivelyCountPrimeSplits(s, length-i);
				
				counter = counter % 1000000007;
			}
		}
		
		return counter;
	}

	static boolean isPrimeNumber(String s) 
	{ 
	    int num = Integer.valueOf(s); 
	      
	    for(int i = 2; i * i <= num; i++) 
	    { 
	       if ((num % i) == 0) 
	           return false; 
	    }
	    
	    return (num > 1) ? true : false; 
	} 
}
