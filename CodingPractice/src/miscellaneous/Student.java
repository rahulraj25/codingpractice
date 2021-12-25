package miscellaneous;

import java.util.ArrayList;
import java.util.List;


public class Student {
	
	int[] queue = new int[10];
	
	int top = 0;
	int bottom = 0;
	/*int roll;
	String name;
	
	private Student(){
		super();
		this.roll = 0;
		this.name = "";
	}
	
	public Student getInstance(){
		return new Student();
	}
	
	public Student getInstance(int roll, String name){
		return new Student(roll, name);
	}*/
	
	//insert 
	public void insert(int num){
		queue[++bottom] = num;
		
	}
	
		//get
	public int get(){
		int i = 1;
		
		int element = queue[0];
		
		while(i < queue.length-1){
			queue[i-1] = queue[i];
			i++;
		}
		
		queue[i] = 0;
		return element;
		
	}	 
	public static void main(String[] args) {
		/*List<String> list1 =  new ArrayList<>();
		List<String> list2 =  new ArrayList<>();
		
		list1.stream().allMatch(a -> list2.stream().anyMatch(b -> b.equals(a)));
		int i= 0;
		
		list2.stream().allMatch(a -> {
			
			return a.equals(list1.get(i++));
			
		});*/
		
		
	}
}
