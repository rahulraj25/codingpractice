package miscellaneous;

public class FindNextLargerNumberFromDigitsSnippet {

	//4 digit number
	//next largest number 1040 
	//1400
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the 3rd digit from right
		
		//parse till end of number and find the next greater number
		
		//if none of numbers are great replace with 4th digit 
		int num = 2900;
		
		int thousand = num /1000;
		int hundred = (num /100) % 10;
		int tens = (num /10) % 10;
		int unit = num % 10;
		
		String newNum ="";
		
		if(tens > hundred){
			newNum = "" + thousand + tens + hundred + unit ;
		}
		else if(unit > hundred){
			newNum =  "" + thousand + unit + tens + hundred;
		}else{
			int arr[] = new int[3];
			//Arrays.sort();
			newNum = "" + hundred + thousand + tens + unit;
		}
		
		System.out.println(newNum);
	}

}
