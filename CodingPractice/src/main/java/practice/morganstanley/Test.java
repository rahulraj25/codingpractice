package practice.morganstanley;

public class Test {
//final int x;


public static void main(String[] args) {
	final int ti =1;
	//System.out.println(ti++ == 2);
	
	Integer i = 200;
	Integer j = 200;
	
	System.out.println(i ==j);
	
	Float f1 = new Float("3.0"); 
	int x = f1.intValue();
	byte y = f1.byteValue();
	double z = f1.doubleValue();
	
	System.out.println(x + y + z);
}
}
