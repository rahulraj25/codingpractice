package practice.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentObject{
	
	private int id;
	private String name;
	private int marksPhysics;
	private int marksChemistry;
	private int marksMaths;
	
	public StudentObject() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentObject(int marksPhysics, int marksChemistry, int marksMaths) {
		super();
		this.marksPhysics = marksPhysics;
		this.marksChemistry = marksChemistry;
		this.marksMaths = marksMaths;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarksPhysics() {
		return marksPhysics;
	}
	public void setMarksPhysics(int marksPhysics) {
		this.marksPhysics = marksPhysics;
	}
	public int getMarksChemistry() {
		return marksChemistry;
	}
	public void setMarksChemistry(int marksChemistry) {
		this.marksChemistry = marksChemistry;
	}
	public int getMarksMaths() {
		return marksMaths;
	}
	public void setMarksMaths(int marksMaths) {
		this.marksMaths = marksMaths;
	}
	

	@Override
	public String toString() {
		return "Student [marksPhysics=" + marksPhysics + ", marksChemistry="
				+ marksChemistry + ", marksMaths=" + marksMaths + "]";
	}


	public static List<StudentObject> sortStudents(List<StudentObject> toSort){
		Collections.sort(toSort,new StudentComparator());
		return toSort;		
	}
	
	public static void main(String[] args) {
		List<StudentObject> list = new ArrayList<StudentObject>();
		list.add(new StudentObject(10,20,30));
		list.add(new StudentObject(20,10,30));
		list.add(new StudentObject(30,10,20));
		list.add(new StudentObject(30,30,20));
		list.add(new StudentObject(30,30,10));
		list.forEach(a -> System.out.println(a));
		sortStudents(list);
		System.out.println("----------------------------------------------");
		list.forEach(a -> System.out.println(a));
	}
}