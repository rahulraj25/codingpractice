package miscellaneous;
import java.util.HashSet;

class HashSetSnippet {
	private String s;
	
	public HashSetSnippet(String s){
		this.s = s;
	}
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		HashSetSnippet snippet2 = new HashSetSnippet("demo");
		HashSetSnippet snippet21 = new HashSetSnippet("demo");
		String s1 = new String("demo");
		String s2 = new String("demo");
		set.add(snippet2);
		set.add(snippet21);
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	}
}
