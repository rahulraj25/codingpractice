package miscellaneous;
import java.util.HashMap;
import java.util.Map;

public class HashMapConceptTester {

	public static void main(String[] args) {

	Map<X,String> h = new HashMap<>();
		h.put(new X(), "");
		h.put(new X(), "");
		System.out.println(h.size());
	}
}

class X{
	private String str1 = "Rahul";
	private String str2 = "Raj";
	
	public int hashCode(){
		return this.str1.hashCode() + this.str2.hashCode();
	}
	
	public boolean equals(Object that){
		if(this.str1.equals(((X)that).str1) &&  this.str2.equals(((X)that).str2))
			return true;
		
		return false;
	}
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	
}
